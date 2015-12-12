package InternetMagazine;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * Created by Администратор on 12.12.2015.
 */
public class Mein {
    public static void main(String[] args) throws java.io.IOException {

        Scanner sc = new Scanner(System.in);

        File myFile = new File("src/InternetMagazine/Sklad.txt");
        try {
            FileWriter writer = new FileWriter(myFile);


            ShopApp shopApp = new ShopApp();
            shopApp.getByCategory("Ноутбуки");
            shopApp.getByCategory("Телефони");
            shopApp.getByCategory("Телевізори");
            shopApp.getByCategory("Фотоапарати");
            shopApp.getByCategory("Наушники");
            shopApp.getByCategory("Видеокамери");
            shopApp.getByCategory("Музикальніцентри");
            shopApp.getByCategory("Холодильники");
            shopApp.getByCategory("Планшети");


            writer.write("Ноутбук: \n" + shopApp.getByCategory("Ноутбуки"));
            writer.write("Телефон: \n" + shopApp.getByCategory("Телефони"));
            writer.write("Телевізор: \n" + shopApp.getByCategory("Телевізори"));
            writer.write("Фотоапарат: \n" + shopApp.getByCategory("Фотоапарати"));
            writer.write("Наушники: \n" + shopApp.getByCategory("Наушники"));
            writer.write("Видеокамера: \n" + shopApp.getByCategory("Видеокамери"));
            writer.write("Музикальний Центр: \n" + shopApp.getByCategory("Музикальніцентри"));
            writer.write("Холодильник: \n" + shopApp.getByCategory("Холодильники"));
            writer.write("Планшет: \n" + shopApp.getByCategory("Планшети"));
            writer.flush();
            System.out.println("***********************************************");
            System.out.println("***ВІТАЮ ВАС В ІНТЕРНЕТ МАГАЗИНІ ЕЛЕКТРОНІКИ***");
            System.out.println("***********************************************");

            System.out.println("                                        *************");
            System.out.println("ДЛЯ ТОГО ЩОБ ПОДИВИТИСЯ КАТАЛОГ ВВЕДІТЬ ***КАТАЛОГ***");
            System.out.println("                                        *************");
            String komanda = sc.next();
            if (komanda.equalsIgnoreCase("каталог")) {
                System.out.println("ДЛЯ ПЕРЕГЛЯДУ МОДЕЛЕЙ ВВЕДІТЬ КАТЕГОРІЮ ПОТРІБНОГО ВАМ ТОВАРУ(iз списку): \n Ноутбуки \n Телефони \n Телевізори \n Фотоапарати \n Наушники \n Видеокамери \n Музикальніцентри \n Холодильники \n Планшети");
                String model = sc.next();

                List<Goods> tovari = shopApp.getByCategory(model);
                for (Goods mod : tovari) {
                    System.out.println(mod);
                }

            }
            Scanner scr = new Scanner(System.in);

            ShopApp shopApp1 = new ShopApp();

            for (int i = 0; ; i++) {
                System.out.println("                                    ************");
                System.out.println("ДЛЯ ТОГО ЩОБ ПРИДБАТИ ТОВАР ВВЕДІТЬ ***КУПИТИ***");
                System.out.println("                                    ************");
                String komandi = scr.nextLine();
                if (komandi.equalsIgnoreCase("купити")) {
                    shopApp1.addNew();


                }

                System.exit(0);
            }


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
