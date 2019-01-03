package ru.javaops.masterjava;

import java.util.Random;

public class Test {

    static public void main(String[] args){
        Random rn = new Random();

        System.out.println(rn.nextInt(10));

        Runnable runnable1 = () -> {
            for (int i  = 0; i<10; i++)
            System.out.println("1 - " + rn.nextInt(10));
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i<10; i++)
            System.out.println("2 - " + rn.nextInt(10));
        };
        runnable1.run();
        runnable2.run();









    }
}
