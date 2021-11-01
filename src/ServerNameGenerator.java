public class ServerNameGenerator {

   static String[] adjs = {"old", "good", "new", "first", "last", "long", "great", "little", "own", "right"};
   static String[] nouns = {"computer", "plate", "table", "phone", "wallet", "pillows", "glass", "books", "library", "brother"};


    public static String randomEl(String[] array) {
        int randoEl = (int) (Math.random() * array.length -1);
        System.out.println(randoEl);
        return array[randoEl];
    }

    public static void main(String[] args) {
        System.out.println("Your server name is: " + randomEl(adjs) + "-" + randomEl(nouns));

    }

}
