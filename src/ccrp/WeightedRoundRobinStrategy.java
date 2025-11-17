package ccrp;
/* Created by ayesh on 17-11-2025 */

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class WeightedRoundRobinStrategy implements LoadBalancerStrategy {

    private final Map<String, Integer> weightMap;
    private final AtomicInteger globalIndex = new AtomicInteger(0);

    public WeightedRoundRobinStrategy(Map<String, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    @Override
    public String selectBackend(List<String> backends) {
        if (backends.isEmpty()) throw new IllegalStateException("No backends available");

        int totalWeight = backends.stream()
                .mapToInt(b -> weightMap.getOrDefault(b, 1))
                .sum();

        int index = Math.abs(globalIndex.getAndIncrement() % totalWeight);

        for (String backend : backends) {
            index -= weightMap.getOrDefault(backend, 1);
            if (index < 0) {
                return backend;
            }
        }
        return backends.get(backends.size() - 1);
    }
}