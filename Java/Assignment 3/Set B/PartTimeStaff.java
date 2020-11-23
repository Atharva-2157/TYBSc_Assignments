public class PartTimeStaff extends Staff{
    private int no_of_hours_worked;
    private int rate_per_hour;

    public PartTimeStaff(String name, String address, int no_of_hours_worked, int rate_per_hour) {
        super(name, address);
        this.no_of_hours_worked = no_of_hours_worked;
        this.rate_per_hour = rate_per_hour;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Number of hours Worked = " + this.no_of_hours_worked);
        System.out.println("Rate per hour = " + this.rate_per_hour);

    }
}