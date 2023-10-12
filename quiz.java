import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Quiz implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6;
JTextField t1,t2;
JButton b1,b2,b3,b4;
Quiz()
{
f=new JFrame("ONLINE QUIZ");
f.getContentPane().setBackground(Color.green);
f.setVisible(true);
f.setSize(1500,1500);
//f.setBackground(Color.blue);
f.setLayout(new FlowLayout(FlowLayout.CENTER,2000,5));
JLabel ll=new JLabel(new ImageIcon("mits1.JPEG"));
l1=new JLabel("Online Quiz Portal");
b1=new JButton("WELCOME TO ONLINE QUIZ");
b2=new JButton("Instructions");
l2=new JLabel("NAME");
t1=new JTextField(10);
l3=new JLabel("ROLL NO");
t2=new JTextField(10);
b3=new JButton("start");
b4=new JButton("exit");
l4=new JLabel("1.Each question carry 5 marks.");
l5=new JLabel("3.No negative marks.");
l6=new JLabel("2.You can select only one option from A to D.");
//b1.setForeground(Color.[255,20,147]);
b1.setBackground(Color.yellow);
b3.setBackground(Color.cyan);
b4.setBackground(Color.gray);
l1.setFont(new Font("cooper",Font.BOLD,40));
b1.setFont(new Font("casteller",Font.BOLD,30));
b2.setFont(new Font("cooper",Font.BOLD,25));
b3.setFont(new Font("cooper",Font.BOLD,25));
b4.setFont(new Font("cooper",Font.BOLD,25));
l4.setFont(new Font("casteller",Font.BOLD,30));
l5.setFont(new Font("casteller",Font.BOLD,30));
l6.setFont(new Font("casteller",Font.BOLD,30));
l2.setFont(new Font("casteller",Font.BOLD,30));
l3.setFont(new Font("casteller",Font.BOLD,30));
f.add(ll);
f.add(l1);
f.add(b1);
f.add(b2);
f.add(l4);
//f.add(l5);
f.add(l6);
f.add(l2);
f.add(t1);
f.add(l3);
f.add(t2);
f.add(b3);
f.add(b4);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource().equals(b3))
{
try
{String s1=t1.getText();
String s2=t2.getText();
if(t1.getText().equals(""))
{JOptionPane.showMessageDialog(null,"Enter candidate name");}
else if(t2.getText().equals(""))
{JOptionPane.showMessageDialog(null,"Enter Roll num");}
else
{f.setVisible(false);
new Page1(f,s1,s2);
}
}
finally
{}
}
else
{
f.setVisible(false);
}
}
public static void main(String...aaa)
{
new Quiz();
}
}