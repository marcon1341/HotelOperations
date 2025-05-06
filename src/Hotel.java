public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //constructors
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    //constructor2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    //methods to book
    public boolean bookRoom(int number, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + number <= numberOfSuites) {
                bookedSuites += number;
                return true;
            }
        } else {
            if (bookedBasicRooms + number <= numberOfRooms) {
                bookedBasicRooms += number;
                return false;
            }
        }
        return false;
    }

    //getter
        public int getAvailableSuites(){
            return numberOfSuites - bookedSuites;
        }
        public int getAvaliableRooms(){
            return numberOfRooms - bookedBasicRooms;
        }
}