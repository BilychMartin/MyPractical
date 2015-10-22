package com.mypractical.lab.labka4;

/**
 * Created by Администратор on 07.10.2015.
 */
public class BlaBlaCarApp {

    public static void main(String[] args){

        int[] days = {0, 0, 1, 1, 2};
        int[] prices =  {120, 100, 110, 115, 95};
        int[] hours = {20, 22, 8, 12, 10};
        String[] names = {"Володимир", "Сергій", "Дмитро", "Олександр", "Вадим"};

        for(int i = 0; i <days.length; i++) {
            System.out.println(String.format("Ужгород-Львів, %3d гривень, ім'я водія:%10s, виїзд через %d днів о %2d:00",

                    prices[i], names[i], days[i], hours[i]
            ));
        }

    }
}




