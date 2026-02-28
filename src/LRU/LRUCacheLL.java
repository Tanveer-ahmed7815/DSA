package LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheLL<K, V> {

    private final int capacity;
    private final Map<K, V> map;

    public LRUCacheLL(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<K, V>(capacity, .75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    public V get(K key) {
        return map.getOrDefault(key, null);
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public int size() {
        return map.size();
    }

    public static void main(String[] args) {
        LRUCacheLL<Integer, String> lruCacheLL = new LRUCacheLL<>(2);
    }

}
