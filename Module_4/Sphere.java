/* 
Sphere class that extends shape with implemented 
parameterized constructor and computes the surface
area and volume of the sphere returning a string.
Surface area = 4 * PI * r^2
Volume = (4/3) * PI * r^3
*/

public class Sphere extends Shape{
    private double radius;
    
    // Parameterized Constructor
    public Sphere(double radius) {
        // Handle negative values as it would be physically meaningless
        if (radius < 0) {
            // Use a throw exception as values are being manually input
            throw new IllegalArgumentException("Radius and height must be a non-negative number");
        }
        this.radius = radius;
    }

    /* Compute surface area and volume of the sphere 
    using the built in math functions
    */

    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Return to a string representation 
    @Override
    public String toString() {
        return String.format("Sphere [radius = %.2f]%n Surface Area: %.4f%n Volume: %.4f", radius, surface_area(), volume()
        );
    }
}
