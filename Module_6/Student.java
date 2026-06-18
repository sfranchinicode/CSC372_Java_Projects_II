
public class Student {

    // Constructor to initialize student fields
    public Student(int rollno, String name, String address){ 
        if (rollno < 0) {
            throw new IllegalArgumentException("\nRoll number cannot be a negative!");
        }
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Student roll number, name and address
    int rollno;  
    String name;
    String address;

    // Return student roll number, name and address 
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

