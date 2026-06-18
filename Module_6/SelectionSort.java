import java.util.ArrayList;
import java.util.Comparator;

// Custom selection sort implementation not using Java Collections Library
public class SelectionSort {
    public static void sort(ArrayList<Student> list, Comparator<Student> comparator) {
        
        // Outer loop moves forward through each position in list
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i; // Assume current position is minimum

            // Inner loop finds the smalles element after position i
            for (int j = i + 1; j < list.size(); j++) {

                // If j is smaller than current minimum, update minIndex
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Student minimum element into position i using temp as placeholder
            Student temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
