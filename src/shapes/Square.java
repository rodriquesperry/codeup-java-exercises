package shapes;

public class Square extends Rectangle{
    public int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        System.out.println("Below is the Square getArea():");

        return (side * side);
    }

    public int getPerimeter() {
        System.out.println("Below is the Square getPerimeter():");
        return (4 * side);
    }
}
