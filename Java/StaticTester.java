interface A{
    static void fun(){
        System.out.println("I am static Method");
        
    }
}
class child implements A{
    public void hello(){
        A.fun();
    }

// @Override
// public void fun(){
//     System.out.println("cannot be overridden");
// }
}

void main(){
    System.out.println("Testing in static method in interface");
    child c =new child();
    c.hello();
    A.fun();
}