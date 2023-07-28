package com.alg.leetcode.binarysearch;

import java.util.*;

public class P392 {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            Map<Character, List<Integer>> map  = new HashMap<>();

            for(int i=65;i<=122;i++) {
                map.put((char)i,new ArrayList<>());
            }

            for(int i=0;i<t.length();i++) {
                map.get(t.charAt(i)).add(i);
            }

            int prePosition = -1;
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);
                List<Integer> indexList = map.get(c);
                int index = binarySearch(indexList,prePosition);
                //System.out.printf("index preindex %s %d %d\n",indexList,index,prePosition);
                if(index==-1) return false;
                else prePosition = index;
            }

            return true;
        }

        public int binarySearch(List<Integer> indexList,int prePosition) {
            int i=0,j=indexList.size();
            while (i<j) {
                int m = i+(j-i)/2;
                if(prePosition>=indexList.get(m)) i=m+1;
                else j=m;
            }
            return i>=indexList.size()?-1:indexList.get(i);
        }

        public int seqSearch(List<Integer> indexList,int prePosition) {
            for(int i=0;i<indexList.size();i++) {
                if(indexList.get(i)>prePosition) return indexList.get(i);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P392().new Solution();
        /*List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0));
        int i = solution.binarySearch(list,0);
        System.out.println(i);*/
        boolean b = solution.isSubsequence("acb","ahbgdc");
        System.out.println(b);
    }
}
