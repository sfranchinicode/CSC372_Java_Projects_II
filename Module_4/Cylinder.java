/*
Cylinder class that extends Shape class and finds surface area
and volume and returns to string format
Surface Area = 2 * PI * r * (r + h)
Volume = PI * (r^2) * h
 */

public class Cylinder extends Shape { 
    private double radius;
    private double height;

    // Parameter Constructor
    public Cylinder(double radius, double height){
        // Handle negative values as it would be physically meaningless
        if (radius < 0 || height < 0) {
            // Use a throw exception as values are being manually input
            throw new IllegalArgumentException("Radius and height must be a non-negative number");
        }
        this.radius = radius;
        this.height = height;
    }

    // Compute surface area and volume
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() { 
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [radius = %.2f, height = %.2f]%n Surface Area: %.4f%n Volume: %.4f", radius, height, surface_area(), volume());
    }
}
