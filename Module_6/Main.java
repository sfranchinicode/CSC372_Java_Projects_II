import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Create ArrayList to store Student objects
        ArrayList<Student> student = new ArrayList<>();

        // Add 10 random students to be sorted
        student.add(new Student(11, "John Mark", "123 Main St"));
        student.add(new Student(22, "Jon Snow", "234 Main St"));
        student.add(new Student(13, "Jon Snow", "345 Marsh St"));
        student.add(new Student(4444, "John Bluey", "444 9th Ave"));
        student.add(new Student(5576, "John Geen", "987 78th St"));
        student.add(new Student(6676, "Jessica Brown", "111 Applewood St"));
        student.add(new Student(71, "Jon Francisco", "99876 Maple Ter"));
        student.add(new Student(811, "Jonnie Anderson", "667 N. Wood Ave"));
        student.add(new Student( 9, "Jonathan Yang", "66553 S. Anderson Dr"));
        student.add(new Student(10, "Joshua Puller", "1976 Marine Coprs Drive"));

        // Sort by name using NameComparator and print results
        SelectionSort.sort(student, new NameComparator());
        System.out.println("\nSorted by Name: ");
        for (Student s : student) {
            System.out.println(s.getRollno() + " " + s.getName() + " " + s.getAddress());
        }

        // Sort by rollno using RollnoComparator and print results
        SelectionSort.sort(student, new RollnoComparator());
        System.out.println("\nSorted by Roll Number: ");
        for (Student s : student) {
            System.out.println(s.getRollno() + " " +  s.getName() + " " + s.getAddress());
        }
        // Added println for aesthetics 
        System.out.println();
    }
}
