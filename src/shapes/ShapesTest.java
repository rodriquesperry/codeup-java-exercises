package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(12, 10);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());


        myShape = new Square(12);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());

        //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        //Answer: java: cannot find symbol
        //  symbol:   method getLength()
        //  location: variable myShape of type shapes.Measurable
        //This is caused by them not being apart of the interface.
        System.out.println("myShape.getLength() = " + myShape.getLength());
        System.out.println("myShape.getWidth() = " + myShape.getWidth());


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



