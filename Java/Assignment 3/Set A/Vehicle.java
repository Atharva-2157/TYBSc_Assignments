public class Vehicle {
    private String company;
    private int price;

    public Vehicle(String company, int price) {
        this.company = company;
        this.price = price;
    }

    public void display() {
        System.out.println("Vehicle company is :" + this.company);
        System.out.println("Vehicle price is :" + this.price);
    }
}
