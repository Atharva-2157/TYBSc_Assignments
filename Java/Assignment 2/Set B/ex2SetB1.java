import series.*;

public class ex2SetB1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        System.out.print("How many terms :");
        n = sc.nextInt();
        Prime obj1 = new Prime(n);
        Fibonacci obj2 = new Fibonacci(n);
        Squares obj3 = new Squares(n);

        System.out.println("Series of prime numbers :");
        obj1.printSeries();

        System.out.println("Fibonacci Series :");
        obj2.printSeries();

        System.out.println("Series of Square of numbers :");
        obj3.printSeries();

        sc.close();
    }
}


// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> cd series
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2\series> javac Prime.java
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2\series> javac Fibonacci.java
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2\series> javac Squares.java   
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2\series> cd.. 
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> javac ex2SetB1.java
// PS C:\Users\Atharva\Desktop\Java TYBSc\Assignment 2> java ex2SetB1      
// How many terms :5
// Series of prime numbers :
// 2       3       5       7       11
// Fibonacci Series :
// 1       1       2       3       5
// Series of Square of numbers :
// 1       4       9       16      25