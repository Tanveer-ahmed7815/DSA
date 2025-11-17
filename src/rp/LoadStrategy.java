package rp;

import java.util.List;

public interface LoadStrategy {

    String selectBackend(List<String> backends);

}
