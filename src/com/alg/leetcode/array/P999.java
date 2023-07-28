package com.alg.leetcode.array;

public class P999 {
    class Solution {
        public int numRookCaptures(char[][] board) {
            int p=0, q=0;
            int RN = board.length;
            int CN = board[0].length;
            for (int m = 0; m < RN; m++) {
                for (int n = 0; n < CN; n++) {
                    if (board[m][n] == 'R') {
                        p = m;
                        q = n;
                        break;
                    }
                }
            }

            int cnt = 0;

            int tp=p;
            while (tp<RN) {
                if(board[tp][q]=='B') break;
                else if(board[tp][q]=='p') {
                    cnt++;
                    break;
                }
                tp++;
            }

            tp=p;
            while (tp>=0) {
                if(board[tp][q]=='B') break;
                else if(board[tp][q]=='p') {
                    cnt++;
                    break;
                }
                tp--;
            }

            int tq=q;
            while (tq<CN) {
                if(board[p][tq]=='B') break;
                else if(board[p][tq]=='p') {
                    cnt++;
                    break;
                }
                tq++;
            }

            tq=q;
            while (tq>=0) {
                if(board[p][tq]=='B') break;
                else if(board[p][tq]=='p') {
                    cnt++;
                    break;
                }
                tq--;
            }

            return cnt;
        }
    }
}
