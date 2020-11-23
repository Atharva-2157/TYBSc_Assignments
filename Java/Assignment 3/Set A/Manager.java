import java.util.Scanner;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
        this.bonus = 0;
    }

	public Manager(int id, String name, String department, int salary, int bonus) {
        super(id, name, department, salary);
		this.bonus = bonus;
    }

    public void accept(Scanner sc, int i) {
        super.accept(sc, i);
        System.out.print("Enter bonus of Manager " + (i+1) + " :");
        this.bonus = sc.nextInt();
    }
    
    public void display() {
        super.display();
        System.out.println("Bonus = " + this.bonus);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int totalSalary() {
        return this.getSalary() + this.getBonus();
    }
    
}
