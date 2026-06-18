import java.util.Comparator;

// Comparator class to sort Student names alphabetically
public class NameComparator implements Comparator<Student>{

    // Returns a negative if a comes before b, positive if after, o if equal
    public int compare(Student a, Student b) {
        int result = a.getName().compareTo(b.getName());
        if (result == 0) {
            return a.getRollno() - b.getRollno(); // tiebreaker
        }
        return result;
    }
}
