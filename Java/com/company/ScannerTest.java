package com.company;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println(name);

        String num = "";
        while (sc.hasNextLine()) {
            if (sc.hasNextInt()) {
                num = sc.next();
                System.out.println(num);
            }else {
                num = sc.next();
                System.out.println(num + " is not allowed!");
                break;
            }
        }
    }
}
