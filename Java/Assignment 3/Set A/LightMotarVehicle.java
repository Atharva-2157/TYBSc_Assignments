public class LightMotarVehicle extends Vehicle{
    private int mileage;

    public LightMotarVehicle(String company, int price, int mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    public void display() {
        super.display();
        System.out.println("Mileage of vehicle is :" + this.mileage);
    }
    
}
