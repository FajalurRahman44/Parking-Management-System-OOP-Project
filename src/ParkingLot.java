import java.util.ArrayList;

public class ParkingLot {

    private ParkingSlot[][] floors;

    private ArrayList<Ticket> tickets = new ArrayList<>();

    public ParkingLot(int floorCount, int slotsPerFloor) {

        floors = new ParkingSlot[floorCount][slotsPerFloor];

        for (int i = 0; i < floorCount; i++) {

            for (int j = 0; j < slotsPerFloor; j++) {

                if (j < 30)
                    floors[i][j] = new ParkingSlot(j + 1, "Bike");

                else if (j < 80)
                    floors[i][j] = new ParkingSlot(j + 1, "Car");

                else
                    floors[i][j] = new ParkingSlot(j + 1, "Truck");
            }
        }
    }

    public void parkVehicle(Vehicle vehicle) {

        for (int i = 0; i < floors.length; i++) {

            for (int j = 0; j < floors[i].length; j++) {

                ParkingSlot slot = floors[i][j];

                if (!slot.isOccupied()
                        && slot.getSupportedType().equals(vehicle.getType())) {

                    slot.parkVehicle(vehicle);

                    Ticket ticket = new Ticket(
                            vehicle.getVehicleNumber(),
                            vehicle.getType(),
                            i + 1,
                            slot.getSlotNumber(),
                            slot.getParkedTime());

                    tickets.add(ticket);

                    System.out.println("Vehicle Parked Successfully");
                    System.out.println("Ticket ID : " + ticket.getTicketId());

                    return;
                }
            }
        }

        System.out.println("Parking Full");
    }

    public void findVehicle(String vehicleNumber) {

        for (int i = 0; i < floors.length; i++) {

            for (ParkingSlot slot : floors[i]) {

                if (slot.isOccupied()) {

                    if (slot.getParkedVehicle()
                            .getVehicleNumber()
                            .equals(vehicleNumber)) {

                        System.out.println("Found");
                        System.out.println("Floor : " + (i + 1));
                        System.out.println("Slot : " + slot.getSlotNumber());
                        return;
                    }
                }
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public void showAvailableSlots() {

        for (int i = 0; i < floors.length; i++) {

            System.out.println("Floor " + (i + 1));

            for (ParkingSlot slot : floors[i]) {

                if (!slot.isOccupied()) {

                    System.out.println(
                            "Slot "
                                    + slot.getSlotNumber()
                                    + " -> "
                                    + slot.getSupportedType());
                }
            }
        }
    }
}