package grocery;

import java.util.HashMap;
import java.util.Map;

public class Categories {
   static HashMap<Integer, String> categories;

    public Categories() {
        categories = new HashMap<>();
        categories.put(1, "Veggies");
        categories.put(2, "Fruits");
        categories.put(3, "Meats");
        categories.put(4, "Canned Goods");
        categories.put(5, "Drinks");
        categories.put(6, "Snacks");

    }

    public Map showCategories() {
        return categories;
    }


}
