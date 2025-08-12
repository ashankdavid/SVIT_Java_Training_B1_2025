package OOPs;

public class Student {
    String name;
    int usn;

    Student(String n, int u){
        name = n;
        usn = u;
    }

    void printDetails(){
        System.out.println("Student name : " + name);
        System.out.println("Student USN: " + usn);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 123);
        Student s2 = new Student("Abhishek", 345);
        s1.printDetails();
        s2.printDetails();
    }
}
