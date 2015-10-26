package com.mypractical.lab.labka5;

/**
 * Created by Администратор on 25.10.2015.
 */
public class StolovaApp {


    public static void main(String[] args) {


        Strava[] strava = new Strava[6];
        strava[0] = new Strava(140, 1500, "Вареники");
        strava[1] = new Strava(100, 1800, "Пільмені");
        strava[2] = new Strava(180, 500, "Борщ");
        strava[3] = new Strava(182, 950, "Бульон");
        strava[4] = new Strava(99, 2500, "Картопля");
        strava[5] = new Strava(95, 500, "Цезарь");

        for (int i = 0; i < strava.length; i++) {
            System.out.println(strava[i]);
        }
    }
}
