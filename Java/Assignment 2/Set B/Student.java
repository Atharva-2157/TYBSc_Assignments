import sy.SYMarks;
import ty.TYMarks;

public class Student {
    private int roll_no;
    private String name;
    private SYMarks sy_marks; 
    private TYMarks ty_marks;

    public Student(int roll_no, String name, SYMarks sy_marks, TYMarks ty_marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.sy_marks = sy_marks;
        this.ty_marks = ty_marks;
    }

    public float calculateAverage() {
        return (float) ((sy_marks.totalMarks() + ty_marks.totalMarks()) / 5.0);
    }

    @Override
    public String toString() {
        char grade;
        if(this.calculateAverage() >= 70)
        {
            grade = 'A';
        }
        else if(this.calculateAverage() >= 60)
        {
            grade = 'B';
        }
        else if(this.calculateAverage() >= 50)
        {
            grade = 'C';
        }
        else if(this.calculateAverage() >= 40)
        {
            grade = 'P';
        }
        else
        {
            grade = 'F';
        }
        return "[name=" + name + ", roll_no=" + roll_no + " Grade=" + grade + "]";
    }

    
}
