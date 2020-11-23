import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.department = "";
        this.salary = 0;
    }

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept(Scanner sc, int i) {
        System.out.print("Enter id of Manager " + (i+1) + " :");
        this.id = sc.nextInt();
        System.out.print("Enter Name of Manager " + (i+1) + " :");
        this.name = sc.next();
        System.out.print("Enter Department of Manager " + (i+1) + " :");
        this.department = sc.next();
        System.out.print("Enter salary of Manager " + (i+1) + " :");
        this.salary = sc.nextInt();
    }
    
    public void display() {
        System.out.println("id = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Department = " + this.department);
        System.out.println("Salary = " + this.salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}