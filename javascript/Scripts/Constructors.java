public class Car{
    String carColor;

    Car(){
        System.out.println("Default constructors");

    }
    Car(String carColor){
        this.carColor = carColor;
    }
    Car(Car ob){
        carColor = ob.carColor;
    }

    public void disp(){
        System.out.println("Color of the car is "+carColor);
    }

    public static void main(String args[]){
        Car c1 = new Car();
        Car c2 = new Car("Blue");
        c2.disp();
        Car c3 = new Car(c2);
        c2.disp();
    }
}