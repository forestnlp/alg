package com.alg.leetcode.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P706 {

    class Bucket{

        class Entry{
            int key;
            int val;
            public Entry(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }

        private List<Entry> entries;

        public Bucket() {
            entries = new LinkedList<>();
        }

        public void put(int key,int val) {
            boolean exits = false;
            for (Entry entry : entries) {
                if (entry.key == key) {
                    entry.val = val;
                    exits = true;
                }
            }
            if(!exits)
                entries.add(new Entry(key,val));
        }

        public int get(int key) {
            for(Entry entry:entries) {
                if(entry.key==key)
                    return entry.val;
            }
            return -1;
        }

        public void remove(int key) {
            for(int i=0;i<entries.size();i++) {
                if(entries.get(i).key==key)
                    entries.remove(i);
            }
        }
    }

    class MyHashMap {

        List<Bucket> storage;
        int initCapacity = 128;
        /** Initialize your data structure here. */
        public MyHashMap() {
            storage = new ArrayList<>(initCapacity);
            for(int i=0;i<initCapacity;i++) {
                storage.add(new Bucket());
            }
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int index = key%initCapacity;
            Bucket bucket = storage.get(index);
            bucket.put(key,value);
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int index = key%initCapacity;
            Bucket bucket = storage.get(index);
            return bucket.get(key);
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int index = key%initCapacity;
            Bucket bucket = storage.get(index);
            bucket.remove(key);
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}
