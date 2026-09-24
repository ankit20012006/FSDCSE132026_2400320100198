abstract class Shape{
     abstract void area();
     public Shape(){
        if(this instanceof Circle)
            System.out.println("Circle Shape Created");
        else if(this instanceof Triangle)
            System.out.println("Rectangle Shape Created");
        else if(this instanceof Triangle)
            System.out.println("Triangle Shape Created"); 
     }
}
class Circle extends Shape{
    int rad;
    public Circle(int r){
        rad = r;
    }
    @Override
    public void area(){
        System.out.println("Area of circle:"+(3.14f*rad*rad));
    }
}

class Triangle extends Shape{
    int height,base;
    public Triangle(int h,int b){
     height= h;
     base = b;
    }
    @Override
    public void area(){
        System.out.println("Area of Triangle is:"+(.5f*height*base));
    }
}

class Rectangle extends Shape{
    int height,width;
    public Rectangle(int h,int w){
     height= h;
     width = w;
    }
    @Override
    public void area(){
        System.out.println("Area of Rectangle is:" + (height*width));
    }
}


public class AbstractTester{
public static void main(String[] args){
    Shape []shape ={
        new Circle(4),
        new Rectangle(23,3),
        new Triangle(4,8),
        new Circle(14),
        new Rectangle(2,33),
        new Triangle(24,80)
    };
    for(Shape s:shape)
        s.area();
}
}