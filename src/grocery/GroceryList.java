package grocery;

import util.Input;

import java.sql.Array;
import java.util.*;

public class GroceryList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Categories list = new Categories();
        Input input = new Input();
        ArrayList<String> groceryItems = new ArrayList<>();
        HashMap<String, ArrayList<String>> grocery = new HashMap<>();


        if (input.yesNo("Would you like to create a grocery list? [yes/no]")) {

            do {

                if (input.yesNo("Would you like to enter a new item? [yes/no]")) {
                    System.out.println(list.showCategories());
                    System.out.println("Choose a category by number");
                }

                int catNum = input.getInt();
                String newItem = null;
                int itemCount = 0;

                if  (list.categories.containsKey(catNum)) {
//                    System.out.println("Enter the name of the item.");
                    do {
                        System.out.println("Enter the name of the item. (" + Categories.categories.get(catNum) + ").");
                        newItem = scanner.nextLine();
                        System.out.println("How many would you like");
                        itemCount = scanner.nextInt();

                        groceryItems.add(newItem + ":" + itemCount);

                    } while (input.yesNo("Would you like to enter a new item? [yes/no]"));
                    System.out.println(newItem);
                    System.out.println();
                }

                grocery.put(Categories.categories.get(catNum), groceryItems);
                System.out.println(grocery);

            } while (input.yesNo("Would you like to pick another category? [yes/no]"));

            System.out.println(grocery);
            Collection<String> values = list.categories.values();

            for (Object cat : values) {
                System.out.println(cat);

            }

        }







//        HashMap<String, ArrayList<HashMap<String, Integer>>> groceryItem;
//        grocery.put();






    }
}
