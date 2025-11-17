package rp;
/*  */

import java.util.List;

public class RoundRobinStrategy implements LoadStrategy {
    int counter = 0;

    @Override
    public String selectBackend(List<String> backends) {

        int i = counter % backends.size();
        counter++;
        return backends.get(i);
    }
}
