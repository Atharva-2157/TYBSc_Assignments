public class SilverCardCustomer implements CreditCardInterface
{
    String name;
    long card_number;
    int credit_amount;
    int credit_limit;

    {
        this.credit_amount = 0;
        this.credit_limit = 50_000;
    }

    public SilverCardCustomer(String name, long card_number) {
        this.name = name;
        this.card_number = card_number;
    }
    
    @Override
    public void viewCreditAmount() {
        System.out.println("credit amount is " + this.credit_amount);
    }

    @Override
    public void useCard() {
        if(this.credit_amount == this.credit_limit)
        {
            System.out.println("Please pay your existing credits to use card further");
        }
        else
        {
            int amount;
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter the amount to be credited :");
            amount = sc.nextInt();
            if(this.credit_amount + amount > this.credit_limit)
            {
                System.out.println("You are going beyond your credit limit");
                System.out.println("you can only credit amount upto " + (this.credit_limit - this.credit_amount));
            }
            else
            {
                this.credit_amount += amount;
                System.out.println("Your transaction is successful");
                System.out.println("You got Rs " + amount);
            }
            sc.close();
        }
        System.out.println("Thank you");
    }

    @Override
    public void payCredit() {   
        System.out.println("The total amount to pay is :" + this.credit_amount);
        int amount;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the amount to pay:");
        amount = sc.nextInt();

        this.credit_amount -= amount;

        if(this.credit_amount < 0)
        {
            int a = -this.credit_amount;
            this.credit_amount = 0;
            System.out.println("You only have to pay " + (amount - a));
            System.out.println("Take your " + a + "Rs back");
        }
        else
        {
            System.out.println("You Still have to pay Rs " + this.credit_amount);
            System.out.println("Pay it as soon as possible");
        }
        System.out.println("Thank You");
        sc.close();
    }

    @Override
    public void increaseLimit() {

    }

    @Override
    public String toString() {
        return "Silver Card [ name=" + name + ", card_number=" + card_number + ", credit_amount=" + credit_amount + ", credit_limit="
                + credit_limit + "]";
    }

}
