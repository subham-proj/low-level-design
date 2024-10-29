package Vehicle;

public class Bike implements Vehicle{
    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }
}
