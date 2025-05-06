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


}
