 public class SealedTest {
    sealed interface Shape permits Circle, Rectangle, Square{
        double area();
    }
    reco rd Circle(double radius) implements Shape{
        public double area(){
            return Math.PI*radius*radius;
        }
    }
    record Rectangle(double length,double width) implements Shape{
        public double area(){
            return length*width;
        }
    }
    final class Square implements Shape{
        private double side;
        public Square(double side){
            this.side=side;
        }
        public double area(){
            return side*side;
        }
    }
}  