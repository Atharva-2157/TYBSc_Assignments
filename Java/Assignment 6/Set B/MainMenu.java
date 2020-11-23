import javax.swing.*;

public class MainMenu extends JMenuBar {
    private JMenu file_menu;
    private JMenuItem load;
    private JMenuItem save;
    private JMenuItem exit;

    private JMenu compute_menu;
    private JMenuItem sum;
    private JMenuItem average;
    private JMenuItem maximum;
    private JMenuItem minimum;
    private JMenuItem median;

    private JMenu operations_menu;
    private JMenuItem search;
    private JMenu sort;
    private JRadioButtonMenuItem ascending;
    private JRadioButtonMenuItem descending;

    public  MainMenu() {
        this.file_menu = new JMenu("File");
        this.add(this.file_menu);

        this.load = new JMenuItem("Load");
        this.file_menu.add(this.load);

        this.save = new JMenuItem("Save");
        this.file_menu.add(this.save);

        this.file_menu.addSeparator();

        this.exit = new JMenuItem("Exit");
        this.file_menu.add(this.exit);


        this.compute_menu = new JMenu("Compute");
        this.add(this.compute_menu);

        this.sum = new JMenuItem("Sum");
        this.compute_menu.add(this.sum);

        this.average = new JMenuItem("Average");
        this.compute_menu.add(this.average);

        this.maximum = new JMenuItem("Maximum");
        this.compute_menu.add(this.maximum);

        this.minimum = new JMenuItem("Minimum");
        this.compute_menu.add(this.minimum);

        this.median = new JMenuItem("Median");
        this.compute_menu.add(this.median);


        this.operations_menu = new JMenu("Operations");
        this.add(this.operations_menu);

        this.search = new JMenuItem("Search");
        this.operations_menu.add(this.search);

        this.sort = new JMenu("Sort");
        this.operations_menu.add(this.sort);

        this.ascending = new JRadioButtonMenuItem("Ascending");
        this.sort.add(this.ascending);

        this.descending = new JRadioButtonMenuItem("Descending");
        this.sort.add(this.descending);




    }
}
