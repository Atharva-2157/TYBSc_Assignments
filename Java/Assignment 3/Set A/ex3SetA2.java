public class ex3SetA2 {
    public static void main(String[] args) {
        Sphere sp = new Sphere(4.2);
        Cone cn = new Cone(4.2, 5);
        Cylinder cd = new Cylinder(4.2, 3);
        Box b = new Box(4, 6, 2);

        System.out.println("Area of Sphere is " + sp.calculateArea());
        System.out.println("Volume of Sphere is " + sp.calculateVolume() + "\n");

        System.out.println("Area of Cone is " + cn.calculateArea());
        System.out.println("Volume of Cone is " + cn.calculateVolume() + "\n");

        System.out.println("Area of Cylinder is " + cd.calculateArea());
        System.out.println("Volume of Cylinder is " + cd.calculateVolume() + "\n");

        System.out.println("Area of Box is " + b.calculateArea());
        System.out.println("Volume of Box is " + b.calculateVolume() + "\n");
        
    }
}

// Area of Sphere is 221.69952
// Volume of Sphere is 310.379328

// Area of Cone is 141.59646259550766
// Volume of Cone is 92.37480000000001

// Area of Cylinder is 190.02816
// Volume of Cylinder is 166.27464

// Area of Box is 88.0
// Volume of Box is 48.0
