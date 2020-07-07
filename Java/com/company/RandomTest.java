package com.company;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextFloat());
        System.out.println(r.nextInt());
        System.out.println(r.nextGaussian());
    }
}
