package com.alg.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class P657 {
    class Solution {
        public boolean judgeCircle(String moves) {
            int [] xdirection = {0,0,-1,1};
            int [] ydirection = {1,-1,0,0};
            Map<Character,Integer> map = new HashMap<Character,Integer>(){{
                put('U',0);
                put('D',1);
                put('L',2);
                put('R',3);
            }};
            int dx=0,dy=0;
            for(char c : moves.toCharArray()) {
                int index = map.get(c);
                dx +=xdirection[index];
                dy +=ydirection[index];
            }
            if(dx==0&&dy==0) return true;
            return false;
        }
    }
}
