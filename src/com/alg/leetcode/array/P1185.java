package com.alg.leetcode.array;

import java.util.Calendar;

public class P1185 {
    class Solution {
        public String dayOfTheWeek(int day, int month, int year) {
            int total = 0;
            for(int y=1971;y<year;y++) {
                if(y%400==0||(y%4==0&&y%100!=0)) {
                    total+=366;
                }
                else
                    total+=365;
            }

            int[] days_Month_common = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            if(year%400==0||(year%4==0&&year%100!=0))
                days_Month_common[1] = 29;

            for(int m=0;m<month-1;m++) {
                total+=days_Month_common[m];
            }

            total+=day-1;

            int weekday = (4+total)%7;

            String[] weekdays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            return weekdays[weekday];
        }
    }
}
