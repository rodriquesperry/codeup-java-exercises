package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    public double getCircumference() {
        return (2 * Math.PI * this.radius);
    }
}
