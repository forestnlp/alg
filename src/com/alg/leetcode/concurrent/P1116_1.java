package com.alg.leetcode.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class P1116_1 {
    static class ZeroEvenOdd {

        private Semaphore semaphore0 = new Semaphore(1);
        private Semaphore semaphoreOdd = new Semaphore(0);
        private Semaphore semaphoreEven = new Semaphore(0);

        private int n;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                semaphore0.acquire();
                printNumber.accept(0);
                if ((i & 1) == 0) semaphoreEven.release();
                else semaphoreOdd.release();
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i += 2) {
                semaphoreEven.acquire();
                printNumber.accept(i);
                semaphore0.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                semaphoreOdd.acquire();
                printNumber.accept(i);
                semaphore0.release();
            }
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd zeo = new ZeroEvenOdd(5);

        IntConsumer consumer = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        };

        Thread t0 = new Thread(() -> {
            try {
                zeo.zero(consumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t1 = new Thread(() -> {
            try {
                zeo.odd(consumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                zeo.even(consumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t0.start();

    }
}
