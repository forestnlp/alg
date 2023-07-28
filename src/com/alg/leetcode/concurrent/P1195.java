package com.alg.leetcode.concurrent;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class P1195 {
    static class FizzBuzz {

        private Semaphore semaphore = new Semaphore(1);
        private Semaphore semaphore3 = new Semaphore(0);
        private Semaphore semaphore5 = new Semaphore(0);
        private Semaphore semaphore35 = new Semaphore(0);

        private volatile int cur = 1;

        private int n;

        public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            for(;;){

            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            for(;;){

            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            for(;;){

            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            for(;;){
                semaphore.acquire();
                printNumber.accept(cur);

            }
        }
    }
}
