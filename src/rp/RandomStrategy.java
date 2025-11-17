package rp;
/*
 */

import java.util.List;
import java.util.Random;

public class RandomStrategy implements LoadStrategy {

    private final Random random = new Random();

    @Override
    public String selectBackend(List<String> backends) {
        return backends.get(random.nextInt(backends.size()));
    }
}
