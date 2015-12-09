package Module2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Администратор on 07.12.2015.
 */
public class Main extends MapStore {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        MapStore tv = new MapStore();
        Menu menu = new Menu();
        ;
        for (int i = 0; ; i++) {
            menu.Entrance();
            String otvet = sc.nextLine();
            if (otvet.equalsIgnoreCase("Додати")) {
                tv.Add();
            } else if (otvet.equalsIgnoreCase("Видалити")) {
                tv.delit();
                tv.basketOpenFile();

            } else if (otvet.equalsIgnoreCase("пошук")) {
                tv.poshuk();
                tv.basketOpenFile();

            } else if (otvet.equalsIgnoreCase("Редрагувати")) {
                tv.redrag();
                tv.basketOpenFile();
            } else {
                if (otvet.equalsIgnoreCase("Вийти")) {
                    System.exit(0);

                }
            }

        }

    }
}



