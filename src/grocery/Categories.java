package grocery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Categories {
  public HashMap<Integer, String> categories;

    public Categories() {
        this.categories = new HashMap<>();
        categories.put(1, "Veggies");
        categories.put(2, "Fruits");
        categories.put(3, "Meats");
        categories.put(4, "Canned Goods");
        categories.put(5, "Drinks");
        categories.put(6, "Snacks");


    }

    public void showCategories() {
        categories.forEach((key,value) -> System.out.println(key + "." + value ));
    }

    public static void main(String[] args) {

    }

}
