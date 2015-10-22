package com.mypractical.lab;


import java.util.Scanner;

/**
 * Created by Администратор on 24.09.2015.
 */
public class Lab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // ax + b = 0
        double a;
        double b;

        System.out.print("Введіть а: ");
        a = Double.parseDouble(scanner.nextLine());

        System.out.print("Введіть b: ");
        b = Double.parseDouble(scanner.nextLine());

        System.out.println(-b / a);

    }
}













