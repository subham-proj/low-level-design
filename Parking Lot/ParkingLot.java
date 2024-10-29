import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<Level> levels;
    private ParkingLot(){
        levels = new ArrayList<>();
    }
    
    public static synchronized ParkingLot getInstance() {
        if(instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }
    
    public void addLevels(Level level) {
        levels.add(level);
    }
    
    public void park(Vehicle vehicle) {
        for(Level level: levels) {
            if(level.parkVehicle(vehicle)) {
                System.out.println(vehicle.getType() + " parked successfully!");
                return;
            }
        }
        
        System.out.println("Parking full!");
    }
    
    public void unpark(Vehicle vehicle) {
        for(Level level: levels) {
            if(level.unparkVehicle(vehicle)) {
                System.out.println("Unparked successfully");
                return;
            }
        }
        
        System.out.println("No parked vehicle matching your input found!");
    }
    
    public void displayAvailablity() {
        for(Level level: levels) {
            level.displayAvailablity();
        }
    }
}
