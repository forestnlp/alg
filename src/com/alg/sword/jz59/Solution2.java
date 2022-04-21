package com.alg.sword.jz59;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {

    class MyQueue{
        private ArrayDeque<Integer> queue = new ArrayDeque<>();
        public void push(int n ){
            while (!queue.isEmpty()&&queue.peekLast()<n){
                queue.pollLast();
            }
            queue.offerLast(n);
        }

        public int max(){
            return queue.peekFirst();
        }

        public void pop(int n){
            if(!queue.isEmpty()&&queue.peekFirst()==n){
                queue.pollFirst();
            }
        }
    }
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        MyQueue window = new MyQueue();
        for(int i=0;i<num.length;i++){
            if(i<size-1){
                window.push(num[i]);
            }
            else {
                window.push(num[i]);
                ans.add(window.max());
                window.pop(num[i-size+1]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().maxInWindows(new int[]{10,2,3,1,4},3));
    }
}