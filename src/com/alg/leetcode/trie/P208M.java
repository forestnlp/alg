package com.alg.leetcode.trie;

public class P208M {
    class Trie {

        /** Initialize your data structure here. */

        private Trie [] children ;
        boolean isEnd ;

        public Trie() {
            children = new Trie[26];
            isEnd = false;
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Trie node = this;
            for(int i=0;i<word.length();i++) {
                char c= word.charAt(i);
                int idx = c - 'a';
                if(node.children[idx]==null) {
                    node.children[idx] = new Trie();
                }
                node = node.children[idx];
            }
            node.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Trie node = this;
            for(int i=0;i<word.length();i++) {
                char c = word.charAt(i);
                int idx = c - 'a';
                if(node.children[idx]!=null){
                    node = node.children[idx];
                }
                else {
                    return false;
                }
            }
            return node.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Trie node = this;
            for(int i=0;i<prefix.length();i++) {
                char c = prefix.charAt(i);
                int idx = c - 'a';
                if(node.children[idx]!=null){
                    node = node.children[idx];
                }
                else {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Your Trie object will be instantiated and called as such:
     * Trie obj = new Trie();
     * obj.insert(word);
     * boolean param_2 = obj.search(word);
     * boolean param_3 = obj.startsWith(prefix);
     */
}
