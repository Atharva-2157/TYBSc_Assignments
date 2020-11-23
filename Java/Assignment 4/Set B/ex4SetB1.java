public class ex4SetB1 {
    public static void main(String[] args) {
        try {
            MyDate obj = new MyDate(29, 2, 2019);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println("Invalid Date");
        }
    }
}