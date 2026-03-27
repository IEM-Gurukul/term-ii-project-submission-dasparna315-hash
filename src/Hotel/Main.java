import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HotelService hotelService = new HotelService();

        int choice;

        do {
            System.out.println("\n===== HOTEL BOOKING SYSTEM =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Booking History");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        hotelService.viewRooms();
                        break;

                    case 2:
                        hotelService.bookRoom();
                        break;

                    case 3:
                        hotelService.cancelBooking();
                        break;

                    case 4:
                        hotelService.viewBookingHistory();
                        break;

                    case 5:
                        System.out.println("Thank You!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");

                }

            } catch (CustomException e) {

                System.out.println("Error: " + e.getMessage());

            }

        } while (choice != 5);

        sc.close();
    }
}