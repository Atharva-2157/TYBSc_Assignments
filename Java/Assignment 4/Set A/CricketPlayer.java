public class CricketPlayer {
    String name;
    int no_of_innings;
    int no_times_notout;
    int total_runs;
    float bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_times_notout = no_times_notout;
        this.total_runs = total_runs;
    }

    public static CricketPlayer calculateAverage(CricketPlayer p) {
        try {
            p.bat_avg = (float)p.total_runs / (p.no_of_innings - p.no_times_notout);
        } catch (Exception e) {
            p.bat_avg = -1;
        }
        return p;
    }

    public static void sortPlayers(CricketPlayer player[]) {
        CricketPlayer c;
        for (int i = 0; i < player.length; i++) {
            int index = i;
            for (int j = i; j < player.length; j++) {
                if(player[j].bat_avg < player[index].bat_avg && player[j].bat_avg != -1) {
                    index = j;
                }
            }
            c = player[i];
            player[i] = player[index];
            player[index] = c;
        }
    }

    @Override
    public String toString() {
        return "Name = " + this.name + "\nNo of Innings = " + this.no_of_innings + "\nNo of times Not Out = " 
        + this.no_times_notout + "\nTotal Runs = " + this.total_runs + "\nBatting Average = " + this.bat_avg;
    }

}
