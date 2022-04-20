package com.alg.sword.jz49;

import java.util.*;

public class Solution2 {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        Set set = new HashSet<Long>();
        PriorityQueue<Long> queue = new PriorityQueue<>();

        queue.offer(1L);
        set.add(1L);

        int [] coef = {2,3,5};

        int i = 0;
        while (i++<=index){
            long k = queue.poll();
            if(i==index) return (int)k;
            for(int co:coef){
                long cok = co*k;
                if(!set.contains(cok)){
                    queue.offer(cok);
                    set.add(cok);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().GetUglyNumber_Solution(1500));
    }
}