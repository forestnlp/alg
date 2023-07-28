package com.alg.leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class P412 {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> ans = new ArrayList<>();
            for(int i=1;i<=n;i++) {
                String e ="";
                boolean mod3,mod5;
                mod3=(i%3==0);
                mod5=(i%5==0);
                if(mod3&&mod5){
                    e = "FizzBuzz";
                }
                else if(mod3){
                    e = "Fizz";
                }
                else if(mod5){
                    e = "Buzz";
                }
                else {
                    e = ""+i;
                }
                ans.add(e);
            }
            return ans;
        }
    }
}
