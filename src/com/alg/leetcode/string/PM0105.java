package com.alg.leetcode.string;

public class PM0105 {
    static class Solution {
        public boolean oneEditAway(String first, String second) {
            int diffcnt = Math.abs(first.length() - second.length());
            if (diffcnt > 1)
                return false;
            else if (diffcnt == 1) {
                String longer = first.length() > second.length() ? first : second;
                String shorter = first.length() > second.length() ? second : first;
                boolean inserted = false;
                for (int i = 0, j = 0; i < shorter.length(); ) {
                    if (shorter.charAt(i) != longer.charAt(j)) {
                        if (!inserted) {
                            j++;
                            inserted = true;
                        } else {
                            return false;
                        }
                    } else {
                        i++;
                        j++;
                    }
                }
            } else {
                boolean changed = false;
                for (int i = 0; i < first.length(); i++) {
                    if (!changed) {
                        if (first.charAt(i) != second.charAt(i)) {
                            changed = true;
                        }
                    } else {
                        if (first.charAt(i) != second.charAt(i)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.oneEditAway("teacher", "bleacher");
        System.out.println(b);
    }
}
