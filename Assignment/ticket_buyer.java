import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.Container;

class MainFrame extends JFrame {
    JLabel label1 = new JLabel("Ticket Buyer Application");
    JLabel label2 = new JLabel("Please select your seat:");
    //Buttons
    JButton bt1_= new JButton("A1");
    JButton bt2_= new JButton("A2");
    JButton bt3_= new JButton("A3");
    JButton bt4_= new JButton("B1");
    JButton bt5_= new JButton("B2");
    JButton bt6_= new JButton("B3");
    JButton bt7_= new JButton("C1");
    JButton bt8_= new JButton("C2");
    JButton bt9_= new JButton("C3");
    JButton bt10_= new JButton("D1");
    JButton bt11_= new JButton("D2");
    JButton bt12_= new JButton("D3");
    JButton bt13_= new JButton("E1");
    JButton bt14_= new JButton("E2");
    JButton bt15_= new JButton("E3");
    JButton bt16_= new JButton("F1");
    JButton bt17_= new JButton("F2");
    JButton bt18_= new JButton("F3");
    JButton bt19_= new JButton("G1");
    JButton bt20_= new JButton("G2");
    JButton bt21_= new JButton("G3");
    JButton bt22_= new JButton("H1");
    JButton bt23_= new JButton("H2");
    JButton bt24_= new JButton("H3");

    JButton confirmButton = new JButton("Confirm");
    JButton cancelButton = new JButton("Cancel");


    
    MainFrame(){
        this.setTitle("Ticket Buyer");
        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        Container c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(145, 200, 228));

        label1.setBounds(100, 20, 400, 30);
        label2.setBounds(100, 60, 400, 30);

        bt1_.setBounds(50, 100, 50, 30);
        bt2_.setBounds(110, 100, 50, 30);
        bt3_.setBounds(170, 100, 50, 30);
        bt4_.setBounds(50, 140, 50, 30);
        bt5_.setBounds(110, 140, 50, 30);
        bt6_.setBounds(170, 140, 50, 30);
        bt7_.setBounds(50, 180, 50, 30);
        bt8_.setBounds(110, 180, 50, 30);
        bt9_.setBounds(170, 180, 50, 30);
        bt10_.setBounds(50, 220, 50, 30);
        bt11_.setBounds(110, 220, 50, 30);
        bt12_.setBounds(170, 220, 50, 30);
        bt13_.setBounds(50, 260, 50, 30);
        bt14_.setBounds(110, 260, 50, 30);
        bt15_.setBounds(170, 260, 50, 30);
        bt16_.setBounds(50, 300, 50, 30);
        bt17_.setBounds(110, 300, 50, 30);
        bt18_.setBounds(170, 300, 50, 30);
        bt19_.setBounds(50, 340, 50, 30);
        bt20_.setBounds(110, 340, 50, 30);
        bt21_.setBounds(170, 340, 50, 30);
        bt22_.setBounds(50, 380, 50, 30);
        bt23_.setBounds(110, 380, 50, 30);
        bt24_.setBounds(170, 380, 50, 30);
        confirmButton.setBounds(100, 450, 100, 30);
        cancelButton.setBounds(220, 450, 100, 30);

        //add all elements
        c.add(label1);
        c.add(label2);
        c.add(bt1_);
        c.add(bt2_);
        c.add(bt3_);
        c.add(bt4_);
        c.add(bt5_);
        c.add(bt6_);
        c.add(bt7_);
        c.add(bt8_);
        c.add(bt9_);
        c.add(bt10_);
        c.add(bt11_);
        c.add(bt12_);
        c.add(bt13_);
        c.add(bt14_);
        c.add(bt15_);
        c.add(bt16_);
        c.add(bt17_);
        c.add(bt18_);
        c.add(bt19_);
        c.add(bt20_);
        c.add(bt21_);
        c.add(bt22_);
        c.add(bt23_);
        c.add(bt24_);
        c.add(confirmButton);
        c.add(cancelButton);

    }


}

class ticket_buyer {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ticket Buyer application!");
        MainFrame frame = new MainFrame();
        frame.setVisible(true);

    }
}