import java.util.LinkedList;

public class Cache {
    private int cacheSizeLimit;
    private LinkedList<Integer> cache;

    public Cache(int limit) {
        cache = new LinkedList<>();
        cacheSizeLimit = limit;
    }

    //MODIFIES: this
    //EFFECTS: Adds the value into the cache while maintaining FIFO insertion order and cache size
    public void put(int value) {
        if (cache.size() == cacheSizeLimit) {
            cache.removeFirst();
        }
        cache.add(value);
    }

    //EFFECTS: returns the value matching the target value as well as updating the order of the list
    public int get(int targetValue) {
        for (int i = 0; i < cacheSizeLimit; i++) {
            if (cache.get(i) == targetValue) {
                updateCache(i);
                return i;
            }
        }
        return -1;
    }

    //removes the f
    private void updateCache(int i) {
        int temp = cache.get(i);
        cache.remove(i);
        cache.add(temp);
    }

    public LinkedList<Integer> getCache() {
        return cache;
    }
}
