import java.util.Scanner;

public class HighLow {

    static int random;
    static Scanner scanner = new Scanner(System.in);
    static int userGuess;
    static int[] getUserGuesses = new int[3];
    static int totalGuessCount = 0;

    public static void main(String[] args) {

        do {
            System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
            userGuess = scanner.nextInt();
            System.out.println(userGuess);
            random = (int) (Math.random() * (100 -1)) + 1;
            totalGuessCount += 1;
        } while (userGuess < 1 || userGuess > 100);

        System.out.println(random + " is the random number");

        do {
            if (userGuess < random) {
                System.out.println("Your number is too Low, guess again!");
                userGuess = scanner.nextInt();
                totalGuessCount++;
            } else if (userGuess > random) {
                System.out.println("Your number is too High, guess again!");
                userGuess = scanner.nextInt();
                totalGuessCount++;
            }
        } while (userGuess != random);
        System.out.println(totalGuessCount);
        if (totalGuessCount == 3) {
            System.out.println("Sorry, you guessed too many times!");
        }

        if (userGuess == random) {
            System.out.printf("Your guess is %d and the random number is %d%n", userGuess, random);
            System.out.println("GOOD GUESS!! You're reading my mind!");
        }

    }
}
