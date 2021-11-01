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

    public String getString () {
        System.out.println("Enter a string.");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.next();

        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
//        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
//            return true;
//        }
//        return false;
    }

    public int getInt () {
        System.out.println("Enter an integer.");
        return this.scanner.nextInt();
    }
    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
    public int getInt ( int min, int max){
        System.out.printf("Enter an integer between %d and %d. %n", min, max);
        int userNum = this.scanner.nextInt();
        if (userNum < min || userNum > max) {
            return getInt();
        }
        System.out.println();
        return userNum;
    }

    public double getDouble () {;
        return this.scanner.nextDouble();
    }

    public double getDouble ( double min, double max){
        System.out.printf("Enter a decimal number between %f and %f: %n", min, max);
        Double userNum = scanner.nextDouble();
        if (userNum < min || userNum > max) {
            return getDouble();
        }
        System.out.println();
        return userNum;
    }

}
