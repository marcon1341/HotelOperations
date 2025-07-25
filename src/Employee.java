import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchStartTime;

    //CONSTRUCTOR
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
        //getters

        public int getEmployeeId(){return this.employeeId;}
        public String getName(){return this.name;}
        public String getDepartment(){return this.department;}
        public double getPayRate(){return this.payRate;}
        public double getHoursWorked(){return this.hoursWorked;}

        //setters
        public void setEmployeeId(int employeeId){this.employeeId = employeeId;}
        public void setDepartment(String department){this.department = department;}
        public void setPayRate(double payRate){this.payRate = payRate;}
        public void setHoursWorked(double hoursWorked){this.hoursWorked = hoursWorked;}

        //derived getter regular hours 40hr
        public double getRegularHours() {
            return Math.min(40, hoursWorked);
        }
        public double getOverTimeHours(){
            return Math.max(0, hoursWorked - 40);
        }
        public double getTotalPay(){
            double regularPay = getRegularHours() * payRate;
            double overTimePay = getOverTimeHours() * payRate * 1.5;
            return regularPay + overTimePay;
        }

        public void punchIn(double time){
            punchStartTime = time;
            System.out.println(name + " punched in at" + time);

        }
        //overloading
        public void punchIn(){
            LocalTime now = LocalTime.now();
            double hourPars = now.getHour() + now.getMinute()/60.0;
            punchStartTime = hourPars;
            System.out.println(name + " Punched in at "+ hourPars);
        }

        public void punchOut(double time){
            if(time > punchStartTime){
               double hoursWorkedToday = time - punchStartTime;
               hoursWorked += hoursWorkedToday;
                System.out.println(name + "Punched out at "+ time + " (" + hoursWorkedToday + "hours added)");
            }else {
                System.out.println("Invalid time punch out time!");
            }
        }
        public void punchOut(){
            LocalTime now  = LocalTime.now();
            double hourPars = now.getHour() + now.getMinute() / 60.0;

            if(hourPars > punchStartTime){
                double hoursWorkedToday = hourPars - punchStartTime;
                hoursWorked += hoursWorkedToday;
                System.out.println(name + " Punched out at "+ hourPars + "( " + hoursWorkedToday);
            }else{
                System.out.println("Invalid punch out time!");
            }

        }
}

