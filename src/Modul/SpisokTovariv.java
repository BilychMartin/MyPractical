package Modul;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Администратор on 01.12.2015.
 */
public class SpisokTovariv {


    public static void main(String[] args) throws IOException {

        Map<String, String> tovar = new HashMap<>();
        tovar.put("Відеокарта", "1200 грн");
        tovar.put("Сканер", "500 грн");
        tovar.put("Колонки", "152 грн");
        tovar.put("Дисковод", "200 грн");
        tovar.put("Джойстик", "300 грн");
        tovar.put("Мишка", "400 грн");
        tovar.put("Клавіатура", "506 грн");
        tovar.put("Блок Живлення", "485 грн");
        tovar.put("Електрона книга", "758 грн");
        tovar.put("Монітор", "1507 грн");
        tovar.put("Холодильник", "1170 грн");
        tovar.put("Телевізор", "17880 грн");
        tovar.put("Мікроволновка", "17450 грн");
        tovar.put("Чайник", "780 грн");
        tovar.put("Праска", "1870 грн");


        PrintWriter writer = new PrintWriter(new FileWriter("E:/SpisokTovariv.txt"));
        writer.println(tovar.size());
        for (Map.Entry<String, String>entry : tovar.entrySet()){
            writer.println(entry.getKey());
            writer.println(entry.getValue());

        }
       writer.close();


        Map<String, String> savedTovar = new HashMap<>();
        Scanner scanner = new Scanner(new File("E:/SpisokTovariv.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++){
            String name = scanner.nextLine();
            String Cina = scanner.nextLine();
            savedTovar.put(name, Cina);

        }

        System.out.println("Ведіть товар для пошуку");
         Scanner consoleScanner = new Scanner(System.in);
        String s = consoleScanner.nextLine();


        for (Map.Entry<String, String> entry : savedTovar.entrySet()){
            if (entry.getKey().contains(s)){
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }
}
