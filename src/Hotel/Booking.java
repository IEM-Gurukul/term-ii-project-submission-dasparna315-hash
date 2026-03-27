public class Booking {

    private int bookingId;
    private Customer customer;
    private Room room;

    public Booking(int bookingId, Customer customer, Room room) {

        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;

    }

    public int getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public void displayBooking() {

        System.out.println("Booking ID: " + bookingId);
        customer.displayUser();
        room.displayRoom();

    }
}