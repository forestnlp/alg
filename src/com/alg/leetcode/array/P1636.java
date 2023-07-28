package com.alg.leetcode.array;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class P1636 {
    static class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();

            Map<Integer,Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int c1=  map.get(o1)-map.get(o2);
                    if(c1==0)
                        return o2-o1;
                    return c1;
                }
            });


            for(int n:nums){
                map.put(n,map.getOrDefault(n,0)+1);
            }
            treeMap.putAll(map);
            int i=0;
            for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()) {
                for(int k=0;k<entry.getValue();k++)
                    nums[i++] = entry.getKey();
            }

            return nums;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int [] ans = solution.frequencySort(new int[]{1,2,3,4,5,6,1,2,3,4});
            for(int a:ans) {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,1,2,2,2,3};
        int [] ans = new Solution().frequencySort(nums);
        for(int a:ans)
            System.out.println(a);
    }
}
