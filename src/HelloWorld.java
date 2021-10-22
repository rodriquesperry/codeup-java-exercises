

public class HelloWorld {
    public static void main(String[] args) {



        System.out.print("Hello, ");
        System.out.print("World!");
// #1
        int myFavoriteNumber = 10;
        System.out.println("My favorite number is " + myFavoriteNumber);
// #2, #3 & #4
        String myString = "This is a string value.";
//        String myString = 'c'; //java: incompatible types: char cannot be converted to java.lang.String
//        String myString = 3.14159; //java: incompatible types: double cannot be converted to java.lang.String
        System.out.println(myString);


// #5 - #9
//        long myNumber; //java: variable myNumber might not have been initialized
//        myNumber = 123;

        float myNumber;
//        myNumber = 3.14; //java: incompatible types: possible lossy conversion from double to float
//        myNumber = 3.14F;
        myNumber = (float) 3.14;
        System.out.println(myNumber);



// #10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

// #11
//        String class; //java: not a statement

// #12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')

// #13
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        System.out.println("x is equal to: " + x);
        System.out.println("y is equal to: " + y);
// #14
//        int number = 2147483648; //java: integer number too large

//        byte number = Integer.MAX_VALUE; //java: incompatible types: possible lossy conversion from int to byte

    }
}
