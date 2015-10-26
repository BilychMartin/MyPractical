package com.mypractical.lab.labka1;

import java.util.Scanner;

/**
 * Created by Администратор on 24.09.2015.
 */
public class RandomGame {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int n = 100;
        int m = n / 2;
        System.out.println("ваше число " + m + " ?");
        do {
            String command = sc.nextLine();
            if (command.contains("більше")) {
                System.out.println("ваше число є " + plus());
            }
            if (command.contains("менше")) {
                System.out.println("ваше число є " + minus());
                a = false;
            }
            if (!command.contains("менще") || !command.contains("більше")) {
                System.out.println("будь-ласка,напишіть команду");
            }
        } while (a == true);

    }

    public static int plus() {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        int m = n / 2;
        boolean end = false;
        do {
            int k = (n + m) / 2;
            System.out.println("ваше число є " + k);
            String command = sc.nextLine();
            if (command.contains("більше")) {
                m = (n + m) / 2;
            }
            if (command.contains("менше")) {
                n = (n + m) / 2;
            }
            if (command.contains("я знайшов ваше число")) {
                end = true;
                return k;
            }

        } while (end == false);
        return 0;
    }

    public static int minus() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 50;
        boolean end = false;
        do {
            int k = (n + m) / 2;
            System.out.println("ваше число є " + k);
            String command = sc.nextLine();
            if (command.contains("більше")) {
                n = (n + m) / 2;
            }
            if (command.contains("менше")) {
                m = (n + m) / 2;
            }
            if (!command.contains("менше") || !command.contains("більше")) {
                System.out.println("будь-ласка,напишіть команду");
            }
            if (command.contains("я знайшов ваше число")) {
                end = true;
                return k;
            }
        } while (end = false);
        return 0;
    }
}



