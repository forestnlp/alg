package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599 {
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            Map<String,Integer> map1 = new HashMap<>();
            Map<String,Integer> map2 = new HashMap<>();
            for(int i=0;i<list1.length;i++) {
                map1.put(list1[i],i);
            }

            for(int i=0;i<list2.length;i++) {
                if(map1.containsKey(list2[i]))
                    map2.put(list2[i],map1.get(list2[i])+i);
            }

            int min = Integer.MAX_VALUE;
            List<String> list = new ArrayList<>();
            for(Map.Entry<String,Integer> entry:map2.entrySet()){
                if(entry.getValue()<min) {
                    min = entry.getValue();
                    list.clear();
                    list.add(entry.getKey());
                }
                else if(entry.getValue()==min) {
                    list.add(entry.getKey());
                }
            }

            return list.toArray(new String[list.size()]);
        }
    }
}
