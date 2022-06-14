package com.alg.dog.stackqueue.lfu.leetcode460;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Solution {

    class LFUCache {

        Map<Integer, Integer> key2Val;
        Map<Integer, Integer> key2Freq;
        Map<Integer, LinkedHashSet<Integer>> freq2Keys;
        int minfreq;
        int cap;

        public LFUCache(int capacity) {
            this.cap = capacity;
            this.minfreq = 0;
            key2Val = new HashMap<>();
            key2Freq = new HashMap<>();
            freq2Keys = new HashMap<>();
        }

        public int get(int key) {
            if (!key2Val.containsKey(key)) {
                return -1;
            }
            increaseFreq(key);
            return key2Val.get(key);
        }

        public void put(int key, int value) {
            if (this.cap <= 0) return;
            if (key2Val.containsKey(key)) {
                key2Val.put(key, value);
                increaseFreq(key);
                return;
            }
            if (this.cap <= key2Val.size()) {
                removeMinFreqKey();
            }
            key2Val.put(key, value);
            key2Freq.put(key, 1);
            freq2Keys.putIfAbsent(1, new LinkedHashSet<>());
            freq2Keys.get(1).add(key);
            this.minfreq = 1;
        }

        private void removeMinFreqKey() {
            LinkedHashSet<Integer> keyList = freq2Keys.get(this.minfreq);
            int deletedKey = keyList.iterator().next();
            keyList.remove(deletedKey);
            if (keyList.isEmpty()) {
                freq2Keys.remove(this.minfreq);
            }
            key2Val.remove(deletedKey);
            key2Freq.remove(deletedKey);
        }

        private void increaseFreq(int key) {
            int freq = key2Freq.get(key);
            key2Freq.put(key, freq + 1);
            freq2Keys.get(freq).remove(key);
            freq2Keys.putIfAbsent(freq + 1, new LinkedHashSet<>());
            freq2Keys.get(freq + 1).add(key);
            if (freq2Keys.get(freq).isEmpty()) {
                freq2Keys.remove(freq);
                if (freq == this.minfreq) {
                    this.minfreq++;
                }
            }
        }
    }

    /**
     * Your LFUCache object will be instantiated and called as such:
     * LFUCache obj = new LFUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
