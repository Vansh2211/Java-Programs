import java.util.Scanner;
class Shape{
    double dimension;
    Shape(double dimension){
        this.dimension = dimension;
    }
}
class Circle extends Shape{
    double area,circum;
    Circle(double d){
        super(d);
    }
    void area(){
        area = 3.14*dimension*dimension;
        System.out.println("Area of a Circle"+area);
    }
    void circumference(){
        circum = 2*3.14*dimension;
        System.out.println("Circumference of circle is:"+circum);
    }
}
class Square extends Shape{
    double area,LenofDia;
    Square(double d){
        super(d);

    }
    void area(){
        System.out.println("Area of square is :"+(dimension*dimension));

    }
    void diagonal(){
        LenofDia = Math.sqrt(2)*dimension;
        System.out.println("Length of diagonal:"+LenofDia);
    }
}
public class Test{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of a circle" );
        int r = s.nextInt();
        Circle ob1 = new Circle(r);
        ob1.area();
        ob1.circumference();
        System.out.println("Enter the length of Square ");
        int l = s.nextInt();
        Square ob2 = new Square(l);
        ob2.area();
        ob2.diagonal();
        
    }
}
