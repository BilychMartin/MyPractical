package com.mypractical.lab.labka6;

/**
 * Created by Администратор on 26.10.2015.
 */
public class Ln {


    public static void main(String args[]) {

        double x = 0.001;
        double sum = 0;
        double a, b, c;
        for (int n = 0; n < 100; n++) {
            a = Math.pow(-1, n);
            b = n + 1;
            c = Math.pow(3 * x, b);
            sum += a / b * c;
        }

        System.out.println(sum);

    }
}
