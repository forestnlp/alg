package com.alg.leetcode.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P1114_3 {
    static class Foo {

        private Semaphore s1 ,s2 ,s3;

        public Foo() {
            s1 = new Semaphore(1);
            s2 = new Semaphore(0);
            s3 = new Semaphore(0);
        }

        public void first(Runnable printFirst) throws InterruptedException {
            s1.acquire();
            try {
                printFirst.run();
            }
            finally {
                s1.release();
                s2.release();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            s2.acquire();
            try {
                printSecond.run();
            }
            finally {
                s3.release();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            s3.acquire();
            try {
                printThird.run();
            }
            finally {

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
