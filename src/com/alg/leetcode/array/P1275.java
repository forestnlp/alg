package com.alg.leetcode.array;

import java.util.*;

public class P1275 {
    class Solution {

        List<List<Integer>> winnerlist = new ArrayList<>();

        public String tictactoe(int[][] moves) {
            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();
            for(int i=0;i<moves.length;i++) {
                if(i%2==0) {
                    A.add(moves[i][0]*3+moves[i][1]+1);
                }
                else {
                    B.add(moves[i][0]*3+moves[i][1]+1);
                }
            }

            initDictionary();
            if(winner(A)) return "A";
            else if(winner(B)) return "B";
            else if(moves.length==9) return "Draw";
            else return "Pending";
        }

        public void initDictionary () {
            winnerlist.add(Arrays.asList(1,2,3));
            winnerlist.add(Arrays.asList(4,5,6));
            winnerlist.add(Arrays.asList(7,8,9));
            winnerlist.add(Arrays.asList(1,4,7));
            winnerlist.add(Arrays.asList(2,5,8));
            winnerlist.add(Arrays.asList(3,6,9));
            winnerlist.add(Arrays.asList(1,5,9));
            winnerlist.add(Arrays.asList(3,5,7));

        }

        public boolean winner(List<Integer> list) {
            for(List<Integer> win:winnerlist) {
                if(list.containsAll(win)) return true;
            }
            return false;
        }
    }
}
