package Java;
public class palindrome{
    public static void main(String[] args){
        System.out.println("The program is coded by Ankit Dwivedi, 2400320100198");
        String str="madam";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}