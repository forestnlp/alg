package com.alg.leetcode.string;

public class P1108 {
    class Solution {
        public String defangIPaddr(String address) {
            return address.replaceAll("\\.","[\\.]");
        }
    }

    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println(ip.replaceAll("\\.","[\\.]"));
    }
}
