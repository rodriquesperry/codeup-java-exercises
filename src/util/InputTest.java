package util;

public class InputTest {

    public static void main (String[]args){
        Input first = new Input();

        if (first.yesNo("Want to enter a string? [y/n]")) {
            System.out.println("Please enter a string.");
            String response = first.getString();
            System.out.println(response);
        }

        if (first.yesNo("Would you like to enter a whole number?")) {
            System.out.println("Please enter a whole number");
            int integer = first.getInt();
            System.out.println(integer);
        }

        boolean b = first.yesNo("Do you feel like a developer?");
        System.out.println(b);

        if (first.yesNo("Would you like to enter a double?")) {
            System.out.println("Please enter a double.");
            double myDouble = first.getDouble();
            System.out.println(myDouble);
        }

//        if (first.yesNo("Would you like to convert a binary to an integer?")) {
//            System.out.println("Please enter a binary number");
//            int convertedBinary = first.getBinary();
//            System.out.println(convertedBinary);
//        }

    }
}
