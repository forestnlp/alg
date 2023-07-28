package com.alg.leetcode.array;

public class P849 {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int zeronum = 0 ;
            int maxzeronum =0;

            int left = 0;
            while (seats[left]==0){
                left++;
            }

            int right = seats.length-1;
            while (seats[right]==0){
                right--;
            }

            for(int i=0;i<seats.length;i++) {
                while (i<seats.length&&seats[i]==0) {
                    i++;
                    zeronum++;
                }
                maxzeronum = Math.max(zeronum,maxzeronum);
                zeronum = 0;
            }
            return Math.max((maxzeronum+1)/2,Math.max(left,seats.length-right-1));
        }
    }

    public static void main(String[] args) {
        Solution solution = new P849().new Solution();
        int dis = solution.maxDistToClosest(new int[]{1,0,0,0,1,0,1});
        System.out.println(dis);
    }
}
