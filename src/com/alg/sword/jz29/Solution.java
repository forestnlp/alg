package com.alg.sword.jz29;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> records = new ArrayList<>();

        return records;
    }

    public void printSubMatrix(int[][] matrix, int start_row, int start_col, int end_row, int end_col, ArrayList<Integer> records) {
        for (int i = start_col; i <= end_col; i++) {
            records.add(matrix[start_row][i]);
        }
        for(int i=start_row;i<=end_row;i++) {
            records.add(matrix[i][end_col]);
        }
        for(int i=end_col;i>=start_col;i--) {
            records.add(matrix[end_row][i]);
        }
        for(int i=end_row;i>=start_row;i--) {
            records.add(matrix[i][start_col]);
        }
    }
}