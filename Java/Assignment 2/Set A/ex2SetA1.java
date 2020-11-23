class Student {
    private int roll_no;
    private String name;
    private float percentage;
    private static int count = 0;

	/**
	 * @param roll_no
	 * @param name
	 * @param percentage
	 */
	public Student(int roll_no, String name, float percentage) {
		this.roll_no = roll_no;
		this.name = name;
        this.percentage = percentage;
        count += 1;
    }

    public String toString() {
        return "[" + this.roll_no + " , " + this.name + " , " + this.percentage + "]";
    }
    public static int getCount() {
        return Student.count;
    }
}

public class ex2SetA1 {
    public static void main(String[] args) {
        Student obj1 = new Student(101, "Atharva", 77.7f);
        System.out.println("Count is : " + Student.getCount());
        Student obj2 = new Student(102, "Yash", 77.7f);
        System.out.println("Count is : " + Student.getCount());
        Student obj3 = new Student(103, "Prasad", 77.7f);
        System.out.println("Count is : " + Student.getCount());

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }

}

// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> javac ex2SetA1.java
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> java ex2SetA1
// Count is : 1
// Count is : 2
// Count is : 3
// [101 , Atharva , 77.7]
// [102 , Yash , 77.7]
// [103 , Prasad , 77.7]