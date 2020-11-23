import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex6SetA2 extends JFrame implements ActionListener {

    GridBagConstraints gbc;

    JLabel name_label;
    JLabel class_label;
    JLabel hobby_label;

    JTextField name_field;

    JRadioButton fy_radio_btn;
    JRadioButton sy_radio_btn;
    JRadioButton ty_radio_btn;
    ButtonGroup group;

    JCheckBox music_check_box;
    JCheckBox dance_check_box;
    JCheckBox sports_check_box;

    JTextField main_string;

    String str;


    public ex6SetA2() {
        this.setBounds(450, 200, 220, 250);
        this.setVisible(true);  
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.gbc = new GridBagConstraints();
        this.gbc.weightx = 1.0;
        this.gbc.weighty = 1.0;

        this.gbc.fill = GridBagConstraints.HORIZONTAL;

        this.name_label = new JLabel("Your Name :");
        this.gbc.gridx = 0;
        this.gbc.gridy = 0;
        this.add(this.name_label, this.gbc);

        this.name_field = new JTextField();
        this.gbc.gridx = 1;
        this.gbc.gridy = 0;
        this.name_field.addActionListener(this);
        this.add(this.name_field, this.gbc);

        this.class_label = new JLabel("Your Class");
        this.gbc.gridx = 0;
        this.gbc.gridy = 1;
        this.add(this.class_label, this.gbc);

        this.hobby_label = new JLabel("Your Hobbies");
        this.gbc.gridx = 1;
        this.gbc.gridy = 1;
        this.add(this.hobby_label, this.gbc);

        this.fy_radio_btn = new JRadioButton("FY");
        this.gbc.gridx = 0;
        this.gbc.gridy = 2;
        this.fy_radio_btn.setOpaque(false);
        this.fy_radio_btn.addActionListener(this);
        this.add(this.fy_radio_btn, this.gbc);
        
        this.music_check_box = new JCheckBox("Music");
        this.gbc.gridx = 1;
        this.gbc.gridy = 2;
        this.music_check_box.setOpaque(false);
        this.music_check_box.addActionListener(this);
        this.add(this.music_check_box, this.gbc);
        
        this.sy_radio_btn = new JRadioButton("SY");
        this.gbc.gridx = 0;
        this.gbc.gridy = 3;
        this.sy_radio_btn.setOpaque(false);
        this.sy_radio_btn.addActionListener(this);
        this.add(this.sy_radio_btn, this.gbc);
        
        this.dance_check_box = new JCheckBox("Dance");
        this.gbc.gridx = 1;
        this.gbc.gridy = 3;
        this.dance_check_box.setOpaque(false);
        this.dance_check_box.addActionListener(this);
        this.add(this.dance_check_box, this.gbc);
        
        this.ty_radio_btn = new JRadioButton("TY");
        this.gbc.gridx = 0;
        this.gbc.gridy = 4;
        this.ty_radio_btn.setOpaque(false);
        this.ty_radio_btn.addActionListener(this);
        this.add(this.ty_radio_btn, this.gbc);
        
        this.sports_check_box = new JCheckBox("Sports");
        this.gbc.gridx = 1;
        this.gbc.gridy = 4;
        this.sports_check_box.setOpaque(false);
        this.sports_check_box.addActionListener(this);
        this.add(this.sports_check_box, this.gbc);

        this.main_string = new JTextField();
        this.gbc.gridx = 0;
        this.gbc.gridy = 5;
        this.gbc.gridwidth = 2;
        this.main_string.setEditable(false);
        this.add(this.main_string, gbc);

        this.group = new ButtonGroup();
        this.group.add(this.fy_radio_btn);
        this.group.add(this.sy_radio_btn);
        this.group.add(this.ty_radio_btn);


    }

    public static void main(String[] args) {
        new ex6SetA2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name, cl, hobby;

        name = this.name_field.getText();

        if(this.fy_radio_btn.isSelected()) cl = "FY";
        else if(this.sy_radio_btn.isSelected()) cl = "SY";
        else if(this.ty_radio_btn.isSelected()) cl = "TY";
        else cl = "NaN";

        hobby = "";

        if(this.music_check_box.isSelected())
        {
            hobby += "Music";
        }
        if(this.dance_check_box.isSelected())
        {
            if(hobby.equals(""))
            {
                hobby += "Dance";
            }
            else
            {
                hobby += ", Dance";
            }
        }

        if(this.sports_check_box.isSelected())
        {
            if(hobby.equals(""))
            {
                hobby += "Sports";
            }
            else
            {
                hobby += ", Sports";
            }
        }

        this.main_string.setText("Name=" + name + " Class=" + cl + " Hobbies=" + hobby);

    }

}
