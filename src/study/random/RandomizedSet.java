package study.random;

import java.util.*;

public class RandomizedSet {

    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand = new Random();

    //https://leetcode.com/explore/featured/card/google/65/design-4/3093/
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int lastItem = list.get(list.size()-1);
        int deletingIndex = map.get(val);
        list.set(deletingIndex, lastItem);
        map.put(lastItem, deletingIndex);
        map.remove(val);
        list.remove(list.size()-1);

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

