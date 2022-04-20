package com.alg.sword.jz11;

public class Solution2 {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            //说明mid-right为被旋转的部分，最小的应该在mid之前可能包含mid 561234
            if(array[mid] < array[right]){
                right = mid;
            }
            else if(array[mid] > array[right]){
                left = mid + 1;
            }
            else{
                right--;
            }
        }
        return array[left];
    }

    public static void main(String[] args) {
        int i = new Solution2().minNumberInRotateArray(new int[]{3,100,200,3});
        System.out.println(i);
    }
}