public class CircleTester {
    Circle c1 = new Circle(12.5, "blue");

        System.out.println("The color of the circle is " + c1.getColor());

         
        //test accessing a private variable (q3)
        //System.out.println(c1.radius);

        System.out.println("calling toString() explicitly:");
	System.out.println(c1.toString());
        System.out.println("\n calling toString() implicitly:");
        System.out.println(c1);

        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
}
