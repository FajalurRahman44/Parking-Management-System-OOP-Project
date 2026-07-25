//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    ParkingLot parkingLot = new ParkingLot(3, 100);

    while (true) {

        System.out.println("\n===== Parking Lot System =====");
        System.out.println("1. Park Vehicle");
        System.out.println("2. Find Vehicle");
        System.out.println("3. Show Available Slots");
        System.out.println("4. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.print("Enter Vehicle Number: ");
                String number = sc.next();

                System.out.print("Enter Owner Name: ");
                String owner = sc.next();

                System.out.print("Enter Vehicle Type (Bike/Car/Truck): ");
                String type = sc.next();

                Vehicle vehicle = new Vehicle(
                        number,
                        type,
                        owner
                );

                parkingLot.parkVehicle(vehicle);

                break;


            case 2:

                System.out.print("Enter Vehicle Number: ");
                String searchNumber = sc.next();

                parkingLot.findVehicle(searchNumber);

                break;


            case 3:

                parkingLot.showAvailableSlots();

                break;


            case 4:

                System.out.println("Thank you!");
                sc.close();
                return;


            default:

                System.out.println("Invalid choice");
        }
    }

}
