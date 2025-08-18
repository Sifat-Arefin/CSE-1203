
//swing library
import javax.swing.*;
import java.awt.*;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPasswordField;
// import javax.swing.JTextField;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Font;

class MyFrame11 extends JFrame{
    Container c;
    JLabel lb= new JLabel();
    Font fn= new Font("Arial", Font.BOLD, 28);

    JButton bt= new JButton();
    JButton bt2 = new JButton();
    

    JTextField input = new JTextField();
    JPasswordField pass = new JPasswordField();

    public MyFrame11(){
        c= this.getContentPane(); 
        c.setLayout(null);
        c.setBackground(Color.PINK);

        //for label
        lb.setBounds(50,100, 200, 50);
        lb.setText("Hello");
        lb.setFont(fn);
        lb.setBackground(Color.ORANGE);
        c.add(lb);
 
        //for button
        bt.setBounds(200, 100, 100, 100);
        bt.setText("Submit");
        c.add(bt);

        bt2.setBounds(350, 250, 100, 100);
        bt2.setText("Cancle");
        c.add(bt2);

        //for  JTextField
        input.setBounds(200, 250, 150, 50);
        c.add(input);

        //for password
        pass.setBounds(200, 350, 150, 50);
        c.add(pass);
    }

}

public class pro2 {
    public static void main(String[] args){
        MyFrame11 f11= new MyFrame11();
        

        f11.setVisible(true);
        f11.setBounds(290, 200, 750, 700);
        f11.setResizable(false);
        f11.setTitle("Sifat Arefin");
        f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
