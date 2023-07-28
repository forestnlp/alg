package com.alg.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class P929 {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<>();
            for(String email:emails) {
                String prefix = email.split("@")[0];
                String suffix = email.split("@")[1];
                prefix = prefix.replaceAll("\\.","");
                if(prefix.indexOf("+")>0) {
                    prefix = prefix.substring(0,prefix.indexOf("+"));
                }
                set.add(prefix+"@"+suffix);
            }
            return set.size();
        }
    }
}
