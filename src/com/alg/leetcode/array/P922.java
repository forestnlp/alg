package com.alg.leetcode.array;

public class P922 {
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int even=1,odd=0;

            while (odd<A.length) {
                if(A[odd]%2==0){
                    odd+=2;
                }
                else {
                    while (even<A.length) {
                        if(A[even]%2==1){
                            even+=2;
                        }
                        else if(even<A.length&&odd<A.length) {
                            int tmp = A[odd];
                            A[odd] = A[even];
                            A[even] = tmp;
                            odd+=2;
                        }
                    }
                }
            }
            return  A;
        }
    }
}
