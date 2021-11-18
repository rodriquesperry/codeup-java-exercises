import java.util.Locale;

public class ExceptionsLecture {

    public static void main(String[] args) throws Exception {

//        System.out.println("Hello World!");

//        try {
//            throw new Exception("Hey, something bad happened!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //A deeper example of try catch
//        try {
//
//            System.out.println("Lets see if we can divide by zero");
//            int result = 1 / 0;
//            System.out.println("I did it!");
//
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }



        //An even deeper example - a bigger try catch

//        try {
////            throw new RuntimeException("Something went wrong!\n Error!\n");
//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase());
//        } catch(NullPointerException e) {
//            System.out.println("Null exception fired.");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (RuntimeException e) {
//            System.out.println("Runtime exception fired");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (Exception e) {
//            System.out.println("generic exception fired");
//            e.printStackTrace();
//            e.getMessage();
//        } finally {
//            System.out.println("This will always run!");
//        }

        //Final example: let's trigger an array out of bounds and deal with it programmatically
        try {
            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[2]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Most specific");
            e.printStackTrace();
            e.getMessage();
        } catch (RuntimeException e) {
            System.out.println("sorta specific");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Least specific");
            e.printStackTrace();
            e.getMessage();
        }
    }
}
