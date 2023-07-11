public class CircleTester {
    public static void main(String []args) {
        Circle c1 = new Circle();

        System.out.println(c1);

        
        public Circle (double r, String c) { // 3rd constructor to construct a new instance of Circle with the given radius and color
            Circle c2 = new Circle();
            
            c2.r = 4;
            c2.c = "purple";

            c1.radius = 0.5; //testing an error

            Circle c3 = new Circle();

            c3.r = 5.5;
            
            System.out.println(c3.toString());   // explicit call
        }

        public String getColor() { return "purple"; } // Getter for instance variable color

        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
    }
}
