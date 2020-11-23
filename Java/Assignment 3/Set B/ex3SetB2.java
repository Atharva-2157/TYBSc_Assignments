public class ex3SetB2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n, choice;
        String name;
        long card_no;
        System.out.println("How many customers :");
        n = sc.nextInt();
        CreditCardInterface customer[] = new CreditCardInterface[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("1 : Silver Card");
            System.out.println("2 : Gold Card");

            System.out.print("\nEnter your choice :");
            choice = sc.nextInt();

            System.out.print("Enter name :");
            name = sc.next();
            System.out.print("Enter Card Number :");
            card_no = sc.nextLong();

            switch(choice)
            {
                case 1:
                {
                    customer[i] = new SilverCardCustomer(name, card_no);
                }break;

                case 2:
                {
                    customer[i] = new GoldCardCustomer(name, card_no);
                }break;

                default:
                {
                    System.out.println("invalid choice");
                    i--;
                }
            }
        }

        for (CreditCardInterface c : customer) {
            System.out.println(c);
        }

        sc.close();
    }
}
