public class CircleTester {
    Circle c1 = new Circle(4.0, "purple");

        System.out.println("The color of the circle is " + c1.getColor() );

         
        //test for error message when trying to access a private variable 
        //System.out.println(c1.radius);

	System.out.println(c1.toString()); // explicitly calling toString();
        System.out.println(c1); // implicitly calling toString();

        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
}
