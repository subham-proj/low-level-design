import Vehicle.Vehicle;
import Vehicle.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;
    
    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }
    
    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }
    
    public synchronized void parkVehicle(Vehicle vehicle) {
        if (isAvailable() && vehicle.getType() == vehicleType) {
            parkedVehicle = vehicle;
        }
    }
    
    public synchronized void unparkVehicle() {
        parkedVehicle = null;
    }
    
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    
    public int getSpotNumber() {
        return spotNumber;
    }
    
    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
