import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Myframe2 extends JFrame implements  ItemListener{
    Container c;    
    Font fn = new Font("Kalpurush", Font.PLAIN, 20);
    JComboBox<String> cmb = new JComboBox<>();
    ImageIcon img1 = new ImageIcon("C:\\Users\\SIFAT AREFIN\\Downloads\\download.jpg");
    ImageIcon img2 = new ImageIcon("C:\\Users\\SIFAT AREFIN\\Downloads\\download (1).jpg");
    ImageIcon img3 = new ImageIcon("C:\\Users\\SIFAT AREFIN\\Downloads\\download (2).jpg");

    JLabel lbl1 = new JLabel(img1);
    JLabel lbl2 = new JLabel(img2);
    JLabel lbl3 = new JLabel(img3);

    //Spinner 
    SpinnerModel value = new SpinnerNumberModel(1,1,50,1);
    JSpinner sp = new JSpinner(value);

    public Myframe2() {
        c = this.getContentPane();
        c.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Proper closing

        // Combo Box
        cmb.addItem("Select Item");
        cmb.addItem("Burger");
        cmb.addItem("French Fry");
        cmb.addItem("Cold Drinks");
        cmb.setFont(fn);
        cmb.setBounds(50, 50, 200, 30); // increased width
        c.add(cmb);
         cmb.addItemListener(this);

        //Image
        lbl1.setBounds(100,200,150,100);
        lbl1.setVisible(false);
        c.add(lbl1);

        lbl2.setBounds(100,200,150,100);
        lbl2.setVisible(false);
        c.add(lbl2);

        lbl3.setBounds(100,200,150,100);
        lbl3.setVisible(false);
        c.add(lbl3);

        //Spinner
        sp.setFont(fn);
        sp.setBounds(270,50,50,30);
        c.add(sp);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String a = new String((String) cmb.getSelectedItem());
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        
        if(a.equalsIgnoreCase("Burger"));{
        lbl1.setVisible(true);
        }
        if(a.equalsIgnoreCase("French Fry"));{
        lbl2.setVisible(true);
        }
        if(a.equalsIgnoreCase("Cold Drinks"));{
        lbl3.setVisible(true);
        }
    }
    
}

public class foodcourt {
    public static void main(String[] args) {
        Myframe2 frame = new Myframe2();
        frame.setVisible(true);
        frame.setBounds(200, 100, 1000, 800);
        frame.setTitle("Good Food");
    }
}