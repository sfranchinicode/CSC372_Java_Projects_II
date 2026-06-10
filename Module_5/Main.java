import java.util.Scanner;
/*
Main class to handle user input, display output,
and will call the recursive method.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Declare an array of numbers
        double[] numbers;

        // Allocate for max of 5 integers
        numbers = new double[5]; 

        // Prompt and get the users numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            System.out.println("Enter number " + (i +1));
            numbers[i] = scnr.nextDouble(); 

            // Show running product and entries left
            double currentProduct = RecursiveProduct.recursiveProduct(numbers, 0, i + 1);
            System.out.println("Current product so for: " + currentProduct);
            System.out.println("Numbers left to enter: " + (numbers.length - (i + 1)));
        }
        
        /* 
        Declare product variable to be displayed
        and call recursive method
        */
        double product = RecursiveProduct.recursiveProduct(numbers, 0, numbers.length);
        System.out.println();
        System.out.println("The product of your 5 numbers is: " +product);
        System.out.println();
    }
}
