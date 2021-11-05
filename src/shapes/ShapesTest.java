package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(4, 5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());


        myShape = new Square(5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

//Why does the code fail to compile if you leave off the getPerimeter method in Rectangle? This is probably due to Rectangle being a subclass of Quadrilateral and implementing Measurable.

//What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        //Answer: java: cannot find symbol
        //  symbol:   method getLength()
        //  location: variable myShape of type shapes.Measurable

//        System.out.println("myShape.getLength() = " + myShape.getLength());
//        System.out.println("myShape.getWidth() = " + myShape.getWidth());




//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
    }
}



