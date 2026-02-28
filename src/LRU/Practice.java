package LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice<K, V> {
    private final int capacity;
    private final Map<K, V> map;

    public Practice(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    public void put(K key, V value){
        map.put(key, value);
    }

    public V get(K key){
       return map.get(key);
    }

    public static void main(String[] args) {
        Practice<Integer, String> practice = new Practice<>(2);
        practice.put(1, "Tanveer");
        practice.put(2, "Ahmed");
        System.out.println(practice.get(1));
        practice.put(3, "Ria");
        System.out.println(practice.get(2));
    }
}
