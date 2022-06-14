package com.alg.dog.stackqueue.randomset.leetcode710;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {

    int size = 0;
    Map<Integer, Integer> map;
    Random r ;
    public Solution(int n, int[] blacklist) {
        r = new Random();
        map = new HashMap<>();
        size = n - blacklist.length;
        for(int b:blacklist)
            map.put(b,666);

        int last = n-1;
        for(int b:blacklist){
            if(b>=size)
                continue;
            while (map.containsKey(last))
                last--;
            map.put(b,last);
            last--;
        }

    }

    public int pick() {
        int index = r.nextInt(size);
        if(map.containsKey(index))
            return map.get(index);
        return index;
    }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(n, blacklist);
     * int param_1 = obj.pick();
     */
}