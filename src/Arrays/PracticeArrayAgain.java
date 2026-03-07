package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

//Input: nums = [1, 1, 2, 2, 3]
//Output: [1, 2, 3]
public class PracticeArrayAgain {

    public static void main(String[] args) {

        int[] num = {1, 1, 1, 2, 2, 2, 2, 3, 3, 3};

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            int count = map.getOrDefault(num[i], 0);
            if (count < 2) {
                list.add(num[i]);
                map.put(num[i], count + 1);
            }

        }


    }

}

