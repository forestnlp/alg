package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P705 {


    class Bucket{
        private List<Integer> list;

        public Bucket() {
            list = new LinkedList<>();
        }

        public void add(int key) {
            if(!list.contains(key))
                list.add(key);
        }

        public void remove(int key) {
            for(int i=0;i<list.size();i++) {
                if(list.get(i)==key)
                    list.remove(i);
            }
        }

        public boolean contains(int key) {
            return list.contains(key);
        }
    }

    class MyHashSet {

        /** Initialize your data structure here. */
        int initCapcity = 128;
        List<Bucket> buckets;
        public MyHashSet() {
            buckets  = new ArrayList<>(initCapcity);
            for(int i=0;i<initCapcity;i++) {
                buckets.add(new Bucket());
            }
        }

        public void add(int key) {
            int index = key%initCapcity;
            buckets.get(index).add(key);
        }

        public void remove(int key) {
            int index = key%initCapcity;
            buckets.get(index).remove(key);
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int index = key%initCapcity;
            return  buckets.get(index).contains(key);
        }
    }

    public static void main(String[] args) {
        MyHashSet set = new P705().new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
    }
}
