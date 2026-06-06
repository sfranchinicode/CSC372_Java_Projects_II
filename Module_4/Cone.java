/*
Cone class extends to Shape and finds surface area
and volume and returns in string format
Surface area = PI * r * (r + sqrt(r^2 +h^2))
Volume = (1/3) * PI * r^2 * h
*/

public class Cone extends Shape {
    private double radius;
    private double height;

    // Parameterized Constructor
    public Cone(double radius, double height) {
        // Handle negative values as it would be physically meaningless
        if (radius < 0 || height < 0) {
            // Use a throw exception as values are being manually input
            throw new IllegalArgumentException("Radius and height must be a non-negative number");
        }
        this.radius = radius;
        this.height = height;
    }

    /*
    Compute surface area and volume using slantHeight to store and 
    make calculations easier for return
    */
    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2)+ Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cone [radius = %.2f, height = %.2f]%n Surface Area: %.4f%n Volume: %.4f", radius, height, surface_area(), volume());
    }
}
