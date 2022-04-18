package com.alg.sword.jz53;

import java.util.Arrays;

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int left = 0,right = array.length;
        while (left<right){
            int mid= left+(right-left)/2;
            if(array[mid]>k){
                right = mid;
            }
            else if(array[mid]<k){
                left = mid+1;
            }
            else {
                right = mid;
            }
        }
        int leftmost = left;
        left = 0;right=array.length;
        while (left<right){
            int mid = left+(right-left)/2;
            if(array[mid]==k){
                left = mid+1;
            }else if(array[mid]<k){
                left = mid+1;
            }else if(array[mid]>k){
                right = mid;
            }
        }
        int rightmost = left-1;
        return rightmost-leftmost+1;
    }

    public static void main(String[] args) {
        int leftmost = new Solution().GetNumberOfK(new int[]{1,2,3,4,4,4,5,6},4);
        System.out.println(leftmost);
    }
}