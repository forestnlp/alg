package com.alg.sword.jz59;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(num==null||num.length==0) return ans;

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        int to= size-1;
        for(int i=0;i<=to;i++){
            pq.offer(num[i]);
        }
        ans.add(pq.peek());

        while (to<num.length-1){
            to++;
            pq.offer(num[to]);
            pq.remove(num[to-size]);
            ans.add(pq.peek());
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().maxInWindows(new int[]{10,2,3,1,4},3));
    }
}