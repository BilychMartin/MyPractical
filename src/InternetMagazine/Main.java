package InternetMagazine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Администратор on 10.12.2015.
 */
public class Main {

    public static void main(String[] args) throws java.io.IOException {

        Scanner sc = new Scanner(System.in);

        try{
            FileWriter writer = new FileWriter("src/InternetMagazine/file/Baza.txt");


            TovarList tovarList = new TovarList();
            tovarList.getByCategory("Комп'ютери");




            writer.write("Відеокарти: \n" + tovarList.getByCategory("Комп'ютери"));

            writer.flush();

            System.out.println("Для покупки товару введiть команду <додати>  або <пошук>");
            String komanda = sc.nextLine();

            if (komanda.equalsIgnoreCase("додати")){
                TovarEntry t = new TovarEntry(null, null, 0);
                System.out.println("Введiть даннi:");
                System.out.println("Введiть назву вашого авто");
                String name = sc.next();
                t.setTovar(name);
                writer.write(name + "-");

                System.out.println("Введiть модель вашого авто");
                String model = sc.next();
                t.setKategory(model);
                writer.write(model + "-");

                System.out.println("Введiть цiну за ваше авто");
                int price = sc.nextInt();
                t.setPrice(price);
                writer.write(price + "$");

                System.out.println("Введiть категорiю вашого авто");
                String category = sc.next();
                t.addCategory(category);


                System.out.println("Ваше авто додано до бази!");
            }else if (komanda.equalsIgnoreCase("додати1")){
                System.out.println("Введiть даннi:");
                System.out.println("Введiть назву вашого авто");
                String name = sc.next();

                System.out.println("Введiть модель вашого авто");
                String model = sc.next();

                System.out.println("Введiть цiну за ваше авто");
                int price = sc.nextInt();

                System.out.println("Введiть категорiю вашого авто");
                String category = sc.next();
                tovarList.add(name,model,price,category);
                tovarList.saveToFile();
                }else if(komanda.equalsIgnoreCase("пошук")){
                tovarList.readToFile();
                System.out.printf("Введыть шукану категорыю ");
                String kategori = sc.nextLine();
                tovarList.serch(kategori);

            }

                System.out.println("Ваше авто додано до бази!");


        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
