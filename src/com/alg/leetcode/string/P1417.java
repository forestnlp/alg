package com.alg.leetcode.string;

public class P1417 {
    class Solution {
        public String reformat(String s) {

            char[] orignalChar = s.toCharArray();
            int letterCount = 0, digitCount = 0;
            for (int i = 0; i < orignalChar.length; i++) {
                if (Character.isDigit(orignalChar[i])) digitCount++;
                else letterCount++;
            }
            if (Math.abs(letterCount - digitCount) > 1) return "";

            char[] newArray = s.toCharArray();
            int firstIndex = 0, secondIndex = 1;

            if (letterCount > digitCount) {
                firstIndex = 1;
                secondIndex = 0;
            }

            for (int i = 0; i < orignalChar.length; i++) {
                if (Character.isDigit(orignalChar[i])) {
                    newArray[firstIndex] = orignalChar[i];
                    firstIndex+=2;
                } else {
                    newArray[secondIndex] = orignalChar[i];
                    secondIndex += 2;
                }
            }

            return new String(newArray);
        }
    }
}
