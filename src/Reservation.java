public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    // Constructor with corrected room type and price logic
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.toLowerCase();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        if (this.roomType.equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        if (isWeekend) {
            this.price *= 1.10; // apply 10% increase
        }
    }

    //  Getters
    public String getRoomType() {
        return this.roomType;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    //  Setters
    public void setRoomType(String roomType) {
        this.roomType = roomType.toLowerCase();

        if (this.roomType.equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        if (this.isWeekend) {
            this.price *= 1.10;
        }
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;


        if (this.roomType.equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        if (this.isWeekend) {
            this.price *= 1.10;
        }
    }

    //  Derived Getter
    public double getReservationTotal() {
        return this.price * this.numberOfNights;
    }
}
