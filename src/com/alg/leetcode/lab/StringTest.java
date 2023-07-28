package com.alg.leetcode.lab;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "LiuJie";
        String s2 = new String("LiuJie");
        System.out.println(s1==s2);
        String s3 = "LiuJie";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        String s4 = String.valueOf(s1);
        System.out.println(s1==s4);
        String s5 = String.valueOf(s1.toCharArray());
        System.out.println(s1==s5);

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s1.toCharArray();
        System.out.println(arr1==arr2);
    }
}
