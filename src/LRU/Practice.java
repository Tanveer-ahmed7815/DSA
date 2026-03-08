package LRU;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Practice<K, V> {

    private final int capacity;
    private final Map<K, V> map;

    Practice(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized int size() {
        return map.size();
    }

    public static void main(String[] args) {
        LRUCacheLL<Integer, String> lruCacheLL = new LRUCacheLL<>(2);
        lruCacheLL.put(1, "ABC");
        lruCacheLL.put(2, "AAA");

        System.out.println(lruCacheLL.get(2));

        lruCacheLL.put(3, "CCC");

        System.out.println(lruCacheLL.get(1));
    }
}
