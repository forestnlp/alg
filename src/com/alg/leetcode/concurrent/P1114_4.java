package com.alg.leetcode.concurrent;

import java.util.concurrent.atomic.LongAdder;

public class P1114_4 {
    static class Foo {

        private LongAdder state;

        public Foo() {
            state = new LongAdder();
        }

        public void first(Runnable printFirst) throws InterruptedException {

            printFirst.run();
            state.increment();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (state.intValue() < 1) {
            }
            printSecond.run();
            state.increment();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (state.intValue() < 2) {
            }
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
