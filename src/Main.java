
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(100, "jhon", "Marketing", 34.00, 45);
        Room r1 = new Room(2, 150.00, false, false);
        Reservation rv = new Reservation("king", 3, true);

        System.out.println("Available? " + r1.isAvaliable()); // true
        r1.checkIn();
        r1.checkIn();
        r1.checkOut();
        r1.checkIn();
        r1.cleanRoom();
        r1.checkIn();
        System.out.println(rv.getRoomType());
        System.out.println(rv.getPrice());
        System.out.println(rv.getNumberOfNights());
        System.out.println(rv.isWeekend());
        System.out.printf("Total price %.2f",rv.getReservationTotal());
        System.out.println("----------");

        //room test

        System.out.println(r1.getNumberOfBeds());
        System.out.println(r1.getPrice());
        System.out.println(r1.isOccupied());
        System.out.println(r1.isDirty());
        System.out.println(r1.isAvaliable());

        //employee test
        emp.punchIn(10.00);
        emp.punchOut(14.00);
        emp.punchIn(08.00);
        emp.punchOut(10.00);
        System.out.println("total hours worked: " + emp.getHoursWorked());
        System.out.println("total pay: $"+ emp.getTotalPay());

        //hotel test

    Hotel h = new Hotel("Hilton", 20, 40);
        System.out.println("Available suites: "+ h.getAvailableSuites());
        System.out.println("Available rooms: "+ h.getAvaliableRooms());

        boolean booked = h.bookRoom(3, true);//3 suites
        System.out.println("Booking 3 suites: "+ booked);

        booked = h.bookRoom(20, false);
        System.out.println("Booking 23 rooms: "+ booked);

        System.out.println("Suites lef: "+ h.getAvailableSuites());
        System.out.println("Rooms left: "+ h.getAvaliableRooms());
    }
}