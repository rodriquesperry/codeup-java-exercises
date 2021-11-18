package grocery;

import util.Input;

import java.util.*;

public class GroceryListApp {

    public static void main(String[] args) {
        Categories categories = new Categories();
        Input input = new Input();
        List<String> groceryItems = new ArrayList<>();
        HashMap<String, List<String>> groceryList = new HashMap<>();


//        System.out.println("Would you like to create a grocery list?");
        boolean createList = input.yesNo("Would you like to create a grocery list?");

        if (createList) {
            boolean addItem;
            do {
                addItem = input.yesNo("Would you like to enter a new item?");

                if (addItem) {
                    categories.showCategories();
                    System.out.println("Please choose a category.");
                    int catChoice = input.getInt();
                    boolean changeCat = false;
                    do {
                        if (categories.categories.containsKey(catChoice)) {
                            System.out.println(categories.categories.get(catChoice));
                            System.out.println("Enter the name of your " + categories.categories.get(catChoice));
                            String itemName = input.getString();
                            System.out.println("Enter the quanity");
                            int itemQuanity = input.getInt();
                            groceryItems.add(itemName + " : " + itemQuanity);
                            groceryList.put(categories.categories.get(catChoice), groceryItems);
                            System.out.println("groceryList = " + groceryList);
                            changeCat = input.yesNo("Would you like to change categories?");
                        }
                    }while (!changeCat);
                    groceryItems = new ArrayList<>();
                }
            } while (addItem);

            boolean complete = input.yesNo("Is your list complete?");
            if (complete) {
                //https://www.baeldung.com/java-map-entries-methods#the-keyset-method
                for (String category : groceryList.keySet()) {
                    System.out.println(category);

                    Collections.sort(groceryList.get(category));


                    for (String item : groceryList.get(category)) {
                        System.out.println(item);
                    }
                    System.out.println("-~-~-~-~-~-~-~-~-~");
                }
            }
        }

    }

}
