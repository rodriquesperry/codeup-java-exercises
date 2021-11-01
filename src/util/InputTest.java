package util;

public class InputTest {

    public static void main (String[]args){
        Input first = new Input();

        String myString = first.getString();
        System.out.println("myString = " + myString);

        System.out.println("Do you feel like a developer?");
        boolean developer = first.yesNo();
        System.out.println("developer = " + developer);

        int myInt = first.getInt();
        System.out.println("myInt = " + myInt);

        int myInt2 = first.getInt(3, 15);
        System.out.println("myInt2 = " + myInt2);

        double myDouble = first.getDouble();
        System.out.println("myDouble = " + myDouble);

        double myDouble2 = first.getDouble(1.5, 10.5);
        System.out.println("myDouble2 = " + myDouble);
    }
}
