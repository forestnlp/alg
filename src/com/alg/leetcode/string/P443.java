package com.alg.leetcode.string;


//i feel a little hard for this problem
public class P443 {
    class Solution {
        public int compress(char[] chars) {
            int anchor = 0,write=0;
            for(int read=0;read<chars.length;read++) {
                if(read==chars.length-1||chars[read+1]!=chars[read]){
                    chars[write++] = chars[anchor];
                    if(read>anchor) {
                        for(char c:String.valueOf(read-anchor+1).toCharArray()) {
                            chars[write++] = c;
                        }
                    }
                    anchor = read+1;
                }
            }
            return write;
        }
    }
}
