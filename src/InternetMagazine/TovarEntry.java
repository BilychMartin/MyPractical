package InternetMagazine;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Администратор on 10.12.2015.
 */
public class TovarEntry {
    private  String tovar;
    private String model;

    public int getPrice() {
        return price;
    }

    private int price;
    private Set<String> categories = new HashSet<>();


    public TovarEntry(String tovar, String model, int price){

        this.tovar = tovar;
        this.model = model;
        this.price = price;

    }

    public void setTovar(String tovar){
        this.tovar = tovar;
    }

    public String getTovar(){
        return tovar;
    }

    public void setKategory(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public Integer integer(){
        return price;
    }

    public Set<String> getCategories() {
        return categories;
    }
    public TovarEntry addCategory(String category) {
        categories.add(category);
        return this;
    }




    @Override
    public String toString() {
        return "" + "" + tovar + " \t" + "модель " + model + " \t" + "цiна  " + price + "$";
    }

    public static int size() {
        return 0;
    }


}
