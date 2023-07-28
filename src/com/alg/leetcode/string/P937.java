package com.alg.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P937 {
    class Solution {
        public String[] reorderLogFiles(String[] logs) {
            List<String> letterlogs = new ArrayList<>();
            List<String> digitlogs = new ArrayList<>();
            for (String log : logs) {
                String [] strs = log.split("\\s");
                if(Character.isDigit(strs[1].charAt(0))) {
                    digitlogs.add(log);
                }
                else {
                    letterlogs.add(log);
                }
            }

            Collections.sort(letterlogs, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int pos1 = o1.indexOf(" ");
                    int pos2 = o2.indexOf(" ");
                    String lineno1 = o1.substring(0,pos1);
                    String lineno2 = o2.substring(0,pos2);
                    String log1 = o1.substring(pos1+1,o1.length());
                    String log2 = o2.substring(pos2+1,o2.length());
                    if(log1.equals(log2)) {
                        return lineno1.compareTo(lineno2);
                    }
                    else {
                        return log1.compareTo(log2);
                    }
                }
            });

            String[] ans = new String[logs.length];
            letterlogs.addAll(digitlogs);
            letterlogs.toArray(ans);
            return ans;
        }
    }
}
