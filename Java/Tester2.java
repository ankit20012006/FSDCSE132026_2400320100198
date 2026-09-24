import java.util.function.*;
class Tester{
    public String hello(int a){
        return "Value =" + a;
    }
    Function <Integer, String> hello2 = (i)-> "Value="+i;
    public static void main(String[] args){
        Tester t = new Tester();
        System.out.println(t.hello(25));
        System.out.println(t.hello2.apply(50));
    }
}