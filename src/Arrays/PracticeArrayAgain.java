package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
/*
Sun 10:00-20:00
Fri 05:00-10:00
Fri 16:30-23:50
Sat 10:00-13:00
Sun 01:00-07:00
Sat 02:00-06:00
Tue 03:30-18:15
Tue 19:00-20:00
Wed 04:25-15:14
Wed 15:14-22:40
Thu 00:00-23:59
Mon 05:00-13:00
Mon 15:00-21:00
 */

public class PracticeArrayAgain {

    public static CompletableFuture<String> fetchUser(){
        return CompletableFuture.supplyAsync(()->{
            sleep(2);
            return "User - Tanveer";
        });
    }

    public static CompletableFuture<String> fetchOrders(){
        return CompletableFuture.supplyAsync(()->{
            sleep(2);
            return "Order - Tanveer";
        });
    }

    private static void sleep(int i) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {


    }

    public int solution(String S) {
        List<int[]> meetings = new ArrayList<>();

        for (String line : S.split("\n")) {
            meetings.add(parseTime(line));
        }
        meetings.sort(Comparator.comparingInt(a -> a[0]));
        int maxSleep = 0;
        int prevEnd = 0;

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            maxSleep = Math.max(maxSleep, start - prevEnd);
            prevEnd = Math.max(prevEnd, end);
        }
        int endOfWeek = 7 * 24 * 60;
        maxSleep = Math.max(maxSleep, endOfWeek - prevEnd);

        return  maxSleep;
    }

    private int[] parseTime(String line) {
        //Mon 15:00-21:00
        String[] parts = line.split(" ");
        String day = parts[0];
        String[] times = parts[1].split("-");
        int start = toMinutes(day, times[0]);
        int end = toMinutes(day, times[1]);

        return new int[]{start, end};
    }

    private int toMinutes(String day, String time) {
        Map<String, Integer> dayOffset = Map.of(
                "Mon", 0, "Tue", 1440, "Wed", 2880,
                "Thu", 4320, "Fri", 5760, "Sat", 7200, "Sun", 8640
        );

        String[] hm = time.split(":");
        int minutes = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);
        return dayOffset.get(day) + minutes;
    }

}

