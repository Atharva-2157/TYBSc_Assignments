public class Cone extends Shape{


    private double radius;
    private double height;

    @Override
    public double calculateArea() {
        return 3.142 * this.radius * (this.radius + Math.sqrt(this.height * this.height + this.radius * this.radius));
    }

    @Override
    public double calculateVolume() {
        return 3.142 * this.radius * this.radius * this.height / 3.0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
}
