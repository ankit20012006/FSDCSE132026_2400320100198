package Java;

public class prime {
    public static void main(String[] args){
      System.out.println("The program is coded by Ankit Dwivedi, 2400320100198");        int num =29;
        boolean isPrime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    } 
}
