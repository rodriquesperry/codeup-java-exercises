import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {

        double[] prices = new double[4];
        final int numberOfSides = 6;

        int [] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length);
        System.out.println("diceSides[0] = " + diceSides[0]);

        String[] mybag = {"Snickers", "Resses", "Brussel sprouts"};

        System.out.println("mybag.length = " + mybag.length);
        System.out.println("mybag[1] = " + mybag[1]);

//        for (int i = 0; i < mybag.length; i++) {
//            System.out.println(mybag[i]);
//        }

        for (String candy : mybag) {
            System.out.printf("%s is a piece of candy you just pulled out of the bag%n", candy);
        }

        String[] anotherBag = new String[12];

        System.out.println("anotherBag[0] = " + anotherBag[0]);
        System.out.println("anotherBag[5] = " + anotherBag[5]);

        Arrays.fill(anotherBag, "100 Grand");

        //Java "ForEach Loop" to sort
        for (String candy : anotherBag) {
            System.out.println(candy);
        }

        //Are two Arrays equal
        System.out.println("Arrays.equals(mybag, anotherBag) = " + Arrays.equals(mybag, anotherBag));
        System.out.println("Arrays.equals(mybag, mybag) = " + Arrays.equals(mybag, mybag));

        //Increase the size of an Array
        String[] mybagPlusOne = Arrays.copyOf(mybag, mybag.length + 1);
        System.out.println("mybag.length = " + mybag.length);
        System.out.println("mybagPlusOne.length = " + mybagPlusOne.length);

        //Add to Array and item
        mybagPlusOne[mybagPlusOne.length - 1] = "m&m";

        for (String candy : mybagPlusOne) {
            System.out.println(candy);
        }

        //Stringify an Array
        System.out.println("Arrays.toString(mybagPlusOne) = " + Arrays.toString(mybagPlusOne));

        //Searching inside an Array
        int mAndmindex = Arrays.binarySearch(mybagPlusOne, "m&m");
        System.out.println("mAndmindex = " + mAndmindex);

        //Sorting Arrays
        Arrays.sort(mybagPlusOne);
        for (String candy : mybagPlusOne) {
            System.out.println("Sorted candy: " + candy);
        }

        //Two dimensional Arrays (Array of arrays)
        int[][] matrix = {
                {1, 2, 3},//arr1
                {4, 5, 6},//arr2
                {7, 8, 9} //arr3
        };

        System.out.println("matrix[0] = " + Arrays.toString(matrix[0]));
        //Doesn't print out the string representation of the Array
        System.out.println("matrix[0] = " + matrix[0]);
        System.out.println("matrix[1] = " + Arrays.toString(matrix[1]));
        System.out.println("matrix[2] = " + Arrays.toString(matrix[2]));

        System.out.println("matrix[1][1] = " + matrix[1][1]);


//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//            System.out.print("| ");
//            for (int n : row) {
//                System.out.print(n + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");
    }
}
