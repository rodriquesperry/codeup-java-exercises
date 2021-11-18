package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    //When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class.
    //Means we just need a Constructor

    //constructor
    public Input() {
        this.scanner = new Scanner(System.in);
        }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String s) {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();

        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
//        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
//            return true;
//        }
//        return false;
    }

    public boolean yesNo(String s) {
        System.out.println(s);
        return yesNo();
    }


    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
    public int getInt (int min, int max){
        int userNum = getInt();
        if (userNum < min || userNum > max) {
            return getInt();
        }
        System.out.println();
        return userNum;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public int getInt() throws NumberFormatException {
        try {
            return Integer.valueOf(getString());

        } catch (NumberFormatException e) {
            System.out.println("User did not enter a valid integer.");
            return getInt("Please enter a whole number.");
        }
    }

    public int getInt(String prompt) {
        int number;
        try {
            number = Integer.valueOf(getString(prompt));
            return number;
        } catch(NumberFormatException e) {
            System.out.println("Wrong Input, try again! ");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max){
        double userNum = Double.valueOf(getString());
        if (userNum < min || userNum > max) {
            return getDouble();
        }
        System.out.println();
        return userNum;
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public double getDouble() throws NumberFormatException {
        try {
            return Double.valueOf(getString());

        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            e.getMessage();
            System.out.println("User did not enter a valid double.");

            return getDouble("Please enter a double.");
        }
    }

    public double getDouble(String prompt) {
        double number;
        try {
            number = Double.valueOf(getString(prompt));
            return number;

        } catch(NumberFormatException e) {
            System.out.println("Wrong type, Please eneter a double:");
            return getDouble(prompt);
        }
    }




}
