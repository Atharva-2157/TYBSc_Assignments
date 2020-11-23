public class FullTimeStaff extends Staff{
    private String department;
    private float salary;

    public FullTimeStaff(String name, String address, String department, float salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Department Name = " + this.department);
        System.out.println("Salary = " + this.salary);
    }
}
