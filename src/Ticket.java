public class Ticket {

    private static int ticketCount = 1000;

    private int ticketId;
    private String vehicleNumber;
    private String vehicleType;
    private int floorNumber;
    private int slotNumber;
    private long entryTime;

    public Ticket(String vehicleNumber,
                  String vehicleType,
                  int floorNumber,
                  int slotNumber,
                  long entryTime) {

        this.ticketId = ++ticketCount;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.floorNumber = floorNumber;
        this.slotNumber = slotNumber;
        this.entryTime = entryTime;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }
}
