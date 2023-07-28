package com.alg.leetcode.string;

public class P1360 {
    static class Solution {
        public int daysBetweenDates(String date1, String date2) {
            return Math.abs(days(date1) - days(date2));
        }

        public int days(String date) {
            int[] days_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] elements_date = date.split("-");
            int year = Integer.parseInt(elements_date[0]);
            int month = Integer.parseInt(elements_date[1]);
            int day = Integer.parseInt(elements_date[2]);

            int total = 0;

            for (int i = 1970; i < year; i++) {
                total += 365;
                if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) total++;
            }

            for (int i = 0; i < month - 1; i++) {
                total += days_months[i];
                if(i==1) {
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) total++;
                }
            }

            total += day;

            return total;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.daysBetweenDates("2020-01-15","2019-12-31"));
    }
}
