package com.alg.sword.jz75;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    Queue<Character> queue = new ArrayDeque<>();
    int[] bitmap = new int[256];
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        bitmap[ch]++;
        if(bitmap[ch]==1)
            queue.offer(ch);
        else
            queue.remove(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return queue.isEmpty()?'#':queue.peek();
    }
}