package Module2;

import tyt.productApp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Администратор on 07.12.2015.
 */
public class MapStore {

    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    TreeMap<String, Object> tv = new TreeMap<>();



    void Add() throws IOException{

        System.out.println("Введіть Категорію");
        String tov = sc.nextLine();
        System.out.print("товар");
        String tovar = sc.nextLine();
        System.out.println("ціна");
        int price = sc.nextInt();

        tv.put(tov, new Product(tovar, price));


        Set<Map.Entry<String, Object>> tv1 = tv.entrySet();


        System.out.println("*************************************************");
        System.out.println("\t\t\t Наявні товари(Кількість товарів ) " + tv.size());
        for (Map.Entry<String, Object> me : tv1) {
            System.out.print(me.getKey() + "- \t");
            System.out.println(me.getValue());
        }


        PrintWriter writer = new PrintWriter(new FileWriter("src/Module2/file/text.txt"));
        writer.println(tv.size());
        for (Map.Entry<String, Object> entry : tv.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());

        }
        writer.close();


    }


    void poshuk() {
        System.out.println("Введіть шуканий товар:");
        String name = sc.nextLine();

        if (tv.containsKey(name)) {

            System.out.println(tv.get(name));
        } else {
            System.out.println("Товара неіснує");
            System.out.println("-----------------------");
        }

    }

    void redrag() {
        System.out.println("Введіть ім'я яке ви будете редрагувати");
        String name = sc.next();
        if (tv.containsKey(name)) {
            System.out.println(tv.get(name));
            System.out.println("Введіть інший товар :");
            String tovar1 = sc.nextLine();
            System.out.print("нову ціну :");
            int price1 = sc.nextInt();


            tv.remove(name);
            tv.put(name, new Product(tovar1, price1));
        } else {
            System.out.println("Товара неіснує");
            System.out.println();
        }
    }

    void delit() {
        System.out.println();
        System.out.println("Введіть товар який хочете видалити");
        String name = sc.nextLine();
        if (tv.containsKey(name)) {
            tv.remove(name);

        } else {
            System.out.println("Контакта неіснує");
            System.out.println("-----------------------");
        }


        Set<Map.Entry<String, Object>> tv1 = tv.entrySet();


        for (Map.Entry<String, Object> me : tv1) {
            System.out.print(me.getKey() + " \t");
            System.out.println(me.getValue());
        }
    }

}
