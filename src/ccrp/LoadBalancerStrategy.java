package ccrp;

import java.util.List;

public interface LoadBalancerStrategy {

    String selectBackend(List<String> backends);

}
