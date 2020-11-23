import sy.SYMarks;
import ty.TYMarks;

public class ex2setB2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        System.out.print("How many students :");
        n = sc.nextInt();

        Student s[] = new Student[n];
        int roll_no;
        String name;
        int cst, mt, et, theory, practical;
        SYMarks sm;
        TYMarks tm;

        for(int i = 0; i < n; i++)
        {
            System.out.println("===== Info of Student " + (i+1) + " =======");
            System.out.print("Enter Roll no :");
            roll_no = sc.nextInt();
            System.out.print("Enter Name :");
            name = sc.next();
            System.out.print("Enter computer science total :");
            cst = sc.nextInt();
            System.out.print("Enter Math total :");
            mt = sc.nextInt();
            System.out.print("Enter Electronic total :");
            et = sc.nextInt();
            System.out.print("Enter Theory total :");
            theory = sc.nextInt();
            System.out.print("Enter practical total :");
            practical = sc.nextInt();

            sm = new SYMarks(cst, mt, et);
            tm = new TYMarks(theory, practical);

            s[i] = new Student(roll_no, name, sm, tm);
        }

        System.out.println("\n");

        for (Student student : s) {
            System.out.println(student);
        }
        sc.close();
    }
}
