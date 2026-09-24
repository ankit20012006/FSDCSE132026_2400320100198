class Outer {
    void funOut() {
        System.out.println("I am Outer fun");
    }

    class Inner {
        void funIn() {
            System.out.println("I am Inner fun");
            funOut();
        }
    }

    void test() {
        Inner inObj = new Inner();
        inObj.funIn();
    }
}

public class Main   {
    public static void main(String[] args) {
        System.out.println("Inner class");

        Outer oObj = new Outer();
        oObj.funOut();
        oObj.test();

    
        Outer.Inner inObj = new Outer().new Inner();
        inObj.funIn();

        Outer.Inner inObj2 = oObj.new Inner();
        inObj2.funIn();
    }
}