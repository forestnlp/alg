package com.alg.leetcode.greedy;

public class P860 {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int bucket5=0,bucket10=0;
            for(int i=0;i<bills.length;i++) {
                int bill = bills[i];
                if(bill==5) bucket5++;
                else if(bill==10) {
                    if(bucket5>0) {
                        bucket10++;
                        bucket5--;
                    }
                    else return false;
                }
                else if(bill==20) {
                    if(bucket10>0&&bucket5>0) {
                        bucket10--;
                        bucket5--;
                    }
                    else if(bucket5>=3){
                        bucket5-=3;
                    }
                    else {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int [] bills = {5,5,5,10,20};
        boolean rtn = new P860().new Solution().lemonadeChange(bills);
        System.out.println(rtn);
    }
}
