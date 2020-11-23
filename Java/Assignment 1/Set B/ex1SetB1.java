import java.util.Date;
import java.text.SimpleDateFormat;

public class ex1SetB1 
{
    public static void main(String[] args) 
    {
        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Current date is : " + sdf1.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-YYYY");
        System.out.println("Current date is : " + sdf2.format(date));

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd YYYY");
        System.out.println("Current date is : " + sdf3.format(date));

        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMMM dd hh:mm:ss z YYYY");
        System.out.println("Current date and time : " + sdf4.format(date));

        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/YY hh:mm:ss a Z");
        System.out.println("Current date and time : " + sdf5.format(date));

        SimpleDateFormat sdf6 = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Current time is : " + sdf6.format(date));

        SimpleDateFormat sdf7 = new SimpleDateFormat("w");
        System.out.println("Current week of year is : " + sdf7.format(date));

        SimpleDateFormat sdf8 = new SimpleDateFormat("W");
        System.out.println("Current week of month is : " + sdf8.format(date));

        SimpleDateFormat sdf9 = new SimpleDateFormat("D");
        System.out.println("Current day of the year is : " + sdf9.format(date));


    }
}


// Current date is : 23/11/2020
// Current date is : 11-23-2020
// Current date is : Monday November 23 2020
// Current date and time : Mon November 23 02:59:14 IST 2020
// Current date and time : 23/11/20 02:59:14 pm +0530
// Current time is : 02:59:14
// Current week of year is : 48
// Current week of month is : 4
// Current day of the year is : 328