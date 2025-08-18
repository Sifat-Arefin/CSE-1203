import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MainFrame extends JFrame implements ActionListener {
    Container c;
    JLabel lb = new JLabel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JTextField tf = new JTextField();
    JPasswordField pf = new JPasswordField();
    JLabel displayLabel = new JLabel();
    JLabel info = new JLabel();

    JLabel valid = new JLabel();

    Font f = new Font("Arial", Font.BOLD, 20);
    Color c1 = new Color(59, 56, 160);
    Font f2= new Font("Arial", Font.BOLD, 16);
    Font f3= new Font("Arial", Font.ITALIC, 14);

    public MainFrame() {
        setTitle("Login Frame");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(178, 176, 232));

        JLabel si = new JLabel("Login Form");
        si.setBounds(50, 50, 100, 30);
        si.setFont(f3);
        c.add(si);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(50, 90, 300, 10);
        c.add(separator);

        lb.setText("Login");
        lb.setBounds(50, 100, 100, 30);
        lb.setFont(f2);
        c.add(lb);

        tf.setBounds(150, 100, 200, 30);
        tf.setFont(f);
        c.add(tf);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 140, 100, 30);
        passwordLabel.setFont(f2);

        c.add(passwordLabel);

        pf.setBounds(150, 140, 200, 30);
        pf.setFont(f);
        c.add(pf);

        b1.setText("back");
        b1.setBounds(160, 190, 70, 20);
        b1.setBackground(c1);
        b1.setForeground(Color.WHITE);
        c.add(b1);

        b2.setText("Login");
        b2.setBounds(240, 190, 70, 20);
        b2.setBackground(c1);
        b2.setForeground(Color.WHITE);
        c.add(b2);
        b2.addActionListener(this);

        displayLabel.setText("Display Operation Here: ");
        displayLabel.setBounds(50, 220, 300, 30);
        displayLabel.setFont(f2);
        c.add(displayLabel);

        info.setBounds(50, 260, 500, 30);
        info.setFont(f2); 
        c.add(info);

    }

    @Override
    public void actionPerformed(ActionEvent e) {  // method name must be this
        // TODO: Add your button handling code here
        if(e.getSource() == b2) {
            String name = new String();
            name="Sifat";
            int pass = 123;

            displayLabel.setText("Button clicked");
            String username = tf.getText();
            String password = new String(pf.getPassword());
            info.setText("Username: " + username + ", Password: " + password);

            if(username.equals(name) && password.equals(String.valueOf(pass))) {
                valid.setText("Login Successful");
            } else {
                valid.setText("Login Failed");
                JOptionPane.showMessageDialog(c, "Invalid credentials", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

public class pro1 {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        
    }
}
