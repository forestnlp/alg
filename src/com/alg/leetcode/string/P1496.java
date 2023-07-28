package com.alg.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class P1496 {

    class Solution {
        public boolean isPathCrossing(String path) {
            char[] paths = path.toCharArray();
            Set<String> history = new HashSet<>();
            history.add("0,0");
            int dx = 0, dy = 0;
            for (char c : paths) {
                switch (c) {
                    case 'N':
                        dy++;
                        break;
                    case 'W':
                        dx--;
                        break;
                    case 'E':
                        dx++;
                        break;
                    case 'S':
                        dy--;
                        break;
                }
                if (history.contains(dx + "," + dy)) return true;
                history.add(dx + "," + dy);
            }
            return false;
        }
    }
}
