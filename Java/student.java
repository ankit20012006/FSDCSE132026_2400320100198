import java.util.Scanner;

//throws
public class student{

 public static void main(String[] args) {
    try{
    int marks,roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter roll number:");
    roll = scan.nextInt();
    if(roll<0)
        throw new Exception("Roll number should be larger than zero");
    System.out.println("Enter marks:");
    if(marks<0 || marks>100)
        throw new Exception("Marks should be between 0 and 100");
    marks = scan.nextInt();
    System.out.println("Roll number: " + roll);
    System.out.println("Marks: " + marks);
  }
  catch(Exception ex){
    System.out.println(ex.getMessage());
  }
}
}