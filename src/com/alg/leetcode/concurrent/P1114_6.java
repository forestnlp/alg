package com.alg.leetcode.concurrent;


public class P1114_6 {
    static class Foo {

        private Thread t1,t2;

        public Foo() {
        }

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            t1 = Thread.currentThread();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            t2 = Thread.currentThread();
            while (t1==null) {

            }
            t1.join();
            printSecond.run();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (t2==null) {

            }
            t2.join();
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
