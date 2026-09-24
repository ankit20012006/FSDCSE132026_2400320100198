package Java;
class Student {
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args){
        Student s1 = new Student(101, "Ankit", 89.5);
        Student s2 = new Student(102, "Amritanshu", 92.0);
        s1.display();
        s2.display();
    }
}
