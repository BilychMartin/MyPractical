package InternetMagazine;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Администратор on 12.12.2015.
 */
public class ShopApp {

    Scanner sc = new Scanner(System.in);

    private List<Goodss> tovr = new ArrayList<>();
    public static List<String> addtov = new LinkedList<>();

    public ShopApp() {

        tovr.add(new Goodss("Ноутбук", "Asus ", 22580).addCategory("Ноутбуки"));
        tovr.add(new Goodss("Ноутбук", "Aser", 9750).addCategory("Ноутбуки"));
        tovr.add(new Goodss("Ноутбук", "Lenovo", 18875).addCategory("Ноутбуки"));
        tovr.add(new Goodss("Ноутбук", "HP", 15748).addCategory("Ноутбуки"));
        tovr.add(new Goodss("Ноутбук", "Dell", 10200).addCategory("Ноутбуки"));

        tovr.add(new Goodss("Телефон", "Samsung", 14670).addCategory("Телефони"));
        tovr.add(new Goodss("Телефон", "Nokia", 4840).addCategory("Телефони"));
        tovr.add(new Goodss("Телефон", "Lenovo", 4879).addCategory("Телефони"));
        tovr.add(new Goodss("Телефон", "Sony", 8795).addCategory("Телефони"));
        tovr.add(new Goodss("Телефон", "HTC", 9888).addCategory("Телефони"));

        tovr.add(new Goodss("Телевізор", "Samsung", 4587).addCategory("Телевізори"));
        tovr.add(new Goodss("Телевізор", "LG", 28980).addCategory("Телевізори"));
        tovr.add(new Goodss("Телевізор", "Sony", 30000).addCategory("Телевізори"));
        tovr.add(new Goodss("Телевізор", "Philips", 4788).addCategory("Телевізори"));
        tovr.add(new Goodss("Телевізор", "Toshiba", 7489).addCategory("Телевізори"));

        tovr.add(new Goodss("Фотоапарат", "Canon", 15444).addCategory("Фотоапарати"));
        tovr.add(new Goodss("Фотоапарат", "Nikon", 9554).addCategory("Фотоапарати"));
        tovr.add(new Goodss("Фотоапарат", "Sony", 3554).addCategory("Фотоапарати"));
        tovr.add(new Goodss("Фотоапарат", "Panasonic", 7845).addCategory("Фотоапарати"));
        tovr.add(new Goodss("Фотоапарат", "Olympus", 7451).addCategory("Фотоапарати"));

        tovr.add(new Goodss("Наушники", "Probass", 245).addCategory("Наушники"));
        tovr.add(new Goodss("Наушники", "Beats Audio", 427).addCategory("Наушники"));
        tovr.add(new Goodss("Наушники", "Sennhaizer", 343).addCategory("Наушники"));
        tovr.add(new Goodss("Наушники", "Jabra", 500).addCategory("Наушники"));
        tovr.add(new Goodss("Наушники", "Htc", 788).addCategory("Наушники"));

        tovr.add(new Goodss("Видеокамера", "GoPro", 15399).addCategory("Видеокамери"));
        tovr.add(new Goodss("Видеокамера", "SJCAM", 1799).addCategory("Видеокамери"));
        tovr.add(new Goodss("Видеокамера", "Sony", 12999).addCategory("Видеокамери"));
        tovr.add(new Goodss("Видеокамера", "Panasonic", 21999).addCategory("Видеокамери"));
        tovr.add(new Goodss("Видеокамера", "Xiomi", 2199).addCategory("Видеокамери"));
        tovr.add(new Goodss("Видеокамера", "Canon", 21132).addCategory("Видеокамери"));
        tovr.add(new Goodss("Видеокамера", "Nikon", 28199).addCategory("Видеокамери"));

        tovr.add(new Goodss("Музикальний Центр", "Philips", 1199).addCategory("Музикальніцентри"));
        tovr.add(new Goodss("Музикальний Центр", "Sony", 7999).addCategory("Музикальніцентри"));
        tovr.add(new Goodss("Музикальний Центр", "Samsung", 9399).addCategory("Музикальніцентри"));
        tovr.add(new Goodss("Музикальний Центр", "Panasonic", 3199).addCategory("Музикальніцентри"));
        tovr.add(new Goodss("Музикальний Центр", "LG", 4139).addCategory("Музикальніцентри"));

        tovr.add(new Goodss("Холодильник", "INDESIT", 5169).addCategory("Холодильники"));
        tovr.add(new Goodss("Холодильник", "ATLANT", 8799).addCategory("Холодильники"));
        tovr.add(new Goodss("Холодильник", "Samsung", 25919).addCategory("Холодильники"));
        tovr.add(new Goodss("Холодильник", "ZANUSSI", 11999).addCategory("Холодильники"));
        tovr.add(new Goodss("Холодильник", "BOSCH", 9999).addCategory("Холодильники"));
        tovr.add(new Goodss("Холодильник", "FREGGIA", 24250).addCategory("Холодильники"));

        tovr.add(new Goodss("Планшет", "ASUS", 4587).addCategory("Планшети"));
        tovr.add(new Goodss("Планшет", "APPLE", 14555).addCategory("Планшети"));
        tovr.add(new Goodss("Планшет", "LG", 2547).addCategory("Планшети"));
        tovr.add(new Goodss("Планшет", "SONY", 5789).addCategory("Планшети"));
        tovr.add(new Goodss("Планшет", "Lenovo", 7449).addCategory("Планшети"));
        tovr.add(new Goodss("Планшет", "Microsoft", 6999).addCategory("Планшети"));
        tovr.add(new Goodss("Планшет", "DELL", 2999).addCategory("Планшети"));


    }


    public List<Goodss> getByCategory(String category) {
        List<Goodss> filteredList = new ArrayList<>();
        for (Goodss product : tovr) {
            if (product.getCategories().contains(category))
                filteredList.add(product);
        }
        return filteredList;

    }


    void addNew() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("src/InternetMagazine/Korzina.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println("**ДЛЯ ТОГО ЩОБ КУПИТИ ТОВАР ПОТРІБНО: **");
        System.out.println("****************************************");
        System.out.println("***ВКАЗАТИ ТОВАР (ІЗ СПИСКА)***  ");
        String tovar = sc.nextLine();
        System.out.println("***ВВЕСТИ МОДЕЛЬ (ІЗ СПИСКА)***  ");
        String model = sc.nextLine();
        System.out.println("***ВВЕСТИ ЦІНУ ТОВАРА (ІЗ СПИСКА)***  ");
        int price = sc.nextInt();

        writer.println("Товар \t" + tovar + " \t" + "Модель \t" + model + " \t" + "Ціна \t" + price);

        writer.close();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$ ВАШ ТОВАР ДОДАНИЙ ДО КОРЗИНИ $");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println();
        System.out.println("*************************");
        System.out.println("****ДЯКУЄМО ЗА ПОКУПКУ***");
        System.out.println("*************************");


    }
}
