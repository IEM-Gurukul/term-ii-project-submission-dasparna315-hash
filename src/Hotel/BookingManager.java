import java.util.ArrayList;

public class BookingManager {

    private ArrayList<Booking> bookings;

    public BookingManager() {

        bookings = new ArrayList<>();

    }

    public void addBooking(Booking booking) {

        bookings.add(booking);

    }

    public void cancelBooking(int bookingId)
            throws CustomException {

        Booking found = null;

        for (Booking b : bookings) {

            if (b.getBookingId() == bookingId) {

                found = b;
                break;

            }

        }

        if (found == null) {

            throw new CustomException("Booking Not Found!");

        }

        found.getRoom().setAvailability(true);

        bookings.remove(found);

        System.out.println("Booking Cancelled.");

    }

    public void displayBookings() {

        for (Booking b : bookings) {

            b.displayBooking();

        }
    }
}