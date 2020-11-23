import java.util.Scanner;

public class ex3SetA1 {

    public static int maxSalary(Manager mg[]) {
        int max = 0;
        int max_index = 0;
        for(int i = 0; i < mg.length; i++) {
            if(mg[i].totalSalary() > max) {
                max = mg[i].totalSalary();
                max_index = i;
            }
        }
        return max_index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("How Many objects :");
        n = sc.nextInt();
        Manager mg[] = new Manager[n];

        for(int i = 0; i < n; i++) {
            mg[i] = new Manager();
            mg[i].accept(sc, i);
            System.out.println();
        }

        n = maxSalary(mg);

        System.out.println("Manager with max salary is :");
        mg[n].display();

        sc.close();
    }
}


// How Many objects :3
// Enter id of Manager 1 :1
// Enter Name of Manager 1 :Atharva
// Enter Department of Manager 1 :CS
// Enter salary of Manager 1 :10000
// Enter bonus of Manager 1 :100

// Enter id of Manager 2 :2
// Enter Name of Manager 2 :Dhanshree 
// Enter Department of Manager 2 :Botany
// Enter salary of Manager 2 :20000
// Enter bonus of Manager 2 :200

// Enter id of Manager 3 :3
// Enter Name of Manager 3 :Nitin
// Enter Department of Manager 3 :Xerox
// Enter salary of Manager 3 :50000
// Enter bonus of Manager 3 :500

// Manager with max salary is :
// id = 3
// Name = Nitin
// Department = Xerox
// Salary = 50000
// Bonus = 50