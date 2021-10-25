import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered " + userInt);

        // What happens if you input something that is not an integer?
            // Exception in thread "main" java.util.InputMismatchException
            //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            //	at java.base/java.util.Scanner.next(Scanner.java:1594)
            //	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            //	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            //	at ConsoleExercises.main(ConsoleExercises.java:11)

        // Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.println("Enter word 1: ");
//        System.out.println("Enter a word 2: ");
//        System.out.println("Enter a word 3: ");
//
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//
//        System.out.println("Your first word is: " + word1);
//        System.out.println("Your second word is: " + word2);
//        System.out.println("Your third word is: " + word3);
        // What happens if you enter less than 3 words?
            //Never returns
        // What happens if you enter more than 3 words?
            // Only returns the first three words

//        System.out.println("Enter a sentence: ");
////        String mySentence = scanner.next();
//        String mySentence = scanner.nextLine();
//        System.out.printf("Your sentence was: %s", mySentence);

        System.out.print("Enter length of room: ");
        int roomLength =  scanner.nextInt();

        System.out.print("Enter width of room: ");
        int roomWidth = scanner.nextInt();

        int perimeter = 2 * (roomLength + roomWidth);
        int area = roomLength * roomWidth;
        System.out.printf("The area of your room is %d", area);
        System.out.printf("\nThe perimeter of your room is %d", perimeter);

    }

}
