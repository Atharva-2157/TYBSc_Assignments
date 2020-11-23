import java.util.Scanner;
public class ex3SetB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String name, address;
        System.out.print("How Many Staff members :");
        n = sc.nextInt();

        Staff s[] = new Staff[n];

        for (int i = 0; i < s.length; i++) {
            System.out.println("1: Full Time Staff Member");
            System.out.println("2: Part Time Staff Member");
            System.out.println();
            System.out.print("Enter your choice :");
            n = sc.nextInt();
            System.out.print("Enter name :");
            name = sc.nextLine();
            System.out.print("Enter address :");
            address = sc.nextLine();
            switch(n)
            {
                case 1:
                {
                    String department;
                    int salary;
                    System.out.print("Enter department :");
                    department = sc.next();
                    System.out.print("Enter salary :");
                    salary = sc.nextInt();
                    s[i] = new FullTimeStaff(name, address, department, salary); 
                    
                }break;
                
                case 2:
                {
                    int hours, rate;
                    System.out.print("Enter No of hours worked :");
                    hours = sc.nextInt();
                    System.out.print("Enter rate per hour :");
                    rate = sc.nextInt();
                    s[i] = new PartTimeStaff(name, address, hours, rate); 

                }break;

                default:
                {
                    System.out.println("Invalid choice");
                    i--;
                }
            }
        }
        
        System.out.println(s[0].getClass());

        System.out.println("======== FULL TIME STAFF ==========");
        for(Staff a: s) {
            if(a instanceof FullTimeStaff) {
                a.getDetails();
            }
            System.out.println();
        }

        System.out.println("======== PART TIME STAFF ==========");
        for(Staff a: s) {
            if(a instanceof PartTimeStaff) {
                a.getDetails();
            }
            System.out.println();
        }

        sc.close();
    }
}