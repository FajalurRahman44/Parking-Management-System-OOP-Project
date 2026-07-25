public class ParkingSlot {

    private int slotNumber;
    private boolean occupied;
    private String supportedType;

    private Vehicle parkedVehicle;
    private long parkedTime;

    public ParkingSlot(int slotNumber, String supportedType) {
        this.slotNumber = slotNumber;
        this.supportedType = supportedType;
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public String getSupportedType() {
        return supportedType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public long getParkedTime() {
        return parkedTime;
    }

    public void parkVehicle(Vehicle vehicle) {

        occupied = true;
        parkedVehicle = vehicle;
        parkedTime = System.currentTimeMillis();
    }

    public void removeVehicle() {

        occupied = false;
        parkedVehicle = null;
        parkedTime = 0;
    }
}
