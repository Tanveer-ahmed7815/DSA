package ccrp;
/* Created by ayesh on 17-11-2025 */

public class ReverseProxyDemo {

    public static void main(String[] args) {

        ReverseProxy proxy = new ReverseProxy(5);

        proxy.register("backend-A", 5);   // High weight
        proxy.register("backend-B", 3);
        proxy.register("backend-C", 1);   // Low weight

        // Switch to weighted random
        proxy.setStrategy(new WeightedRandomStrategy(proxy.getWeights()));

        System.out.println("Weighted Random Selection:");
        for (int i = 0; i < 10; i++) {
            System.out.println(proxy.find());
        }

        // Switch to weighted round robin
        proxy.setStrategy(new WeightedRoundRobinStrategy(proxy.getWeights()));

        System.out.println("\nWeighted Round Robin:");
        for (int i = 0; i < 10; i++) {
            System.out.println(proxy.find());
        }
    }
}