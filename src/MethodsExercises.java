import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {
        System.out.println(addition(3, 2));
        System.out.println(subtraction(3, 2));
        System.out.println(multiplication(10, 9));
        System.out.println(division(10, 0));
        System.out.println(modulus(10, 3));
        System.out.println(getInteger(12, 24));
        System.out.println(factorial());

    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//        int prod = 0;
//        for (int i = 1; i <= num1; i++) {
//            prod += num2;
//        }
//        return sum;

        int prod = 0;
//        if (num2 == 0) {
//            return prod;
//        }

        if (num2 < 0) {
            prod = (num1 + multiplication(num1, num2 - 1))
;        }
        return prod;
    }

    public static int division(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static int modulus(int num1, int num2) {
        int i = num1 % num2;
        return i;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int value;

        do {
            System.out.printf("Enter an number between %d - %d.%n", min, max);
            value = scanner.nextInt();
            scanner.nextLine();
        } while (value < min || value > max);

        System.out.printf("The value you entered was correct: %d%n", value);
        return value;
    }

    public static int factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to see it's factorial.");
        int input = scanner.nextInt();
        scanner.nextLine();

        int value = 1;

        for (int i = 1; i <= input; i++) {
            value *= i;
        }
        return value;
    }




}


