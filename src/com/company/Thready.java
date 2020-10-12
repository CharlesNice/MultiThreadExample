package com.company;

import java.util.Random;

public class Thready implements Runnable{

    private final String name;
    private final int time;
    private final Random rand;

    public Thready(String name){
        this.name = name;
        this.rand = new Random();
        this.time = rand.nextInt(999);
    }

    @Override
    public void run() {
        try{
            System.out.println(name+ " is sleeping for "+ time);
            Thread.sleep(time);
            System.out.println(name+" finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
