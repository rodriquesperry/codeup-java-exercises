import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sup!, my name is Bob.");
        System.out.println("I'm a lackadaisical teenager, without many friends.");
        System.out.println("Wanna chop it up with me?");

        String userContinue = "y";

        do {
            System.out.println("Talk with Bob. You can ask questions, make statements or just say nothing.");
            String userQuestion = scanner.nextLine();

            if (userQuestion.endsWith("?")) {
                System.out.println("Bob answered: Sure");
            } else if (userQuestion.endsWith("!")) {
                System.out.println("Bob answered: Whoa, chill out!");
            } else if (userQuestion.equals(" ")) {
                System.out.println("Bob answered: Fine. Be that way!");
            } else {
                System.out.println("Bob answered: Whatever.");
            }
            System.out.println("You want to keep talking? [y/n]");
            userContinue = scanner.next();
            scanner.nextLine();
        } while (userContinue.equals("y"));
    }
}
