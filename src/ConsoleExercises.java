import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered " + userInt);

        // What happens if you input something that is not an integer?
            // Exception in thread "main" java.util.InputMismatchException
            //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            //	at java.base/java.util.Scanner.next(Scanner.java:1594)
            //	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            //	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            //	at ConsoleExercises.main(ConsoleExercises.java:11)
    }

}
