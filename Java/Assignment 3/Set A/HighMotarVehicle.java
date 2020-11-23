public class HighMotarVehicle extends Vehicle {
    private int capacity;

    public HighMotarVehicle(String company, int price, int capacity) {
        super(company, price);
        this.capacity = capacity;
    }

    public void display() {
        super.display();
        System.out.println("Vehicle capacity is " + this.capacity);
    }    
}
