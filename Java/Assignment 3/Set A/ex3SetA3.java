import java.util.Scanner;

public class ex3SetA3 {
    public static void main(String[] args) {
        int n, choice;
        String company;
        int price;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many vehicles :");
        n = sc.nextInt();
        Vehicle v[] = new Vehicle[n];

        for(int i = 0; i < n; i++) {
            System.out.println("--- Enter Details of Vehocle " + (i+1) + " ---\n");
            System.out.println("1 : Light Motar Vehicle");
            System.out.println("2 : Heavy Motar Vehicle\n");

            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            System.out.println("Enter Vehicle company :");
            company = sc.next();

            System.out.println("Enter Vehicle price :");
            price = sc.nextInt();

            switch (choice) {
                case 1:{
                    int mileage;
                    System.out.println("Enter Mileage :");
                    mileage = sc.nextInt();
                    v[i] = new LightMotarVehicle(company, price, mileage);
                }break;

                case 2:{
                    int capacity;
                    System.out.println("Enter capacity :");
                    capacity = sc.nextInt();
                    v[i] = new HighMotarVehicle(company, price, capacity);
                }break;
            
                default:{
                    System.out.println("Invalid input");
                    i--;
                }
                    break;
            }
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println("Detalis of vehicle " + (i+1) + "\n");
            v[i].display();
            System.out.println();
        }

        sc.close();
    }
}


// PS C:\Atharva folder\All programs\Java Assignments\Assignment 3\Set A> javac ex3SetA3.java
// PS C:\Atharva folder\All programs\Java Assignments\Assignment 3\Set A> java ex3SetA3
// How many vehicles :3
// --- Enter Details of Vehocle 1 ---

// 1 : Light Motar Vehicle
// 2 : Heavy Motar Vehicle

// Enter your choice :
// 1
// Enter Vehicle company :
// splender
// Enter Vehicle price :
// 40000
// Enter Mileage :
// 70
// --- Enter Details of Vehocle 2 ---

// 1 : Light Motar Vehicle
// 2 : Heavy Motar Vehicle

// Enter your choice :
// 2
// Enter Vehicle company :
// bullet
// Enter Vehicle price :
// 90000
// Enter capacity :
// 2 
// --- Enter Details of Vehocle 3 ---

// 1 : Light Motar Vehicle
// 2 : Heavy Motar Vehicle

// Enter your choice :
// 1   
// Enter Vehicle company :
// nano
// Enter Vehicle price :
// 30000
// Enter Mileage :
// 4
// Detalis of vehicle 1

// Vehicle company is :splender
// Vehicle price is :40000
// Mileage of vehicle is :70

// Detalis of vehicle 2

// Vehicle company is :bullet
// Vehicle price is :90000
// Vehicle capacity is 2

// Detalis of vehicle 3

// Vehicle company is :nano
// Vehicle price is :30000
// Mileage of vehicle is :4