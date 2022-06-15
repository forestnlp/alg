package com.alg.dog.tree;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/15 - 06 - 15 - 11:51
 * @Description: com.alg.dog.tree
 * @version: 1.0
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}