import java.util.Objects;

public class Vehicle {

    private String vehicleNumber;
    private String type;
    private String ownerName;

    public Vehicle(String vehicleNumber, String type, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Vehicle))
            return false;

        Vehicle other = (Vehicle) obj;

        return vehicleNumber.equals(other.vehicleNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber);
    }
}