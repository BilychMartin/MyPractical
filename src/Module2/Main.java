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
        menu.Entrance();

        for (int i = 0; ; i++) {

            String otvet = sc.next();
            if (otvet.equalsIgnoreCase("Додати")) {
                tv.Add();
            } else if (otvet.equalsIgnoreCase("Пошук")) {
                tv.poshuk();
            } else if (otvet.equalsIgnoreCase("Редрагувати")) {
                tv.redrag();
            } else if (otvet.equalsIgnoreCase("Вийти")) {
                System.exit(0);
            } else if(otvet.equalsIgnoreCase("Видалити")){
                tv.delit();
            }else {
                System.out.println("Повторіть введення :");
                System.out.println();
            }
            menu.Entrance();

        }

    }


}
