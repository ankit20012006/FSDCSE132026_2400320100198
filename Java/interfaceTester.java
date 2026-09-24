interface A{
    int y=25;
    void f1();
}
interface B{
    void f2();
}
interface C extends A,B{
    void f3();
}
class D implements A,B{
    public void f1(){
        System.out.println("F1 in D");
    }
    public void f2(){
        System.out.println("F2 in D");
    }
    public void f3(){
        System.out.println("F3 in D");
    }
}

interface M1{

}


public class interfaceTester {
    public static void main(String[] args){
        E obe = new E();
        obe.f1();
        obe.f2();
        obe.f3();
        obe.m1();
        obe.hello(); 
    }
}
