package com.mypractical.lab.labka4;

import java.util.Scanner;

/**
 * Created by Администратор on 26.10.2015.
 */
public class KvadratneRivnyanya {


    public static void main(String[] args) {
        System.out.println("Введіть значення а,b і с ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int l = 2;
        double k = Math.pow(b, l);
        double d = b*b - 4 * a * c;
        double p = Math.sqrt(d);
        double x1 = (-b + p) / 2 * a;
        double x2 = (-b - p) / 2 * a;
        if (d < 0) {
            System.out.println("D=" + d);
            System.out.println("Рівняння не має коренів");

        } else
            System.out.println("D=" + d);
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);


    }
}
