import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

class MainFrame extends JFrame implements ItemListener, ActionListener {
    Container c;
 
  
 
  

    Font f = new Font("Arial", Font.BOLD, 20);
    Color c1 = new Color(59, 56, 160);
    Font f2= new Font("Arial", Font.BOLD, 16); 
    Font f3= new Font("Arial", Font.ITALIC, 14);


    JComboBox<String> cmb = new JComboBox<String>(); 
    // JComboBox cmb= new JComboBox<>();   
    ImageIcon img1 = new ImageIcon("C:\\Users\\SIFAT AREFIN\\Downloads\\download.jpg");
   
    SpinnerModel value = new SpinnerNumberModel(1, 1, 50, 1);
    JSpinner sp = new JSpinner(value);

    public MainFrame() {

        c= this.getContentPane();
        c.setLayout(null);


        cmb.setBounds(50, 50, 130,50);
        cmb.addItem("Select Items");
        //code for add burgur image when burger is Select
        cmb.addItemListener(this);
        cmb.addItem("Burger");
        cmb.addItem("Pizza");
        cmb.addItem("Pasta");
        cmb.addItem("Salad");
        cmb.addItem("French Fries");
        cmb.setFont(f);
        c.add(cmb);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Add your event handling code here
    }
    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        // TODO: Add your item state changed handling code here
        String a =(String)cmb.getSelectedItem();
        if(a.equalsIgnoreCase("Burger")) {
              JLabel lbl = new JLabel(img1);
              lbl.setBounds(50, 100, 200, 200);
              c.add(lbl);
              c.repaint();
        }
    }

}

public class pro2 {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        
    }
}
