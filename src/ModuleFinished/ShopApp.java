package ModuleFinished;

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

    private List<Goods> tovr = new ArrayList<>();
    public static List<String> addtov = new LinkedList<>();

    public ShopApp() {

        tovr.add(new Goods("Ноутбук", "Asus ", 22580).addCategory("Ноутбуки"));
        tovr.add(new Goods("Ноутбук", "Aser", 9750).addCategory("Ноутбуки"));
        tovr.add(new Goods("Ноутбук", "Lenovo", 18875).addCategory("Ноутбуки"));
        tovr.add(new Goods("Ноутбук", "HP", 15748).addCategory("Ноутбуки"));
        tovr.add(new Goods("Ноутбук", "Dell", 10200).addCategory("Ноутбуки"));

        tovr.add(new Goods("Телефон", "Samsung", 14670).addCategory("Телефони"));
        tovr.add(new Goods("Телефон", "Nokia", 4840).addCategory("Телефони"));
        tovr.add(new Goods("Телефон", "Lenovo", 4879).addCategory("Телефони"));
        tovr.add(new Goods("Телефон", "Sony", 8795).addCategory("Телефони"));
        tovr.add(new Goods("Телефон", "HTC", 9888).addCategory("Телефони"));

        tovr.add(new Goods("Телевізор", "Samsung", 4587).addCategory("Телевізори"));
        tovr.add(new Goods("Телевізор", "LG", 28980).addCategory("Телевізори"));
        tovr.add(new Goods("Телевізор", "Sony", 30000).addCategory("Телевізори"));
        tovr.add(new Goods("Телевізор", "Philips", 4788).addCategory("Телевізори"));
        tovr.add(new Goods("Телевізор", "Toshiba", 7489).addCategory("Телевізори"));

        tovr.add(new Goods("Фотоапарат", "Canon", 15444).addCategory("Фотоапарати"));
        tovr.add(new Goods("Фотоапарат", "Nikon", 9554).addCategory("Фотоапарати"));
        tovr.add(new Goods("Фотоапарат", "Sony", 3554).addCategory("Фотоапарати"));
        tovr.add(new Goods("Фотоапарат", "Panasonic", 7845).addCategory("Фотоапарати"));
        tovr.add(new Goods("Фотоапарат", "Olympus", 7451).addCategory("Фотоапарати"));

        tovr.add(new Goods("Наушники", "Probass", 245).addCategory("Наушники"));
        tovr.add(new Goods("Наушники", "Beats Audio", 427).addCategory("Наушники"));
        tovr.add(new Goods("Наушники", "Sennhaizer", 343).addCategory("Наушники"));
        tovr.add(new Goods("Наушники", "Jabra", 500).addCategory("Наушники"));
        tovr.add(new Goods("Наушники", "Htc", 788).addCategory("Наушники"));

        tovr.add(new Goods("Видеокамера", "GoPro", 15399).addCategory("Видеокамери"));
        tovr.add(new Goods("Видеокамера", "SJCAM", 1799).addCategory("Видеокамери"));
        tovr.add(new Goods("Видеокамера", "Sony", 12999).addCategory("Видеокамери"));
        tovr.add(new Goods("Видеокамера", "Panasonic", 21999).addCategory("Видеокамери"));
        tovr.add(new Goods("Видеокамера", "Xiomi", 2199).addCategory("Видеокамери"));
        tovr.add(new Goods("Видеокамера", "Canon", 21132).addCategory("Видеокамери"));
        tovr.add(new Goods("Видеокамера", "Nikon", 28199).addCategory("Видеокамери"));

        tovr.add(new Goods("Музикальний Центр", "Philips", 1199).addCategory("Музикальніцентри"));
        tovr.add(new Goods("Музикальний Центр", "Sony", 7999).addCategory("Музикальніцентри"));
        tovr.add(new Goods("Музикальний Центр", "Samsung", 9399).addCategory("Музикальніцентри"));
        tovr.add(new Goods("Музикальний Центр", "Panasonic", 3199).addCategory("Музикальніцентри"));
        tovr.add(new Goods("Музикальний Центр", "LG", 4139).addCategory("Музикальніцентри"));

        tovr.add(new Goods("Холодильник", "INDESIT", 5169).addCategory("Холодильники"));
        tovr.add(new Goods("Холодильник", "ATLANT", 8799).addCategory("Холодильники"));
        tovr.add(new Goods("Холодильник", "Samsung", 25919).addCategory("Холодильники"));
        tovr.add(new Goods("Холодильник", "ZANUSSI", 11999).addCategory("Холодильники"));
        tovr.add(new Goods("Холодильник", "BOSCH", 9999).addCategory("Холодильники"));
        tovr.add(new Goods("Холодильник", "FREGGIA", 24250).addCategory("Холодильники"));

        tovr.add(new Goods("Планшет", "ASUS", 4587).addCategory("Планшети"));
        tovr.add(new Goods("Планшет", "APPLE", 14555).addCategory("Планшети"));
        tovr.add(new Goods("Планшет", "LG", 2547).addCategory("Планшети"));
        tovr.add(new Goods("Планшет", "SONY", 5789).addCategory("Планшети"));
        tovr.add(new Goods("Планшет", "Lenovo", 7449).addCategory("Планшети"));
        tovr.add(new Goods("Планшет", "Microsoft", 6999).addCategory("Планшети"));
        tovr.add(new Goods("Планшет", "DELL", 2999).addCategory("Планшети"));


    }


    public List<Goods> getByCategory(String category) {
        List<Goods> filteredList = new ArrayList<>();
        for (Goods product : tovr) {
            if (product.getCategories().contains(category))
                filteredList.add(product);
        }
        return filteredList;

    }


    void addNew() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("src/ModuleFinished/Korzina");
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
