package LRU;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCache<K, V> {

    private class CacheEntry<V> {
        V value;
        long expiryTime;

        CacheEntry(V value, long ttlMillies) {
            this.value = value;
            this.expiryTime = ttlMillies > 0 ? System.currentTimeMillis() + ttlMillies : -1;
        }

        public boolean isExpired() {
            return expiryTime != -1 && System.currentTimeMillis() > expiryTime;
        }
    }

    private final ConcurrentHashMap<K, CacheEntry<V>> cache = new ConcurrentHashMap<>();

    public void put(K key, V value) {
        cache.put(key, new CacheEntry<>(value, -1));
    }

    public void put(K key, V value, long ttlMillies) {
        cache.put(key, new CacheEntry<>(value, ttlMillies));
    }

    public V get(K key) {
        CacheEntry<V> vCacheEntry = cache.get(key);
        if (vCacheEntry == null) {
            return null;
        }

        if (vCacheEntry.isExpired()) {
            cache.remove(key);
            return null;
        }
        return vCacheEntry.value;
    }

    public static void main(String[] args) throws InterruptedException {
        InMemoryCache<Integer, String> inMemoryCache = new InMemoryCache<>();
        inMemoryCache.put(1, "Tanveer");
        System.out.println(inMemoryCache.get(1));
        inMemoryCache.put(2, "Ahmed", 2000);
        Thread.sleep(2500);

        System.out.println(inMemoryCache.get(2));
    }
}
