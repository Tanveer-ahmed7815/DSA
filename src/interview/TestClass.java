package interview;

/*
i/p: {"0000", "1011", "8001", "0802", "1001", "1000"}
o/p: {"0000", "1000", "1001", "1011", "8001", "0802"}
Sort the input string based on the result of its integer character sum
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {

        String[] input = {"0000", "1011", "8001", "0802", "1001", "1000"};
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            char[] charArray = input[i].toCharArray();
            int sum = 0;
            for (int j = 0; j < charArray.length; j++) {
                sum = sum + charArray[j];
            }
            map.put(input[i], sum);
        }

        // 0000, 0
        // 1011, 3

        String[] res = new String[input.length];

        Stream<Map.Entry<String, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        List<Map.Entry<String, Integer>> collect = sorted.collect(Collectors.toList());

        System.out.println(collect);
        //[0000=192, 1000=193, 1001=194, 1011=195, 8001=201, 0802=202]
        for(int i = 0; i< collect.size(); i++){
            res[i] = collect.get(i).getKey();
        }

        System.out.println(Arrays.toString(res));

    }
}
