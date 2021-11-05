import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> item = new HashMap<>();

        System.out.println("Would you like to create a grocery list? [y/n]");
        String groceriesNo = scanner.nextLine();

        if (groceriesNo.equalsIgnoreCase("y") || groceriesNo.equalsIgnoreCase("yes")) {
            System.out.println("Would you like to enter a new item?");
            String newItem = scanner.nextLine();

            item.put("Veggies", new ArrayList<>());
            item.put("Fruits", new ArrayList<>());
            item.put("Meats", new ArrayList<>());
            item.put("Drinks", new ArrayList<>());
            item.put("Snacks", new ArrayList<>());

            if (newItem.equalsIgnoreCase("y") || newItem.equalsIgnoreCase("yes")) {
                System.out.println("Which category?");
                System.out.println("|Veggies| |Fruits| |Meats| |Drinks| |Snacks|");
                String cat = scanner.nextLine();

                if (item.containsKey(cat)) {
                    System.out.println("Enter the name of the item");
                    newItem = scanner.nextLine();
                    item.get(cat).add(newItem);
                    System.out.println(item.get(cat));
                }
            }

        }

    }

}
