package com.alg.leetcode.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1436 {
    class Solution {
        public String destCity(List<List<String>> paths) {
            Map<String,String> map = new HashMap<>();
            for(List<String> path:paths) {
                map.put(path.get(0),path.get(1));
            }
            String city = paths.get(0).get(0);
            while (true) {
                if(map.containsKey(city))
                    city = map.get(city);
                else
                    return city;
            }
        }
    }
}
