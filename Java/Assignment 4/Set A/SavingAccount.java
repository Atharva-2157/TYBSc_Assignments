public class SavingAccount {
    int acc_no;
    String name;
    int balance;

    public SavingAccount(int acc_no, String name, int balance) {
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        try {
            if(this.balance - amount <= 500) {
                throw new InsufficientFundsException();
            }
            this.balance -= amount;
            System.out.println("You withdraw Rs " + amount + " and current balance is " + this.balance);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }

    public void deposite (int amount) {
        this.balance += amount;
        System.out.println("You successfully deposited Rs " + amount);
    }

    public void viewBalance() {
        System.out.println("Your Balance is " + this.balance);
    }

}
