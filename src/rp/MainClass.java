package rp;
/* Created by ayesh on 16-11-2025 */

public class MainClass {
    public static void main(String[] args) {
        ReverseProxy reverseProxy = new ReverseProxy(5);

        reverseProxy.register("http://localhost:8080/");
        reverseProxy.register("http://localhost:8081/");
        reverseProxy.register("http://localhost:8082/");
        reverseProxy.register("http://localhost:8083/");
        reverseProxy.register("http://localhost:8084/");

        reverseProxy.incrementLoad("http://localhost:8080/");
        reverseProxy.incrementLoad("http://localhost:8080/");
        reverseProxy.incrementLoad("http://localhost:8081/");
        reverseProxy.incrementLoad("http://localhost:8082/");
        reverseProxy.incrementLoad("http://localhost:8083/");

        //Random
//        System.out.println(reverseProxy.find());
//        System.out.println(reverseProxy.find());
//        System.out.println(reverseProxy.find());
//        System.out.println(reverseProxy.find());
//        System.out.println(reverseProxy.find());
//        System.out.println(reverseProxy.find());

//        System.out.println("-----------------------------------");
//        reverseProxy.setStrategy(new RoundRobinStrategy());
//        for (int i = 0; i < 10; i++) {
//            System.out.println(reverseProxy.find());
//        }

        System.out.println("-----------------------------------");

        reverseProxy.setStrategy(new LeastLoadStrategy(reverseProxy.getBackendLoadMap()));
        for (int i = 0; i < 5; i++) {
            String backend = reverseProxy.find();
            System.out.println("→ Selected: " + backend);
            reverseProxy.incrementLoad(backend);
        }

        System.out.println("\nUpdated Backend Loads: " + reverseProxy.getBackendLoadMap());

    }
}
