import java.util.Scanner;
public class ex4SetA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("How many players :");
        n = sc.nextInt();

        CricketPlayer player[] = new CricketPlayer[n];
        String name;
        int no_of_innings;
        int no_times_notout;
        int total_runs;

        for (int i = 0; i < player.length; i++) {
            System.out.println("=== Enter details of player "+ (i+1) + " ===");
            System.out.print("Enter name :");
            name = sc.next();
            System.out.print("Enter no of innings :");
            no_of_innings= sc.nextInt();
            System.out.print("Enter no of times notout :");
            no_times_notout = sc.nextInt();
            System.out.print("Enter total runs :");
            total_runs= sc.nextInt();

            player[i] = new CricketPlayer(name, no_of_innings, no_times_notout, total_runs);
            player[i] = CricketPlayer.calculateAverage(player[i]);
            System.out.println();
        }

        CricketPlayer.sortPlayers(player);
        System.out.println();

        for (CricketPlayer cricketPlayer : player) {
            System.out.println(cricketPlayer);
            System.out.println();
        }


        sc.close(); 
    }
}