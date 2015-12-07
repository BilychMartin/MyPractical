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

        String open = (tovar + "\t" + price);

    }

    public void Entrance(){
        System.out.println("*************$$$|Вітаю вас в Інтернет магазині електроніки|$$$******************");
        System.out.println("*************|Дії в інтернет магазині|******************");
        System.out.println("***Для пошуку товару введіть слово <пошук>" + "\n" +
                "*** Щоб додати товар введіть слово <додати> " + "\n" +
                "*** Щоб Вилалити товар введіть слово <видалити>" + "\n" +
                "*** Щоб редрагувати товар введіть слово <редагувати>" + "\n" +
                "*** Щоб вийти з програми введіть <вийти>");
    }void Add (){
        System.out.println("Введіть Категорію");
        String tov = sc.next();
        System.out.print("товар");
        String tovar = sc.next();
        System.out.println("ціна");
        int price = sc.nextInt();



    }

}
