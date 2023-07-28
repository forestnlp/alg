package com.alg.leetcode.concurrent;

import java.util.concurrent.Semaphore;

public class P1117 {
    class H2O {

        Semaphore semaphore1,semaphore2;

        public H2O() {
            semaphore1 = new Semaphore(0);
            semaphore2 = new Semaphore(2);
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            semaphore1.acquire();
            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
            semaphore2.release();
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            semaphore2.acquire(2);
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            semaphore1.release(2);
        }
    }
}
