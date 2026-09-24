package Java;
import java.util.Scanner;
class BankAccount {
    private double balance;
    BankAccount(double b){
        balance = b;
    }
    void deposit(double amt){
        balance += amt;
        System.out.println("Amount Deposited");
    }
    void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Current Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args){
       System.out.println("The program is coded by Ankit Dwivedi, 2400320100198");
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000);
        int choice;
        do{
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display Balance");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Amount: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.display();
                    break;
            }
        }while(choice != 4);
    }
}

