package rp;
/* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ReverseProxy {

    Set<String> proxySet = new HashSet<>();
    List<String> proxyList = new ArrayList<>();
    private final ConcurrentHashMap<String, AtomicInteger> backendLoadMap = new ConcurrentHashMap<>();

    private final int MAXSIZE;
    private LoadStrategy strategy;

    ReverseProxy(int maxSize) {
        this.MAXSIZE = maxSize;
        this.strategy = new RandomStrategy();
    }

    public void setStrategy(LoadStrategy strategy) {
        this.strategy = strategy;
    }

    public synchronized boolean register(String url) {

        if (url == null || url.isEmpty()) {
            throw new RuntimeException("Backend name cannot be null or empty!");
        }

        if (proxySet.size() >= MAXSIZE) {
            throw new RuntimeException("Maximum size occupied!");
        }

        if (proxySet.add(url)) {
            proxyList.add(url);
            backendLoadMap.put(url, new AtomicInteger(0));
            System.out.println("Proxy successfully registered!");
            return true;
        }

        throw new RuntimeException("Proxy already registered!");

    }

    public synchronized String find() {
        if (proxySet.isEmpty()) {
            throw new RuntimeException("No proxy registered!");
        }

        return strategy.selectBackend(proxyList);

    }

    public synchronized void incrementLoad(String backend) {
        backendLoadMap.get(backend).incrementAndGet();
    }

    public synchronized void decrementLoad(String backend) {
        backendLoadMap.get(backend).updateAndGet(v -> Math.max(0, v - 1));
    }

    public Map<String, Integer> getBackendLoadMap() {
        Map<String, Integer> map = new HashMap<>();
        backendLoadMap.forEach((k, v) -> map.put(k, v.get()));
        return map;
    }
}
