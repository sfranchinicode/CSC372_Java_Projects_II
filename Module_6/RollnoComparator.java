import java.util.Comparator;

// Comparator class to sort Students by their roll number ascending
public class RollnoComparator implements Comparator<Student>{
    public int compare(Student a, Student b) {
        return a.getRollno() - b.getRollno();
    }
}
