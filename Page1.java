import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Page1 implements ActionListener
{int m=0;
JFrame f1,p;
JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JLabel l1;
JButton b11;
String ss1,ss2;
Page1(JFrame f,String s1,String s2)
{
ButtonGroup g11=new ButtonGroup();
f1=f;
ss1=s1;
ss2=s2;
p=new JFrame("QUIZ");
p.setVisible(true);
p.setSize(1000,1000);
p.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
b1=new JRadioButton("Question 1");
b2=new JRadioButton("Question 2");
b3=new JRadioButton("Question 3");
b4=new JRadioButton("Question 4");
b5=new JRadioButton("Question 5");
b6=new JRadioButton("Question 6");
b7=new JRadioButton("Question 7");
b8=new JRadioButton("Question 8");
b9=new JRadioButton("Question 9");
b10=new JRadioButton("Question 10");
g11.add(b1);
g11.add(b2);
g11.add(b3);
g11.add(b4);
g11.add(b5);
g11.add(b6);
g11.add(b7);
g11.add(b8);
g11.add(b9);
g11.add(b10);
l1=new JLabel("Good Luck !!! You can proceed.");
l1.setFont(new Font("cooper",Font.BOLD,50));
b11=new JButton("SAVE and SUBMIT");
b11.setFont(new Font("cooper",Font.BOLD,35));
b1.setFont(new Font("casteller",Font.BOLD,30));
b2.setFont(new Font("casteller",Font.BOLD,30));
b3.setFont(new Font("casteller",Font.BOLD,30));
b4.setFont(new Font("casteller",Font.BOLD,30));
b5.setFont(new Font("casteller",Font.BOLD,30));
b6.setFont(new Font("casteller",Font.BOLD,30));
b7.setFont(new Font("casteller",Font.BOLD,30));
b8.setFont(new Font("casteller",Font.BOLD,30));
b9.setFont(new Font("casteller",Font.BOLD,30));
b10.setFont(new Font("casteller",Font.BOLD,30));
//p.setBackground(Color.pink);
p.add(l1);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
b11.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource().equals(b1))
{
p.setVisible(false);
new Q1(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b2))
{
p.setVisible(false);
new Q2(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b3))
{
p.setVisible(false);
new Q3(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b4))
{
p.setVisible(false);
new Q4(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b5))
{
p.setVisible(false);
new Q5(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b6))
{
p.setVisible(false);
new Q6(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b7))
{
p.setVisible(false);
new Q7(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b8))
{
p.setVisible(false);
new Q8(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b9))
{
p.setVisible(false);
new Q9(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b10))
{
p.setVisible(false);
new Q10(p,m,f1,ss1,ss2);
}
if(ae.getSource().equals(b11))
{
p.setVisible(false);
JOptionPane.showMessageDialog(null,"Submitted Succesfully");
JOptionPane.showMessageDialog(null,"The candidate "+ss1+" with roll num "+ss2+"  score is::"+m);
}
}
public void marks(int m1)
{
m=m+m1;
}
}