package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected int length;
//    protected int width;

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (2 * this.length + 2 * this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
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
