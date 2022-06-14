package com.alg.dog.stackqueue.randomset.leetcode380;

import java.util.*;

public class Solution {

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */

    class RandomizedSet {

        List<Integer> nums;
        Map<Integer, Integer> indexes;

        Random random;

        public RandomizedSet() {
            nums = new ArrayList<>();
            indexes = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (indexes.containsKey(val))
                return false;
            indexes.put(val, nums.size());
            nums.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!indexes.containsKey(val)) {
                return false;
            }
            int index = indexes.get(val);
            int last = nums.get(nums.size()-1);
            nums.set(index,last);
            indexes.put(last,index);
            nums.remove(nums.size()-1);
            indexes.remove(val);
            return true;
        }

        public int getRandom() {
            int i = random.nextInt(nums.size());
            return nums.get(i);
        }
    }
}
