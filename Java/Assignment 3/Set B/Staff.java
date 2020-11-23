public abstract class Staff {
    private String name;
    private String address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void getDetails() {
        System.out.println("Name = " + this.name);
        System.out.println("Name = " + this.address);
    }
}
