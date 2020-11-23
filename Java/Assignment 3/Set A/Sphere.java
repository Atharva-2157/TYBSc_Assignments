public class Sphere extends Shape {

    private double radius;

    @Override
    public double calculateArea() {
        return 4 * 3.142 * this.radius * this.radius;
    }

    @Override
    public double calculateVolume() {
        return 4.0 / 3 * 3.142 * this.radius * this.radius * this.radius;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }
    
}
