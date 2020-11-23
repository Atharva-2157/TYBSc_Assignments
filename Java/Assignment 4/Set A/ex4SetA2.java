public class ex4SetA2 {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(1, "Atharva", 1000);
        s.viewBalance();
        s.deposite(500);    
        s.withdraw(1030);
    }
}
