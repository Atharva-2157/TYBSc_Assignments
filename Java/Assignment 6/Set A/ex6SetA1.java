import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;

class ex6SetA1 extends JFrame implements ItemListener {
    JPanel p1, p2;
    JTextField txtData;
    JLabel lblFont, lblStyle, lblSize;
    JComboBox<String> cbFont;
    JComboBox<String> cbSize;
    JCheckBox chkBold, chkItalic, chkUnderline;
    Font txt_font;

    public ex6SetA1() {
        this.setTitle("Ex1 font");
        this.setSize(300, 300);
        this.setLocation(450, 200);
        this.setVisible(true);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        // p1.setBackground(Color.yellow);
        p1.setSize(300, 100);
        p2 = new JPanel();
        p2.setSize(300, 150);
        p2.setLayout(null);
        this.add(p1);
        this.add(p2);

        p1.setLayout(new GridLayout(4, 2, 10, 10));

        lblFont = new JLabel("Font");
        p1.add(lblFont);

        lblStyle = new JLabel("Style");
        p1.add(lblStyle);

        // cbFont = new JComboBox<String>(Toolkit.getDefaultToolkit().getFontList());
        cbFont = new JComboBox<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        cbFont.setBackground(Color.WHITE);
        cbFont.addItemListener(this);
        p1.add(cbFont);

        chkBold = new JCheckBox("Bold");
        chkBold.setOpaque(false);
        chkBold.addItemListener(this);
        p1.add(chkBold);
        
        lblSize = new JLabel("Size");
        p1.add(lblSize);
        
        chkItalic = new JCheckBox("Italics");
        chkItalic.setOpaque(false);
        chkItalic.addItemListener(this);
        p1.add(chkItalic);
        
        String size[] = {"10", "12", "14", "16", "18", "20"};
        cbSize = new JComboBox<>(size);
        // cbSize.addItem("16");
        cbSize.setBackground(Color.WHITE);
        cbSize.addItemListener(this);
        p1.add(cbSize);
        
        chkUnderline = new JCheckBox("Underline");
        chkUnderline.setOpaque(false);
        chkUnderline.addItemListener(this);
        p1.add(chkUnderline);

        txtData = new JTextField(20);
        txtData.setBounds(10, 10, 260, 50);
        p2.add(txtData);

    }

    public static void main(String[] args) {
        new ex6SetA1();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // if(e.getSource() == this.cbFont)
        // {
        //     System.out.println("Font changed");
        // }
        // if(e.getSource() == this.cbSize)
        // {
        //     System.out.println("size changed");
        // }
        Font f;
        int f_size = Integer.parseInt(this.cbSize.getItemAt(this.cbSize.getSelectedIndex()));
        String f_family = (String)this.cbFont.getSelectedItem();

        if(this.chkBold.isSelected() && this.chkItalic.isSelected())
        {
            f = new Font(f_family, Font.BOLD | Font.ITALIC, f_size);
        }
        else if(this.chkBold.isSelected())
        {
            f = new Font(f_family, Font.BOLD, f_size);
        }
        else if(this.chkItalic.isSelected())
        {
            f = new Font(f_family, Font.ITALIC, f_size);        
        }
        else
        {
            f = new Font(f_family, Font.PLAIN, f_size);        
        }

        java.util.Map m = f.getAttributes();
        m.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
        // System.out.println(m);
        f = f.deriveFont(m);

        if(this.chkUnderline.isSelected())
        {
            m.replace(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            f = f.deriveFont(m);
        }
        else
        {
            m.replace(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE);
            f = f.deriveFont(m);
        }
        this.txtData.setFont(f);

    }
}