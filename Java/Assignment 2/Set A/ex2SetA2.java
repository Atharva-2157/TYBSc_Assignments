import java.util.Scanner;

class Student1 {
    private int roll_no;
    private String name;
    private float percentage;
    private static int count = 0;

	/**
	 * @param roll_no
	 * @param name
	 * @param percentage
	 */
	public Student1(int roll_no, String name, float percentage) {
		this.roll_no = roll_no;
		this.name = name;
        this.percentage = percentage;
        count += 1;
    }

    public String toString() {
        return "[" + this.roll_no + " , " + this.name + " , " + this.percentage + "]";
    }
    public static int getCount() {
        return Student1.count;
    }

    public static void sortStudent(Student1 arr[]) {
        int min;
        Student1 temp;
        for(int i = 0; i < arr.length; i += 1) {
            min = i;
            for(int j = i; j < arr.length; j += 1) {
                if(arr[min].percentage > arr[j].percentage)
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}


public class ex2SetA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, roll_no;
        String name;
        float percentage;
        System.out.print("How many objects :");
        n = sc.nextInt();
        Student1 arr[] = new Student1[n];

        for(int i = 0; i < arr.length; i += 1) {
            System.out.println("Enter details for object " + (i+1));
            System.out.print("Roll no :");
            roll_no = sc.nextInt();
            System.out.print("Name :");
            name = sc.next();
            System.out.print("Percentage :");
            percentage = sc.nextFloat();
            arr[i] = new Student1(roll_no, name, percentage);
            System.out.println();
        }

        System.out.println("Array before sorting :");
        for(Student1 student : arr) {
            System.out.println(student);
        }

        Student1.sortStudent(arr);

        System.out.println("\nArray after sorting :");
        for(Student1 student : arr) {
            System.out.println(student);
        }

        sc.close();
    }
}

// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> javac ex2SetA2.java
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> java ex2SetA2      
// How many objects :5
// Enter details for object 1
// Roll no :1
// Name :Atharva
// Percentage :90

// Enter details for object 2
// Roll no :2
// Name :Yash
// Percentage :86

// Enter details for object 3
// Roll no :3
// Name :Suyash
// Percentage :87

// Enter details for object 4
// Roll no :4  
// Name :Prasad
// Percentage :80

// Enter details for object 5
// Roll no :5
// Name :Ashish
// Percentage :34

// Array before sorting :
// [1 , Atharva , 90.0]
// [2 , Yash , 86.0]
// [3 , Suyash , 87.0]
// [4 , Prasad , 80.0]
// [5 , Ashish , 34.0]

// Array after sorting :
// [5 , Ashish , 34.0]
// [4 , Prasad , 80.0]
// [2 , Yash , 86.0]
// [3 , Suyash , 87.0]
// [1 , Atharva , 90.0]