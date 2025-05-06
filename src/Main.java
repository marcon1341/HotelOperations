//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(100, "jhon", "Marketing", 34.00, 45);
        Room r1 = new Room(2, 150.00, false, false);
        Reservation rv = new Reservation("king", 3, true);
        System.out.println(rv.getRoomType());
        System.out.println(rv.getPrice());
        System.out.println(rv.getNumberOfNights());
        System.out.println(rv.isWeekend());
        System.out.printf("Total price %.2f",rv.getReservationTotal());
        System.out.println("----------");

        System.out.println(r1.getNumberOfBeds());
        System.out.println(r1.getPrice());
        System.out.println(r1.isOccupied());
        System.out.println(r1.isDirty());
        System.out.println(r1.isAvaliable());

        System.out.println("-------------");
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getName());
        System.out.println(emp.getDepartment());
        System.out.println("reg"+emp.getRegularHours());
        System.out.println(emp.getHoursWorked());
        System.out.println(emp.getOverTimeHours());
        System.out.println(emp.getTotalPay());

    }
}