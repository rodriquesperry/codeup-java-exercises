//import util.Input;
//
//import java.util.Scanner;
//
//public class DiceApp {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        boolean boolVal =
//
//       do {
//           System.out.println("Would you like to roll the dice? [y/n]");
//           String wannaRoll = scanner.nextLine();
//
//           if (wannaRoll.equalsIgnoreCase("y") || wannaRoll.equalsIgnoreCase("yes")) {
//               System.out.println("Enter the number of sides the dice has.");
//               int sidesOfDice = scanner.nextInt();
//               scanner.nextLine();
//
//               System.out.printf("On Two %dy sided dice:%ny", sidesOfDice);
//
//               int dice1 = (int) (Math.random() * sidesOfDice);
//               System.out.println("dice1 = " + dice1);
//
//               int dice2 = (int) (Math.random() * sidesOfDice);
//               System.out.println("dice2 = " + dice2);
//           }
//       } while (boolean boolVal == true);
//
//    }
//}
