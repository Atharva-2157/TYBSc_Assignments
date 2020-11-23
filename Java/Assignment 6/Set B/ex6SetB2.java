import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex6SetB2 extends JFrame {
    private MainMenu menu;

    private JTextArea txt_area;
    private ScrollPane pane;

    public ex6SetB2() {
        this.setBounds(400, 100, 250, 250);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu = new MainMenu();
        this.setJMenuBar(menu);

        this.txt_area = new JTextArea(5, 20);
        this.txt_area.setLineWrap(true);
        
        this.pane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        this.pane.add(this.txt_area);
        this.add(pane);

        
    }

    public static void main(String[] args) {
        new ex6SetB2();
    }
}
