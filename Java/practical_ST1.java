class Student {
    String name;
    int age;
    String course;


    // Parameterized Constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Member function to display details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student s1 = new Student("Ankit", 18, "Computer Science");
        Student s2 = new Student("Rahul", 19, "Mechanical");

        // Displaying student details
        s1.display();
        s2.display();
    }
}