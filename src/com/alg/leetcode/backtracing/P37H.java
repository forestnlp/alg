package com.alg.leetcode.backtracing;

public class P37H {
    class Solution {
        public void solveSudoku(char[][] board) {
            backtracing(board, 0, 0);
        }

        public boolean backtracing(char[][] board, int row, int col) {

            if (row == board.length) return true;

            if (col == board.length)
                return backtracing(board, row + 1, 0);

            if (board[row][col] != '.')
                return backtracing(board, row, col + 1);

            for (char i = '1'; i <= '9'; i++) {
                if (!isvalid(board, row, col, i)) continue;
                board[row][col] = i;
                if (backtracing(board, row, col)) return true;
                board[row][col] = '.';
            }
            return false;
        }

        public boolean isvalid(char[][] board, int row, int col, char c) {
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == c) return false;
                if (board[row][i] == c) return false;
                if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
            }
            return true;
        }
    }

}
