package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected int length;
//    protected int width;

    public Rectangle(int length, int width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {

    }

    public void setWidth(int width) {

    }


    //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle? This is probably due to Rectangle being a subclass of Quadrilateral and implementing Measurable.
    public double getPerimeter() {
        return (2 * length + 2 * width);
    }

    public double getArea() {
        return length * width;
    }



//    public int getArea() {
//        System.out.println("Below is the Rectangle getArea():");
//        return (this.length * this.width);
//    }
//
//    public int getPerimeter() {
//        System.out.println("Below is the Rectangle getPerimeter():");
//        return ((2 * this.length) + (2 * this.width));
//    }
//
//    public static void main(String[] args) {
//        Rectangle newRec = new Rectangle(12, 30);
//        System.out.println("newRec.getArea() = " + newRec.getArea());
//        System.out.println("newRec.getPerimeter() = " + newRec.getPerimeter());
//    }

}
