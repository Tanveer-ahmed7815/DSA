package Test;
/* Created by ayesh on 11-11-2025 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {
        //create one map which will have name and salaries, sort them in reverse order

        Map<String, Double> map = new HashMap<>();
        map.put("John", 1500.00);
        map.put("Rohan", 100.00);
        map.put("Abhishek", 1000.00);
        map.put("Atul", 1400.00);
        map.put("Tanveer", 1100.00);

        System.out.println(map);
//        Map<String, Double> res = new HashMap<>();
//        map.entrySet().stream().sorted((a,b) -> ((int) (b.getValue() - a.getValue()))).map(x -> res.put(x.getKey(), x.getValue()));


        List<String> list = map.entrySet().stream()
                .map(x -> x.getKey()).toList();
        System.out.println(list);

        Map<String, Double> sortedBySalaryDesc = map.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedBySalaryDesc);
//
//        list.stream().sorted().toList();
        List<String> list1 = list.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(list1);

        String s = "Hello";
        HashMap<Character, Integer> findRep = new HashMap<>();

        s.chars().forEach(c -> findRep.put((char) c, findRep.getOrDefault((char) c, 0) +1));

        Character key = findRep.entrySet().stream().filter(x -> findRep.get(x.getKey()) > 1).findFirst().get().getKey();
        System.out.println(key);


    }
}
