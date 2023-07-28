package com.alg.leetcode.concurrent;

public class P1115_3 {
    static class FooBar {

        private int n;

        private boolean flag = true;

        public FooBar(int n) {
            this.n = n;
          }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                synchronized (this){
                    while (!flag){
                        wait();
                    }
                    printFoo.run();
                    flag=!flag;
                    notify();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                synchronized (this) {
                    while (flag) {
                        wait();
                    }
                    // printBar.run() outputs "bar". Do not change or remove this line.
                    printBar.run();
                    flag=!flag;
                    notify();
                }
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
