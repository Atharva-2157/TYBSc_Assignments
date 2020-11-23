public class GoldCardCustomer extends SilverCardCustomer {
    int count;
    {
        this.count = 0;
        this.credit_amount = 0;
        this.credit_limit = 1_00_000;
    }

    public GoldCardCustomer(String name, long card_number) {
        super(name, card_number);
    }
    
    @Override
    public void increaseLimit() {
        if(this.count < 3)
        {
            this.credit_limit += 5000;
            System.out.println("Credit limit increased by Rs 5000");
        }
        else
        {
            System.out.println("You cant increase creadit limit more than 3 times");
        }
        System.out.println("thank you");
    }

    @Override
    public String toString() {
        return "Gold Card [ name=" + name + ", card_number=" + card_number + ", credit_amount=" + credit_amount + ", credit_limit="
                + credit_limit + "]";
    }
}
