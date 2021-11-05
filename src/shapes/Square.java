package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }


}
