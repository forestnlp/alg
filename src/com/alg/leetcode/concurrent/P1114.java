package com.alg.leetcode.concurrent;

public class P1114 {
    static class Foo {
        private volatile boolean flag1=false,flag2=false;

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            synchronized (this){
                printFirst.run();
                flag1=true;
                notifyAll();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            synchronized (this){
                while (!flag1){
                    wait();
                }
                printSecond.run();
                flag2=true;
                notifyAll();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            synchronized (this){
                while (!flag2){
                    wait();
                }
                printThird.run();
                flag2=true;
                notifyAll();
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

        t3.start();
        t1.start();
        t2.start();
    }
}
