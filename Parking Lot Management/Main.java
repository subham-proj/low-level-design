import Vehicle.Bike;
import Vehicle.Car;
import Vehicle.Truck;
import Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Parking Lot Management ---------");
        ParkingLot parkingLot = ParkingLot.getInstance();
        
        parkingLot.addLevels(new Level(1,5));
        parkingLot.addLevels(new Level(2,5));
        parkingLot.displayAvailablity();
        Vehicle truck = new Truck();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        parkingLot.park(truck);
        parkingLot.park(truck);
        parkingLot.park(truck);
        parkingLot.park(car);
        parkingLot.park(bike);
        parkingLot.unpark(truck);
        
        parkingLot.displayAvailablity();
    }
}
