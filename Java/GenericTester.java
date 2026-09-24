//generic class caan be defined not for any specific datatype the datatype of class
// member will be decided at object creation, It uses <> to use datatype during object creation.

class Item<T>{
    T a,b;
    public Item(T p, T q){
        a=p;
        b=q;
    }

    void swap(){
        System.out.println("Before swap");
        show();
        T c = a;
        a=b;
        b=c;
        System.out.println("After swap");
        show();
    }

    void show() {
        System.out.println("a" + a + "," + "b:" + b);
    }
}