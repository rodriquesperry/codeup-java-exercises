package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public void setLength(int side) {
        this.length = side;
    }

    public void setWidth(int side) {
        this.width = side;
    }


}
