import java.util.ArrayList;

public class RoomManager {

    private ArrayList<Room> rooms;

    public RoomManager() {

        rooms = new ArrayList<>();

        rooms.add(new Room(101, "Single"));
        rooms.add(new Room(102, "Double"));
        rooms.add(new Room(103, "Suite"));

    }

    public void displayAvailableRooms() {

        for (Room r : rooms) {

            if (r.isAvailable()) {
                r.displayRoom();
            }

        }
    }

    public Room findRoom(int roomId) {

        for (Room r : rooms) {

            if (r.getRoomId() == roomId) {
                return r;
            }

        }

        return null;
    }
}
