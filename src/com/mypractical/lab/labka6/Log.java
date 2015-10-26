package com.mypractical.lab.labka6;

/**
 * Created by Администратор on 26.10.2015.
 */
public class Log {

    public static void main(String[] args) {

        double precision = 0.000000001;

        double x = 0.4;
        double sum = x;

        double prevChiselnik = 1;
        long prevZnamennik = 1;

        for (int n = 2; ; n++) {

            prevChiselnik = prevChiselnik * Math.pow(x, n);
            prevZnamennik += 1;
            double dodanok = prevChiselnik / prevZnamennik;
            if (Math.abs(dodanok) <= precision) {
                break;
            }


            if (n % 2 == 0) {
                sum = x - dodanok;
            } else {
                sum = x + dodanok;
            }

        }

        System.out.println(sum);

    }

}
