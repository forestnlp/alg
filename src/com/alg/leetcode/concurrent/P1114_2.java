package com.alg.leetcode.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P1114_2 {
    static class Foo {
        private Lock lock;
        private Condition condition1;
        private Condition condition2;
        private int state = 0;

        public Foo() {
            lock = new ReentrantLock();
            condition1 = lock.newCondition();
            condition2 = lock.newCondition();
        }

        public void first(Runnable printFirst) throws InterruptedException {
            System.out.println("1");
            lock.lock();
            try {
                printFirst.run();
                state++;
                condition1.signalAll();
            }
            finally {
                lock.unlock();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            System.out.println("2");
            lock.lock();
            try {
                while (state==0)
                    condition1.await();
                printSecond.run();
                state++;
                condition2.signalAll();
            }
            finally {
                lock.unlock();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            System.out.println("3");
            lock.lock();
            try {
                while (state==1||state==0)
                    condition2.await();
                printThird.run();
            }
            finally {
                lock.unlock();
            }
        }
    }



    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();

        Thread t1 = new Thread(()->{
            try {
                foo.first(()->{
                    System.out.println("first");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
            try {
                foo.second(()->{
                    System.out.println("second");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(()->{
            try {
                foo.third(()->{
                    System.out.println("third");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
