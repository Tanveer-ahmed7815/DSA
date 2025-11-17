package ccrp;
/* Created by ayesh on 17-11-2025 */

import rp.RandomStrategy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class ReverseProxy {

    private final Set<String> backendSet = ConcurrentHashMap.newKeySet();
    private final CopyOnWriteArrayList<String> backendList = new CopyOnWriteArrayList<>();
    private final ConcurrentHashMap<String, AtomicInteger> loadMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> weightMap = new ConcurrentHashMap<>();

    private volatile LoadBalancerStrategy strategy;
    private final int MAX_BACKENDS;

    public ReverseProxy(int maxBackends) {
        this.MAX_BACKENDS = maxBackends;
        this.strategy = new WeightedRandomStrategy(weightMap);  // default
    }

    // Register backend with weight
    public boolean register(String backend, int weight) {
        if (backend == null || backend.isEmpty())
            throw new IllegalArgumentException("Backend cannot be null/empty");

        if (backendSet.size() >= MAX_BACKENDS)
            return false;

        boolean added = backendSet.add(backend);
        if (added) {
            backendList.add(backend);
            loadMap.put(backend, new AtomicInteger(0));
            weightMap.put(backend, weight <= 0 ? 1 : weight);
        }
        return added;
    }

    public String find() {
        return strategy.selectBackend(backendList);
    }

    public void incrementLoad(String backend) {
        loadMap.get(backend).incrementAndGet();
    }

    public void decrementLoad(String backend) {
        loadMap.get(backend).updateAndGet(v -> Math.max(0, v - 1));
    }

    public void setStrategy(LoadBalancerStrategy strategy) {
        this.strategy = strategy;
    }

    public Map<String, Integer> getWeights() {
        return Collections.unmodifiableMap(weightMap);
    }

    public Map<String, Integer> getLoads() {
        Map<String, Integer> map = new HashMap<>();
        loadMap.forEach((k, v) -> map.put(k, v.get()));
        return map;
    }
}
