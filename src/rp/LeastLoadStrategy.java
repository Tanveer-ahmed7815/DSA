package rp;
/* Created by ayesh on 16-11-2025 */

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class LeastLoadStrategy implements LoadStrategy {

    private final Map<String, Integer> backendLoadMap;

    public LeastLoadStrategy(Map<String, Integer> backendLoadMap) {
        this.backendLoadMap = backendLoadMap;
    }

    @Override
    public String selectBackend(List<String> backends) {

        return backends.stream().min(Comparator.comparing(backendLoadMap::get))
                .orElseThrow(() -> new RuntimeException("No Backend found"));
    }
}
