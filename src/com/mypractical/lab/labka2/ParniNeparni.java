package com.mypractical.lab.labka2;

/**
 * Created by Администратор on 25.10.2015.
 */
public class ParniNeparni {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;


        int sumEven = 0;
        int sumOdd = 0;

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }

        System.out.println("Сума парних: " + sumEven);
        System.out.println("Сума непарних: " + sumOdd);


        int i = 20;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
