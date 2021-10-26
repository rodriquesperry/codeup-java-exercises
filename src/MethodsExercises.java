public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3, 2));
        System.out.println(subtraction(3, 2));
        System.out.println(multiplication(10, 9));
        System.out.println(division(10, 0));
        System.out.println(modulus(10, 3));
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum += num2;
        }
        return sum;

    }

    public static int division(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


}
