package com.alg.leetcode.array;

public class P1013 {
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
            for (int n : A) sum += n;
            int l = 0, r = A.length - 1;
            if (sum % 3 != 0) return false;

            int flag=0;

            int acc=sum/3;
            while (l < A.length - 1) {
                acc-=A[l];
                if(acc==0){
                    flag++;
                    break;
                }
                l++;
            }

            acc=sum/3;
            while (r>1){
                acc-=A[r];
                if(acc==0){
                    flag++;
                    break;
                }
                r--;
            }

            acc=sum/3;
            while (r-l>1){
                acc-=A[++l];
                if(acc==0){
                    flag++;
                    break;
                }
            }

            return flag==3;
        }
    }
}
