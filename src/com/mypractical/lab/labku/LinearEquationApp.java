package com.mypractical.lab.labku;

import java.util.Scanner;

/**
* Created by Администратор on 24.09.2015.
*/
public class  LinearEquationApp {
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       double a;
       double b;
       double c;


       System.out.print("Введіть а: ");
       a = Double.parseDouble(scanner.nextLine());


       System.out.print("Введіть b: ");
       b = Double.parseDouble(scanner.nextLine());


       System.out.print("Введіть c: ");
       c = Double.parseDouble(scanner.nextLine());


       System.out.println(-b / a);


       double d = b * b - 4 * a * c;

       Math.sqrt(d);

   }


}
