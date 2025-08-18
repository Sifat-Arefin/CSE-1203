package Imran;

import javax.net.ssl.ManagerFactoryParameters;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Container;
import java.awt.Font;

class Myframe extends JFrame implements ActionListener{
    Container c;
    Font fn = new Font("Kalpurush", Font.PLAIN, 20 );
    JLabel lbl1 = new JLabel();
    JLabel lbl2 = new JLabel();
    JLabel disp = new JLabel();
    JTextField login =  new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton submit = new JButton("Submit");
    String is = "Peter Parker";
    String ps = "tangle";
    public Myframe(){
        c = this.getContentPane();
        c.setLayout(null);

        //Set Bounds
        lbl1.setBounds(100,50,80,40);
        lbl1.setText("Login: ");
        lbl1.setFont(fn);
        c.add(lbl1);

        // Login Text
        login.setBounds(250,50,150,40);
        login.setFont(fn);
        c.add(login);

        //Pass Lable
        lbl2.setBounds(100,100,150,40);
        lbl2.setText("Password: ");
        lbl2.setFont(fn);
        c.add(lbl2);

        // Login Text
        pass.setBounds(250,100,150,40);
        pass.setFont(fn);
        c.add(pass);

        //Display Label
        disp.setBounds(250,200,450,40);
        disp.setText("Are you spider-man?");
        disp.setFont(fn);
        c.add(disp);
        
        //Submit button
        submit.setBounds(250,250,150,40);
        submit.setFont(fn);
        c.add(submit);
        submit.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
        // disp.setText("Yes You are a peter.");
        String a = login.getText();
        String b = new String(pass.getPassword());
        // disp.setText(a);
        // disp.setText(b);

        if(a.equals(is)){
            if(b.equals(ps)){
              disp.setText("You are spider-man.");
            }
            else{
                disp.setText("What about your tangle?");
                JOptionPane.showMessageDialog(this, "GuptoShobdo Bhul");
            }
        }
        else {
            disp.setText("Are you peter?");
            JOptionPane.showMessageDialog(this, "Asol Spider man tumi?");
        }
        }
    }

}
public class Shape{
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setVisible(true);
        frame.setBounds(200,200,600,500);
    }
}