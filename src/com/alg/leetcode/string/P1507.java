package com.alg.leetcode.string;

import java.util.Arrays;
import java.util.List;

public class P1507 {
    class Solution {
        public String reformatDate(String date) {
            String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            List<String> ls_months = Arrays.asList(months);
            String [] array = date.split("\\s");
            int day = Integer.parseInt(array[0].substring(0,array[0].length()-2));
            int month = ls_months.indexOf(array[1])+1;
            int year = Integer.parseInt(array[2]);
            String formateDate = String.format("%d-%02d-%02d",year,month,day);
            return formateDate;
        }
    }
}
