package ModuleFinished;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Администратор on 12.12.2015.
 */
public class Goods {

    private String product;
    private String model;
    private int price;
    private Set<String> categories = new HashSet<>();


    public Goods(String product, String model, int price) {

        this.product = product;
        this.model = model;
        this.price = price;
    }

    public Set<String> getCategories() {

        return categories;
    }

    public Goods addCategory(String category) {
        categories.add(category);
        return this;
    }

    public String getProduct() {

        return product;
    }

    public void setName(String product) {

        this.product = product;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "" + "" + product + " \t" + "модель " + model + " \t" + "цiна товара " + price + "$";
    }


    public static int size() {

        return 0;
    }
}


