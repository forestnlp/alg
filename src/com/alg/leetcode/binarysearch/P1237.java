package com.alg.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1237 {
    class CustomFunction {
        public int f(int x, int y) {
            return x + y;
        }
    }

    /*
    双指针
     */
    class Solution {
        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            int x=1,y=z;
            List<List<Integer>> ansList = new ArrayList<>();
            while(x<=z) {
                int a = guess(customfunction,x,y,z);
                if(a!=-1) {
                    y = a;
                    List<Integer> ans =new ArrayList<>();
                    ansList.add(Arrays.asList(x,y));
                }
                x++;
            }
            return ansList;
        }

        public int guess(CustomFunction customfunction,int x,int y,int z) {
            //在0-y之间猜
            int left = 1,right = y;
            while(left<=right) {
                int mid = left+(right-left)/2;
                if(customfunction.f(x,mid)>z)
                    right=mid-1;
                else if(customfunction.f(x,mid)<z)
                    left=mid+1;
                else
                    return mid;
            }
            return -1;
        }
    }
}
