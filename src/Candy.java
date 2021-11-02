import java.util.Arrays;

public class Candy {

    public String name;
    public String size;
    public String[] descriptors;

    public String whatCandy() {
       return String.format("Ahhh, a %s! I see that you got the %s of it. Sounds good! :)%n", name, size);
    }

    public Candy(String candyName) {
        this.name = candyName;
        this.size = "Fun size";
    }

    public  Candy(String candyName, String candySize) {
        this.name = candyName;
        this.size = candySize;
    }

    public Candy(String candyName, String candySize, String[] descriptors) {
        this.name = candyName;
        this.size = candySize;
        this.descriptors = descriptors;
    }

    public static Candy[] addCandy(Candy[] oldArray, Candy newCandy){
        Candy[] newarrPlusOne = Arrays.copyOf(oldArray, oldArray.length+1); //copy oldarr to the new one and add an additional index of length
        newarrPlusOne[newarrPlusOne.length-1] = newCandy;
        return newarrPlusOne;
    }

    public static void main(String[] args) {
        Candy candy1 = new Candy("Butterfinger", "King size");
        System.out.println(candy1.whatCandy());
        //Add new candy individually
        Candy mAndMs = new Candy("M&M","king-size bag", new String[] {"bite-size", "candy-coated", "chocolate"});
        Candy kitkat = new Candy("Kitkat","king-size bag", new String[] {"wafer", "chocolate-covering", "classic"});

        System.out.println(Arrays.toString(mAndMs.descriptors));

        //Create a new candy Array with the candy you created
        Candy[] mybag = {kitkat, mAndMs};

        for (Candy singleCandy: mybag) {
            String descriptors = Arrays.toString(singleCandy.descriptors);
            descriptors = descriptors.substring(1, descriptors.length() - 1);
            System.out.printf("Here's a %s that is a %s - it's described as having the following traits %s%n",singleCandy.name, singleCandy.size, descriptors);
        }
    }

}
