package Vehicle;

public class Test {
    public static void main(String [] args){
        Vehicle vel=new Vehicle();
        Vehicle car=new Car();
        Vehicle tru=new Truck();

        vel.setWheels(4);
        vel.getWheels();
        vel.setWeight(45);
        vel.getWeight();
        car.setWheels(4);
        car.getWheels();
        car.setWeight(45);
        car.getWeight();

        ((Car) car).setLoader(5);
        ((Car) car).getLoader();

        ((Truck) tru).setPayload(6);
        ((Truck) tru).getPayload();


    }
}
