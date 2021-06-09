package study.random;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private Map<Integer, Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.remove(key);
            cache.put(key, value);
            return value;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (!cache.containsKey(key) && cache.size() == capacity) {
            cache.remove(cache.keySet().iterator().next());
        } else if (cache.containsKey(key)) {
            cache.remove(key);
        }

        LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        cache.put(key, value);
    }
}
