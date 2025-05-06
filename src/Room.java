public class Room {
    private int  numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    //constructors
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    //getters
    public int getNumberOfBeds(){return this.numberOfBeds;}
    public double getPrice(){return this.price;}
    public boolean isOccupied(){return this.isOccupied;}
    public boolean isDirty(){return this.isDirty;}

    //getter derived from getters
    public boolean isAvaliable(){return !isOccupied && !isDirty;}


    //
    public void checkIn(){
        if(!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Guest checked in.");
        }else {
            System.out.println("Can't check in.");
        }
    }
    public void checkOut(){
        if(isOccupied){
            isOccupied = false;
            System.out.println("Guest checked out. Room needs cleaning.");
        }else {
            System.out.println("Room is unoccupied. ");
        }
    }
    public void cleanRoom(){
        if(isDirty){
            isDirty = false;
            System.out.println("Room has been cleaned. ");
        }else {
            System.out.println("Room is already clean. ");
        }
    }
}
