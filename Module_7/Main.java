import java.util.Scanner;
/*
Main class to handle user input, display output,
and will call the recursive method.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Let user pick how many numbers they need to multiply
        System.out.println("\nHow many numbers would you like to multiply together?");
        int userNum = scnr.nextInt();

        // Allocate for user input
        double[] numbers = new double[userNum];

        // Prompt and get the users numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            System.out.println("Enter number " + (i +1));
            while (!scnr.hasNextDouble()) {
                System.out.println();
                System.out.println("Must be a valid number such as 1, 2, 3. Try again.");
                scnr.next();
            }
            numbers[i] = scnr.nextDouble(); 

            // Show running product and entries left
            double currentProduct = RecursiveProduct.recursiveProduct(numbers, 0, i + 1);
            System.out.println("\nCurrent product so for: " + currentProduct);
            System.out.println("Numbers left to enter: " + (numbers.length - (i + 1)));
        }
        
        /* 
        Declare product variable to be displayed
        and call recursive method
        */
        double product = RecursiveProduct.recursiveProduct(numbers, 0, numbers.length);
        System.out.println();
        System.out.println("The product of your numbers are: " +product);
        System.out.println();

        scnr.close();
    }
}
