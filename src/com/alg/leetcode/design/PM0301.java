package com.alg.leetcode.design;

public class PM0301 {
    class TripleInOne {

        int [][] matrix;
        int [] pos = new int[]{-1,-1,-1};

        public TripleInOne(int stackSize) {
            matrix = new int[3][stackSize];
        }

        public void push(int stackNum, int value) {
            int [] stack = matrix[stackNum];
            int index = pos[stackNum]+1;
            if(index>=matrix[0].length) return;
            stack[index] = value;
            pos[stackNum] = index;
        }

        public int pop(int stackNum) {
            int [] stack = matrix[stackNum];
            int index = pos[stackNum];
            if(index<0) return -1;
            int ans = stack[index];
            index--;
            pos[stackNum] = index;
            return ans;
        }

        public int peek(int stackNum) {
            int [] stack = matrix[stackNum];
            int index = pos[stackNum];
            if(index<0) return -1;
            return stack[index];
        }

        public boolean isEmpty(int stackNum) {
            return pos[stackNum]==-1;
        }
    }


    public static void main(String[] args) {
        TripleInOne stack = new PM0301().new TripleInOne(3);
        stack.push(0,1);
        stack.push(0,2);
        int i = stack.pop(0);
        int k = stack.pop(0);
        System.out.println(i);
        System.out.println(k);
    }
}
