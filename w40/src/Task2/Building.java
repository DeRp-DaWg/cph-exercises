package Task2;

public class Building {
    private final Room[] Rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(Room[] Rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.Rooms = Rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public Room[] getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public int getNumberOfDoors() {
        int result = 0;
        for (Room room : Rooms) {
            result += room.getNumberOfDoors();
        }
        return result;
    }

    public int getNumberOfLamps() {
        int result = 0;
        for (Room room : Rooms) {
            result += room.getNumberOfLamps();
        }
        return result;
    }

    public int getNumberOfWindows() {
        int result = 0;
        for (Room room : Rooms) {
            result += room.getNumberOfWindows();
        }
        return result;
    }
}
