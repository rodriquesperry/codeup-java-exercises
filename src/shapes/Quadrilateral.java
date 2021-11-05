package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //constructor
    public Quadrilateral(double length, double width) {
        //super is coded out because I commented out the constructor from Shape class
//        super(length, width);
        this.length = length;
        this.width = width;
    }
    //getters
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    //setters
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
