package com.alg.leetcode.concurrent;


import java.util.concurrent.SynchronousQueue;

public class P1114_7 {
    static class Foo {

        private SynchronousQueue<Integer> queue1;
        private SynchronousQueue<Integer> queue2;

        public Foo() {
            queue1 = new SynchronousQueue<>();
            queue2 = new SynchronousQueue<>();
        }

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            queue1.take();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            queue1.put(1);
            printSecond.run();
            queue2.take();
        }

        public void third(Runnable printThird) throws InterruptedException {
            queue2.put(2);
            printThird.run();
        }
    }



    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();

        Thread t1 = new Thread(() -> {
            try {
                foo.first(() -> {
                    System.out.println("first");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                foo.second(() -> {
                    System.out.println("second");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                foo.third(() -> {
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
