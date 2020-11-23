/**
 * @author XYZ
 * @version 1.8
 */
public class ex1SetB2 {
    private int num;

	/**
	 * Default constructor which initialise the value of num to zero
	 */
	public ex1SetB2() {
        this.num = 0;
    }

	/**
     * Parameterised constructor which initialise the value of num to specific integer
	 * @param num 
	 */
	public ex1SetB2(int num) {
		this.num = num;
	}
    
    /**
     * This method will return true if value is negative and false if positive
     */
    public boolean isNegative() {
        return this.num < 0;
    }

    /**
     * This method will return false if value is negative and true if positive
     */
    public boolean isPositive() {
        return this.num > 0;
    }

    /**
     * This method will return true if num value is zero and false of non zero
     */
    public boolean isZero() {
        return this.num == 0;
    }

    /**
     * This method will return true if num value is odd else return false
     */
    public boolean isOdd() {
        return this.num % 2 != 0;
    }

    /**
     * This method will return false if num value is odd else return true
     */
    public boolean isEven() {
        return this.num % 2 == 0;
    }

    /**
     * This is the main method
     * @param args default argument of main
     */
    public static void main(String[] args) {
        if(args.length != 1)
            System.exit(0);

        int num = Integer.parseInt(args[0]);
        ex1SetB2 obj = new ex1SetB2(num);

        if(obj.isEven())
            System.out.println(num + " is even");
        else
            System.out.println(num + " is not even");

        if(obj.isOdd())
            System.out.println(num + " is odd");
        else
            System.out.println(num + " is not odd");

        if(obj.isPositive())
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is not positive");
        if(obj.isNegative())
            System.out.println(num + " is negative");
        else
            System.out.println(num + " is not negative");

        if(obj.isZero())
            System.out.println("number is zero");
        else
            System.out.println("number is non zero");
    }

}