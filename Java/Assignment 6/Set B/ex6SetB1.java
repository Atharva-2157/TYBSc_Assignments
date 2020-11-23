import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ex6SetB1 extends JFrame implements ActionListener {

    private GridBagConstraints gbc;

    private JTextField expression;

    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_0;

    private JButton add;
    private JButton sub;
    private JButton mult;
    private JButton div;

    private JButton dot;
    private JButton equal;

    private String expression_string;

    public ex6SetB1() {
        this.setVisible(true); 
        this.setBounds(450, 50, 240, 240);
        this.setLayout(new GridBagLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.gbc = new GridBagConstraints();
        this.gbc.weightx = 1.0;
        this.gbc.weighty = 1.0;

        this.expression = new JTextField(19);
        this.gbc.gridx = 0;
        this.gbc.gridy = 0;
        this.gbc.gridwidth = 4;
        this.expression.addActionListener(this);
        this.add(this.expression, this.gbc);
        
        this.gbc.gridwidth = 1;
        
        
        this.button_1 = new JButton("1");
        this.gbc.gridx = 0;
        this.gbc.gridy = 1;
        this.button_1.addActionListener(this);
        this.add(this.button_1, this.gbc);
        
        this.button_2 = new JButton("2");
        this.gbc.gridx = 1;
        this.gbc.gridy = 1;
        this.button_2.addActionListener(this);
        this.add(this.button_2, this.gbc);
        
        this.button_3 = new JButton("3");
        this.gbc.gridx = 2;
        this.gbc.gridy = 1;
        this.button_3.addActionListener(this);
        this.add(this.button_3, this.gbc);
        
        this.add = new JButton("+");
        this.gbc.gridx = 3;
        this.gbc.gridy = 1;
        this.add.addActionListener(this);
        this.add(this.add, this.gbc);
        
        this.button_4 = new JButton("4");
        this.gbc.gridx = 0;
        this.gbc.gridy = 2;
        this.button_4.addActionListener(this);
        this.add(this.button_4, this.gbc);
        
        this.button_5 = new JButton("5");
        this.gbc.gridx = 1;
        this.gbc.gridy = 2;
        this.button_5.addActionListener(this);
        this.add(this.button_5, this.gbc);

        this.button_6 = new JButton("6");
        this.gbc.gridx = 2;
        this.gbc.gridy = 2;
        this.button_6.addActionListener(this);
        this.add(this.button_6, this.gbc);
        
        this.sub = new JButton("-");
        this.gbc.gridx = 3;
        this.gbc.gridy = 2;
        this.sub.addActionListener(this);
        this.add(this.sub, this.gbc);
        
        this.button_7 = new JButton("7");
        this.gbc.gridx = 0;
        this.gbc.gridy = 3;
        this.button_7.addActionListener(this);
        this.add(this.button_7, this.gbc);
        
        this.button_8 = new JButton("8");
        this.gbc.gridx = 1;
        this.gbc.gridy = 3;
        this.button_8.addActionListener(this);
        this.add(this.button_8, this.gbc);
        
        this.button_9 = new JButton("9");
        this.gbc.gridx = 2;
        this.gbc.gridy = 3;
        this.button_9.addActionListener(this);
        this.add(this.button_9, this.gbc);
        
        this.mult = new JButton("*");
        this.gbc.gridx = 3;
        this.gbc.gridy = 3;
        this.mult.addActionListener(this);
        this.add(this.mult, this.gbc);
        
        this.button_0 = new JButton("0");
        this.gbc.gridx = 0;
        this.gbc.gridy = 4;
        this.button_0.addActionListener(this);
        this.add(this.button_0, this.gbc);
        
        this.dot = new JButton(".");
        this.gbc.gridx = 1;
        this.gbc.gridy = 4;
        this.dot.addActionListener(this);
        this.add(this.dot, this.gbc);
        
        this.equal = new JButton("=");
        this.gbc.gridx = 2;
        this.gbc.gridy = 4;
        this.equal.addActionListener(this);
        this.add(this.equal, this.gbc);
        
        this.div = new JButton("/");
        this.gbc.gridx = 3;
        this.gbc.gridy = 4;
        this.div.addActionListener(this);
        this.add(this.div, this.gbc);

        this.expression_string = "";
    }

    public static void main(String[] args) {
        new ex6SetB1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.button_0)
        {
            this.expression_string += "0";
        }
        if(e.getSource() == this.button_1)
        {
            this.expression_string += "1";
        }
        if(e.getSource() == this.button_2)
        {
            this.expression_string += "2";
        }
        if(e.getSource() == this.button_3)
        {
            this.expression_string += "3";
        }
        if(e.getSource() == this.button_4)
        {
            this.expression_string += "4";
        }
        if(e.getSource() == this.button_5)
        {
            this.expression_string += "5";
        }
        if(e.getSource() == this.button_6)
        {
            this.expression_string += "6";
        }
        if(e.getSource() == this.button_7)
        {
            this.expression_string += "7";
        }
        if(e.getSource() == this.button_8)
        {
            this.expression_string += "8";
        }
        if(e.getSource() == this.button_9)
        {
            this.expression_string += "9";
        }
        if(e.getSource() == this.add)
        {
            this.expression_string += "+";
        }
        if(e.getSource() == this.sub)
        {
            this.expression_string += "-";
        }
        if(e.getSource() == this.mult)
        {
            this.expression_string += "*";
        }
        if(e.getSource() == this.div)
        {
            this.expression_string += "/";
        }
        if(e.getSource() == this.equal)
        {
            
        }
        this.expression.setText(this.expression_string);
    }
}