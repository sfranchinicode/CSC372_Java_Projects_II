/* 
Recursive Project Calculator
This Java program is used to simulate a user inputing numbers
and the program will multiply them all together. However, the 
multiplication must happen through recursion, not a simple loop
or a built in method
*/

public class RecursiveProduct {
    public static double recursiveProduct(double[] numbers, int index, int limit) {

        // Base case stop when limit is reached
        if (index == limit) {
            return 1;
        }
        // Multiply the current number by the product of the rest
        else {
            return numbers[index] * recursiveProduct(numbers, index + 1, limit);
        }
    }
}
