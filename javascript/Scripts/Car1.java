public class Car1{
    public Car1(){
        System.out.println("class Car");

    }
    public void vehicleType(){
        System.out.println("Vehicle Type:Car");
    }
}
class Maruti extends Car1{
    public Maruti(){
        System.out.println("Class MARUTI");
    }
    public void brand(){
        System.out.println("Brand Maruti");
    }
    public void speed(){
        System.out.println("Max:90kmph");
    }
}
public class MarutiSwift extends Maruti{
    public MarutiSwift(){
        System.out.println("Maruti model: MarutiSwift");

    }
    public void speed(){
        System.out.println("Max:80kmph");
    }
    public static void main(String args[]){
        MarutiSwift obj =new MarutiSwift();
        obj.vehicleType();
        obj.brand();
        obj.speed(); 
    }
}