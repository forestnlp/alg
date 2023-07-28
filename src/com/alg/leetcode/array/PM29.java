package com.alg.leetcode.array;

public class PM29 {
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            //validate
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[0];
            //definition
            int row = matrix.length, col = matrix[0].length;
            int left = 0, top = 0, right = col - 1, bottom = row - 1;
            int [] ans = new int[row*col];
            int index = 0;
            //visit
            while (left<=right && top<=bottom) {
                for(int i=left;i<=right;i++) {
                    ans[index++] = matrix[top][i];
                }

                for(int i=top+1;i<=bottom;i++) {
                    ans[index++] = matrix[i][right];
                }

                if(left<right&&top<bottom) {
                    for(int i=right-1;i>=left;i--) {
                        ans[index++] = matrix[bottom][i];
                    }
                    for(int i=bottom-1;i>top;i--) {
                        ans[index++] = matrix[i][left];
                    }
                }

                left++;
                right--;
                top++;
                bottom--;
            }
            return ans;
        }
    }
}
