package com.alg.leetcode.math;

public class P1154 {
    class Solution {
        public int dayOfYear(String date) {
            int[] days_months = {31,28,31,30,31,30,31,31,30,31,30,31};
            String [] dates = date.split("-");
            int year = Integer.parseInt(dates[0]);
            int month = Integer.parseInt(dates[1]);
            int day = Integer.parseInt(dates[2]);

            int count = day;
            for(int i=0;i<month-1;i++) {
                count+=days_months[i];
            }

            if((year%4==0&&year%100!=0)||year%400==0) {
                if(month>2)count++;
            }

            return count;
        }
    }
}
