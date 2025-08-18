import java.lang.*;
import java.util.*;

import javax.print.DocFlavor.STRING;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends JFrame implements ItemListener, ActionListener{
 Container c;
 Font fn=new Font("Arial",Font.PLAIN,24);
 JComboBox cmb=new JComboBox<>();
 ImageIcon image1=new ImageIcon("D:\\python\\burger.jpg");
 ImageIcon image2=new ImageIcon("D:\\python\\French.jpg");
 ImageIcon image3=new ImageIcon("D:\\python\\coke.jpg");
 JLabel lbl1=new JLabel(image1);
 JLabel lbl2=new JLabel(image2);
 JLabel lbl3=new JLabel(image3);
 SpinnerModel value=new SpinnerNumberModel(2,1,50,2);
 JSpinner sp=new JSpinner(value);

 JRadioButton large = new JRadioButton("Large");
 JRadioButton regular = new JRadioButton("Regular");
 JRadioButton small = new JRadioButton("Small");
ButtonGroup bg= new ButtonGroup();

JButton add= new JButton("Add");
JButton clear= new JButton("Clear");
JButton bill = new JButton("Bill");

JTextArea display1 = new JTextArea();
JTextArea display2 = new JTextArea();

JCheckBox vat =new JCheckBox("VAT");

int counter=0;
final int prburgur=350;
final int prfrench =120;
final int prcoke=50;
double total=0;



  public MyFrame(){
  c=this.getContentPane();
  c.setLayout(null);
  //cmb box
  cmb.addItem("Select Item");
  cmb.addItem("Burger");
  cmb.addItem("French Fry");
  cmb.addItem("Cold Drinks");
  cmb.setFont(fn);
  cmb.setBounds(50,50,170,40);
  c.add(cmb);
  cmb.addItemListener(this);
  //lbl1
  lbl1.setBounds(100,400,300,300);
  lbl1.setVisible(false);
  c.add(lbl1);
  lbl2.setBounds(100,400,300,300);
  lbl2.setVisible(false);
  c.add(lbl2);
  lbl3.setBounds(100,400,300,300);
  lbl3.setVisible(false);
  c.add(lbl3);
  //sp 
  sp.setFont(fn);
  sp.setBounds(230,50,80,50);
  c.add(sp);

   bg.add(large);
   bg.add(regular);
   bg.add(small);

   large.setBounds(230,110,100,40);
   c.add(large);
   large.setFont(fn);
   regular.setBounds(230,140,100,40);
   c.add(regular);
   regular.setFont(fn);
   regular.setSelected(true);
   small.setBounds(230,180,100,40);
   c.add(small);
   small.setFont(fn);   

   //for Buttons
   clear.setBounds(50, 300, 110,40);
   clear.setFont(fn);
   c.add(clear);
   add.setBounds(172, 300, 110,40);
   add.setFont(fn);
   c.add(add);
   add.addActionListener(this);
   clear.addActionListener(this);
   bill.addActionListener(this);
   bill.setBounds(285, 300, 110,40);
   bill.setFont(fn);
   c.add(bill);

   //Text Text JTextArea
   display1.setBounds(520,50, 220,300);
   display1.setFont(fn);
   c.add(display1);

   display2.setBounds(740,50, 220,300);
   display2.setFont(fn);
   c.add(display2);

   //VAT
   vat.setBounds(220,220,120,40);
   c.add(vat);
   vat.setFont(fn);
   vat.addActionListener(this);
  }
  int flag=0;
  double price =0;

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO: Add your action handling code here if needed
    if(e.getSource()==clear){
      display1.append(null);
      display2.append(null);
      total=0;
      flag=0;
      counter=0;
    }
    if(vat.isSelected()){
      int withVat = (int)(total * 0.15);
      display1.append("VAT\n");
      display2.append(" "+ withVat + "\n");
      total += withVat;
      display1.append("---------------------\n");
      display1.append("Total+VAT\n");
      display2.append("---------------------\n");  
      display2.append(" "+ total + "\n");

    }
    if(e.getSource()==bill){
      display1.append("---------------------\n");
      display1.append("Total\n");
      display2.append("---------------------\n");
      display2.append(" "+ total + "\n");
    }
    if(e.getSource()==add){
      if(flag==0){
      display1.append("Good Food\n");
      display2.append("Price\n");
      flag=1;
      }

      counter++;
   
      String a= (String)cmb.getSelectedItem();
      int no=(int)sp.getValue();
      String size="R";
      if(a.equalsIgnoreCase("Burger")){
         price=prburgur;
      }

      if(a.equalsIgnoreCase("French Fry")){
         price=prfrench;
      }

      if(a.equalsIgnoreCase("Cold Drinks")){
         price=prcoke;
      }

      if(large.isSelected()){
         size="L";
         price=1.15*price;
      }
      else if(small.isSelected()){
         size="S";

      }
      total =total + (price * no);
      display1.append(" "+ counter+ "."+ "  "+ a+ " "+ no+ size+ "\n");
      display2.append(" "+ price*no + "\n");

    }//end of add

    
  }


  @Override
  public void itemStateChanged(ItemEvent e) {
     String a=(String)cmb.getSelectedItem();
     lbl1.setVisible(false);
     lbl2.setVisible(false);
     lbl3.setVisible(false);
     if(a.equalsIgnoreCase("Burger"))
       lbl1.setVisible(true);
      
    if(a.equalsIgnoreCase("French Fry"))
       lbl2.setVisible(true);
      
    if(a.equalsIgnoreCase("Cold Drinks"))
       lbl3.setVisible(true);
      
  }
}

public class Shape {
public static void main(String[] args) {
MyFrame frame=new MyFrame();
frame.setVisible(true);
frame.setBounds(200,50,1300,900);
frame.setTitle("Good Food");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  
}
 
 
  }