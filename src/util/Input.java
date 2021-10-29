package util;


import java.util.Scanner;

public class Input {
    public Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
        getString();
        yesNo();
        getInt(7, 14);
        getDouble(1, 10);
        }

    public String getString () {
        System.out.println("Enter a string.");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no.");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public int getInt ( int min, int max){
        System.out.println("Enter an integer.");
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            return getInt();
        }
        System.out.println();
        return userNum;
    }

    public int getInt () {
        System.out.println("Enter an integer.");
        return this.scanner.nextInt();
    }

    public double getDouble ( double min, double max){
        System.out.println("Enter a double.");
        Double userNum = scanner.nextDouble();
        if (userNum < min || userNum > max) {
            return getDouble();
        }
        System.out.println();
        return userNum;
    }

    public double getDouble () {
        System.out.println("Enter a double.");
        return this.scanner.nextDouble();
    }



}
