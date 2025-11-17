package ccrp;
/* Created by ayesh on 17-11-2025 */

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class WeightedRandomStrategy implements LoadBalancerStrategy {

    private final Map<String, Integer> weightMap;

    public WeightedRandomStrategy(Map<String, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    @Override
    public String selectBackend(List<String> backends) {
        if (backends.isEmpty()) throw new IllegalStateException("No backends available");

        int totalWeight = 0;
        for (String backend : backends) {
            totalWeight += weightMap.getOrDefault(backend, 1);
        }

        int random = ThreadLocalRandom.current().nextInt(totalWeight);

        for (String backend : backends) {
            random -= weightMap.getOrDefault(backend, 1);
            if (random < 0) {
                return backend;
            }
        }
        return backends.get(backends.size() - 1);
    }
}
