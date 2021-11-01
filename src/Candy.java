public class Candy {

    public String name;
    public String size;

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

    public static void main(String[] args) {
        Candy candy1 = new Candy("Butterfinger", "King size");
        System.out.println(candy1.whatCandy());
    }

}
