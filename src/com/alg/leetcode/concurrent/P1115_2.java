package com.alg.leetcode.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P1115_2 {
    static class FooBar {

        private int n;

        private Semaphore semaphore1 = new Semaphore(1);
        private Semaphore semaphore2 = new Semaphore(0);

        public FooBar(int n) {
            this.n = n;
          }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                semaphore1.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                semaphore2.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                semaphore2.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                semaphore1.release();
            }
        }
    }

    public static void main(String[] args) throws Exception {

        FooBar fooBar = new FooBar(55);

        Thread t1 = new Thread(() -> {
            try {
                fooBar.foo(() -> {
                    System.out.print("foo");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                fooBar.bar(() -> {
                    System.out.println("bar");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
