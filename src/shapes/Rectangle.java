package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        System.out.println("Below is the Rectangle getArea():");
        return (this.length * this.width);
    }

    public int getPerimeter() {
        System.out.println("Below is the Rectangle getPerimeter():");
        return ((2 * this.length) + (2 * this.width));
    }

    public static void main(String[] args) {
        Rectangle newRec = new Rectangle(12, 30);
        System.out.println("newRec.getArea() = " + newRec.getArea());
        System.out.println("newRec.getPerimeter() = " + newRec.getPerimeter());
    }

}
