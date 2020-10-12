package com.company;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thready("t1"));
        Thread t2 = new Thread(new Thready("t2"));
        Thread t3 = new Thread(new Thready("t3"));
        Thread t4 = new Thread(new Thready("t4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
