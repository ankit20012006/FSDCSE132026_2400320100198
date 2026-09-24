interface parent {
    default void hello() {
        System.out.println("Default test implementation");
    }
}
class child implements parent{
    public void bye() {
        System.out.println("Child implementation");
        hello();
    }
}
class child2 implements parent{
    @Override
    public void hello(){
        System.out.println("Hello overridden by child2");
    }
}


public class DefaultTester{
    public static void main(String[] args){
        child c = new child();
        c.hello();
        c.bye();
        parent p =new child();
        p.hello();
        child2 c2 = new child2();
        c2.hello();
        parent p2 = new child2();
        p2.hello();
        }
}