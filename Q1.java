import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Q1 implements ActionListener
{int m1;
String sss1,sss2;
JFrame f2,q;
JLabel l1;
JRadioButton b1,b2,b3,b4;
JButton b5;
Q1(JFrame f,int m,JFrame f1,String ss1,String ss2)
{m1=m;
f2=f;
sss1=ss1;
sss2=ss2;
q=new JFrame("QUESTION 1");
ButtonGroup j=new ButtonGroup();
JLabel ll=new JLabel(new ImageIcon("ram.JPEG"));
l1=new JLabel("1.Where is RAM located?");
b1=new JRadioButton("Exception Board");
b2=new JRadioButton("External Drive");
b3=new JRadioButton("Mother Board");
b4=new JRadioButton("All of above");
b5=new JButton("Save and next");
l1.setFont(new Font("cooper",Font.BOLD,50));
b1.setFont(new Font("casteller",Font.BOLD,40));
b2.setFont(new Font("casteller",Font.BOLD,40));
b3.setFont(new Font("casteller",Font.BOLD,40));
b4.setFont(new Font("casteller",Font.BOLD,40));
b5.setFont(new Font("cooper",Font.BOLD,50));
q.setVisible(true);
q.setSize(1000,1000);
q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
q.add(ll);
j.add(b1);
j.add(b2);
j.add(b3);
j.add(b4);
q.add(l1);
q.add(b1);
q.add(b2);
q.add(b3);
q.add(b4);
q.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource().equals(b5))
{
if(b3.isSelected())
m1=m1+5;
q.setVisible(false);
Page1 k=new Page1(f2,sss1,sss2);
k.marks(m1);
}
}
}