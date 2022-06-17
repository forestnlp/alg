package com.alg.dog.tree.leetcode315;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private class Pair{
        int val,id;

        public Pair(int val, int id) {
            this.val = val;
            this.id = id;
        }
    }

    private Pair[] temp;
    private int[] count;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        count = new int[n];
        temp = new Pair[n];
        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i],i);
        }

        sort(arr,0,n-1);

        List<Integer> ans = new ArrayList<>();
        for(int c:count) ans.add(c);
        return ans;
    }

    public void sort(Pair[] arr,int lo,int hi) {
        if(lo==hi) return;
        int mid = lo+(hi-lo)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }

    public void merge(Pair[] arr,int lo,int mid,int hi){
        for (int i = lo; i <= hi; i++) {
            temp[i] = arr[i];
        }

        int i = lo,j=mid+1;

        for (int p = lo; p <=hi; p++) {
            if(i==mid+1){
                arr[p] = temp[j++];
            } else if(j==hi+1){
                arr[p] = temp[i++];
                count[arr[p].id] += j-mid-1;
            } else if(temp[i].val>temp[j].val){
                arr[p] = temp[j++];
            } else {
                arr[p] = temp[i++];
                count[arr[p].id] += j-mid-1;
            }
        }
    }
}