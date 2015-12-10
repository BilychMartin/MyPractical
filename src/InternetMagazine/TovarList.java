package InternetMagazine;

import java.io.*;
import java.util.*;

/**
 * Created by Администратор on 10.12.2015.
 */
public class TovarList {

    private List<TovarEntry> tovr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public TovarList() {
        tovr.add(new TovarEntry("Відеокарта", "GT 980", 25000).addCategory("Комп'ютери"));
        tovr.add(new TovarEntry("Колонки", "Sveen", 25000).addCategory("Комп'ютери"));
        tovr.add(new TovarEntry("Мишка", "Genius", 25000).addCategory("Комп'ютери"));


    }
    void add(String name, String model , Integer price , String categori){
        tovr.add(new TovarEntry(name, model, price).addCategory(categori));
    }

    void readToFile() throws IOException {
        Scanner scanner = new Scanner("src/InternetMagazine/file/Baza.txt");


        int listSize = Integer.parseInt(scanner.nextLine());
        tovr.clear();
        for (int i = 0; i < listSize; i++) {
            String tovar = scanner.nextLine();
            String model = scanner.nextLine();
            Integer price = Integer.parseInt(scanner.nextLine());
            String categori = scanner.nextLine();
            TovarEntry entry = new TovarEntry(tovar, model, price).addCategory(categori);
            tovr.add(entry);


        }
    }
    void serch(String categori){
        if (tovr.contains(categori)) {

            int index = tovr.indexOf(categori);
            System.out.println(tovr.get(index-1) + " "+ tovr.get(index) + " " + tovr.get(index + 1) + " " + tovr.get(index + 2));
        } else {
            System.out.println("Товара неіснує");
            System.out.println("-----------------------");
        }
    }


    public void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("src/InternetMagazine/file/Baza.txt");

        writer.println(tovr.size());
        for (TovarEntry entry : tovr) {
            writer.println(entry.getTovar());
            writer.println(entry.getModel());
            writer.println(entry.getPrice());
            writer.println(entry.getCategories());
        }

        writer.close();
    }


    public List<TovarEntry> getByCategory(String category) {
        List<TovarEntry> filteredList = new ArrayList<>();
        for (TovarEntry tovarEntry : tovr) {
            if (tovarEntry.getCategories().contains(category))
                filteredList.add(tovarEntry);
        }
        return filteredList;
    }

    public void addTovar(TovarEntry t) {
        tovr.add(t);
    }


}
