package com.alg.leetcode.string;

public class P415 {
    class Solution {
        public String addStrings(String num1, String num2) {
            num1 = new StringBuilder(num1).reverse().toString();
            num2 = new StringBuilder(num2).reverse().toString();

            char[] arr1 = num1.toCharArray();
            char[] arr2 = num2.toCharArray();
            int[] res = new int[Math.max(arr1.length,arr2.length)+1];
            int carry = 0;
            int p=0,p1=0,p2=0;
            int c1,c2;
            while (p1<arr1.length||p2<arr2.length) {
                c1 = p1<arr1.length?arr1[p1++]-'0':0;
                c2 = p2<arr2.length?arr2[p2++]-'0':0;
                int r = c1+c2+carry;
                res[p++] =  (r%10);
                carry=r/10;
            }

            if(carry==0) {
                p=res.length-1;
            }
            else {
                res[p]=1;
                p=res.length;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<p;i++) {
                sb.append(res[i]);
            }
            return sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new P415().new Solution();
        String res = solution.addStrings("3","999");
        System.out.println(res);
    }
}
