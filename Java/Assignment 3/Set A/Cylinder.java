public class Cylinder extends Shape {

    private double radius;
    private double height;

    @Override
    public double calculateArea() {
        return (2 * 3.142 * this.radius * this.height) + (2 * 3.142 * this.radius * this.radius);
    }

    @Override
    public double calculateVolume() {
        return 3.142 * this.radius * this.radius * this.height;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
}
