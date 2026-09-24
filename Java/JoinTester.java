class Account{
    private int bal;
    public Account(int bal){
        this.bal=bal;
    }
    public int getBalance(){
        return bal;
    }
    public void deposit(String name,int amt){
        bal+=amt;
        System.out.println("Deposited by " + name + " Amount: " + amt + " Balance: " + bal);
    }
}
class User extends Thread{
    Account acc;
    public User(Account acc){
        this.acc=acc;
    }
    public void run(){
        acc.deposit(getName(), 1000);
    }
}
public class JoinTester {
    public static void main(String[] args){
        Account account = new Account(5000);
        User user1 = new User(account);
        User user2 = new User(account);
        user1.setName("Ankit");
        user2.setName("Berry");
        user1.start();
        user2.start();
        user1.join();
        user2.join();
        System.out.println("Final Balance:" + account.getBalance());
    }
}
