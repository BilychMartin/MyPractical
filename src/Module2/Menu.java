package Module2;

import java.util.Scanner;

/**
 * Created by Администратор on 07.12.2015.
 */
public class Menu {

    Scanner sc = new Scanner(System.in);


    void Product(String t, int p){

        String tovar;
        int price;

        tovar = t;
        price = p;

        String open = (tovar + "\n" + price);

    }

    public void Entrance(){
        System.out.println("*************************************************************************");
        System.out.println("************|Вітаю вас в Інтернет магазині електроніки|******************");
        System.out.println("*************************************************************************");
        System.out.println("            $$$$$$$$$$$$$$$$$$$$$                   ");
        System.out.println("*************|ПАНЕЛЬ УПРАВЛІННЯ|******************");
        System.out.println("            $$$$$$$$$$$$$$$$$$$$$                   ");
        System.out.println("***ДЛЯ ПОШУКУ ТОВАРУ ВВЕДІТЬ <пошук>" + "\n" +
                "*** ЩОБ ДОДАТИ ТОВАР ВВЕДІТЬ <додати> " + "\n" +
                "*** ЩОБ ВИДАЛИТИ ТОВАР ВВЕДІТЬ <видалити>" + "\n" +
                "*** ЩОБ РЕДАГУВАТИ ТОВАР <редагувати>" + "\n" +
                "*** ЩОБ ВИЙТИ З МАГАЗИНА ВВЕДІТЬ <вийти>");
    }void Add (){
        System.out.println("Введіть Категорію");
        String tov = sc.next();
        System.out.print("товар");
        String tovar = sc.next();
        System.out.println("ціна");
        int price = sc.nextInt();



    }

}
