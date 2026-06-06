/*
Shape arrary is the driver class. It instantiates Sphere, Cylinder, and Cone
and stores them in the Shape array and then prints each objects data.
*/

public class ShapeArray {
    public static void main(String[] args) {
        
        // Instantiate each shape
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(3.9, 7.0);
        Cone cone = new Cone(4.07996, 99.0); 

        // Store in an array
        Shape[] shapeArray = { sphere, cylinder, cone};

        // Loop through the array and print each objects data
        System.out.println();
        System.out.println("-----Shape Array Module 4 Assignment-----\n");
        for(Shape shape : shapeArray) {
            System.out.println(shape.toString());
            System.out.println();
        }
    }
    
}
