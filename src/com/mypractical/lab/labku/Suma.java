package com.mypractical.lab.labku;

import java.util.Scanner;

/**
 * Created by Администратор on 24.09.2015.
 */
public class Suma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть перше число:  ");
        int a = Integer.parseInt(scanner.nextLine());


        System.out.print("Введіть друге число: ");
        int b = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = a; i <= b; i++) {

            sum = sum + i;
        }


        System.out.println("Сума дорівює" + sum);
    }

}



