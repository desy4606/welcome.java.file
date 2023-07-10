import static java.lang.Math.*;
/**
 * This is a class that represents a circle
 */
public class Circle {
    private double radius;
    private String color;

    /** default constructor */
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    /** constructor with the input of radius 
     * @param radius a double value which represents the radius of the circle
    */
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    /** return the radius */
    public double getRadius() {
        return radius;
    }

    /** return the area of the circle */
    public double getArea() {
        return pow(radius, 2) * PI;
    }

    /** overridden the toString method */
    public String toString() {
        return "The circle has radius of " + this.getRadius() + " and area of " + this.getArea();
    }
}