package com.company;

import com.company.Main;

public class Main {
    int counter = 0;
    //    volatile lock
    volatile int lock = 0;

    synchronized  void increment() {
        ++counter;
    }

    void display() {
        System.out.print("\r" + Thread.currentThread().getName() + " Counter " + counter);
    }

    Main() {
        Thread Thread1 = new Thread(() -> {
            try {
                for (int i = 0; i < 4; i++) {
                    lock = Math.abs(lock - 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

        });
        Thread Thread2 = new Thread(() -> {
            while (Thread1.isAlive()) {
                while (lock == 1) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    increment();
                }
            }
        });
        Thread Thread3 = new Thread(() -> {
            try {
                while (Thread2.isAlive()) {
                    display();
                    Thread.sleep(10);
                }

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            display();
        });
        Thread1.start();
        Thread2.start();
        Thread3.start();
    }

    public static void main(String[] args) {
        new Main();
    }

}
