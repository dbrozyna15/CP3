import java.util.Arrays;

public class Room
{
    private int number;
    private int beds;
    private boolean occupied = false;
    private String guestName;
    
    Room(int number) {
        this.number = number;
        this.beds = 2;
    }
    
    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }
    
    public String toString() {
        return String.format(
            "Room number: %d; Number of beds: %d; Occupied?: %b; Guest name: %s",
            number,
            beds,
            occupied,
            guestName
        );
    }
    
    public void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true;        
    }
    
    public void checkout(){
        this.guestName = null;
        this.occupied = false;
    }
    
    public boolean isOccupied() {
        return this.occupied;
    }
    
    public static void displayReportSingleRooms(Room[] rooms) {
        for (Room room : rooms) {
            if (room.beds == 1) {
                System.out.println(room);
            }
        }
    }
    
    public static void displayReport(Room[] rooms) {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
    
    public static void displayReportByBedNumber(Room[] rooms, int beds) {
        for (Room room : rooms) {
            if (room.beds == beds) {
                System.out.println(room);
            }
        }
    }
    
    public static void displayReportByRoomVacancy(Room[] rooms) {
        int occupiedCount = 0;
        for (Room room : rooms) {
            if (room.occupied) {
                occupiedCount += 1;
            }
        }
        System.out.println("Vacant: " + (rooms.length - occupiedCount) + "\nOccupied: " + occupiedCount);
    }
    
    /**
    * We only take into consideration rooms where no one currently stays in.
    * Therefore, a real number of beds may be higher (but never lower).
    */
    public static void displayEstimatedVacantBeds(Room[] rooms) {
        int availableBedCount = 0;
        for (Room room : rooms) {
            if (!room.occupied) {
                availableBedCount += room.beds;
            }
        }
        System.out.println("There are at least " + availableBedCount + " beds.");
    }
    
    public static void main(String[] args) {
        System.out.println(">>> Welcome to our hotel! <<<");
        Room[] rooms = new Room[6];
        
        // Hard-coded raw data!
        final Room[] data = { 
            new Room(12, 2),
            new Room(24, 2),
            new Room(48, 2),
            new Room(49, 3),
            new Room(50, 3),
            new Room(59, 1)
        };
        
        // Fill in rooms array with data
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = data[i];
        }
        
        // Slight modifications to our data
        rooms[2].occupied = true;
        rooms[2].guestName = "Arthur";
        rooms[4].occupied = true;
        rooms[4].guestName = "Christopher";
        System.out.println(rooms[4].toString());
        
        System.out.println("--------------------");
        Room.displayReportSingleRooms(rooms);
        System.out.println("--------------------");
        Room.displayReport(rooms);
        System.out.println("--------------------");
        Room.displayReportByBedNumber(rooms, 1);
        System.out.println("--------------------");
        Room.displayReportByRoomVacancy(rooms);
        System.out.println("--------------------");
        Room.displayEstimatedVacantBeds(rooms);
        System.out.println("--------------------");
    }
}
