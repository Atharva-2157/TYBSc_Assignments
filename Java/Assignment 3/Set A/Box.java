public class Box extends Shape{

    private int length;
    private int breadth;
    private int height;

    @Override
    public double calculateArea() {
        return 2*(this.height * this.breadth) + 2*(this.length * this.breadth) + 2*(this.length * this.height);
    }

    @Override
    public double calculateVolume() {
        return this.length * this.breadth * this.height;
    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
}
