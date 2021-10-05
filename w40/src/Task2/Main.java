package Task2;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(1,4,8);
        Room room2 = new Room(2,6,10);
        Room room3 = new Room(5,30,20);
        Room[] rooms = {room1, room2, room3};
        Building building = new Building(rooms,3,1,true);
        System.out.println("Number of lamps: " + building.getNumberOfLamps());
        if (building.getNumberOfFloors() > building.getRooms().length) System.out.println("This is an odd building");
    }
}
