package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P811 {
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            List<String> ans = new ArrayList<>();

            Map<String,Integer> map = new HashMap<>();

            for(String cpd :cpdomains) {
                String[] msg = cpd.split("\\s");
                int times = Integer.parseInt(msg[0]);
                String[] domains = msg[1].split("\\.");
                String key = "";
                for(int i=domains.length-1;i>=0;i--) {
                    if(key.equals("")) key = domains[i];
                    else key=domains[i]+"."+key;
                    map.put(key,map.getOrDefault(key,0)+times);
                }
            }

            for(Map.Entry<String,Integer> entry:map.entrySet()) {
                ans.add(entry.getValue()+" "+entry.getKey());
            }

            return ans;
        }
    }
}
