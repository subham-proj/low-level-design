import Vehicle.Vehicle;
import Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int levelNumber;
    private List<ParkingSpot> parkingSpots;
    
    public Level(int levelNumber, int numberOfSpots) {
        this.levelNumber = levelNumber;
        // 5:4:1 :: BIKE:CAR:TRUCK
        int bikeParkingSpots = (int)(0.5 *  numberOfSpots);
        int carParkingSpots = (int)(0.4 * numberOfSpots);
        parkingSpots = new ArrayList<>(numberOfSpots);
        
        for (int i = 1; i <= numberOfSpots; i++) {
            if (i <= bikeParkingSpots) {
                parkingSpots.add(new ParkingSpot(i, VehicleType.BIKE));
            } else if (i >= bikeParkingSpots + 1 && i <= bikeParkingSpots + carParkingSpots) {
                parkingSpots.add(new ParkingSpot(i, VehicleType.CAR));
            } else if (i >= bikeParkingSpots + carParkingSpots + 1) {
                parkingSpots.add(new ParkingSpot(i, VehicleType.TRUCK));
            }
        }
    }
    
    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isAvailable() && vehicle.getType() == parkingSpot.getVehicleType()) {
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    
    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(vehicle.getType() == parkingSpot.getVehicleType() && parkingSpot.getParkedVehicle() != null) {
                parkingSpot.unparkVehicle();
                return true;
            }
        }
        
        return false;
    }
    
    public void displayAvailablity() {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.isAvailable()) {
                System.out.println(parkingSpot.getVehicleType() +" is available.");
            }
        }
    }
    
}
