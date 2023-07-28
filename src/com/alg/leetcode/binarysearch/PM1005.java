package com.alg.leetcode.binarysearch;

import java.util.Arrays;

public class PM1005 {
    class Solution {
        public int findString(String[] words, String s) {
            if (words == null) return -1;
            int start = 0, end = words.length-1;
            while (start <= end) {

                int mid = start + (end - start) / 2;

                int p = mid, q = mid;
                while (words[p].equals("") && p > start) p--;
                while (words[q].equals("") && q < end) q++;
                if (p >= 0) mid = p;
                else mid = q;

                if (s.compareTo(words[mid]) > 0) start = mid + 1;
                else if (s.compareTo(words[mid]) < 0) end = mid - 1;
                else return mid;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        String[] words = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String s = "ta";
        Solution solution = new PM1005().new Solution();
        int index = solution.findString(words,s);
        System.out.println(index);
    }
}
