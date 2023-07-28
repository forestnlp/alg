package com.alg.leetcode.queue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P1387M {
    static class Solution {

         class Data{
             private int number;
             private int weight;

             public Data(int number, int weight) {
                 this.number = number;
                 this.weight = weight;
             }
         }

         Map<Integer,Integer> map = new HashMap<>();
         PriorityQueue<Data> pq = new PriorityQueue<>(new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                int c =  o1.weight-o2.weight;
                if(c==0)
                    return o1.number-o2.number;
                return c;
            }
        });
        public int getKth(int lo, int hi, int k) {
            for(int i=lo;i<=hi;i++){
                pq.offer(new Data(i,getWeight(i)));
            }
            for(int i=0;i<k-1;i++){
                pq.poll();
            }
            return pq.poll().number;
        }

        public int getWeight(int n){
            if(map.containsKey(n)) return map.get(n);
            if(n==1) return 0;
            if((n&1)==0) return 1+getWeight(n>>1);
            return 1+getWeight(3*n+1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getKth(1,1000,777));
    }
}
