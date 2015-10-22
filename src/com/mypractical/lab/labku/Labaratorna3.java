package com.mypractical.lab.labku;

import java.util.Scanner;

/**
 * Created by Администратор on 01.10.2015.
 */
public class Labaratorna3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum = 0;

        int sumaEven = 0;
        int sumaOdd = 0;


        for (int i = 0; i <= 20 ; i++) {

            if( i % 2 == 0){
                sumaEven = sumaEven + i;
                System.out.println("Парне число");
            } else {
                sumaOdd = sumaOdd + i;
                System.out.println("Непарне число");
            }






        }

    }

}
