public class Room {

    private int roomId;
    private String type;
    private boolean isAvailable;

    public Room(int roomId, String type) {

        this.roomId = roomId;
        this.type = type;
        this.isAvailable = true;

    }

    public int getRoomId() {
        return roomId;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean status) {
        isAvailable = status;
    }

    public void displayRoom() {

        System.out.println("Room ID: " + roomId +
                " | Type: " + type +
                " | Available: " + isAvailable);

    }
}
