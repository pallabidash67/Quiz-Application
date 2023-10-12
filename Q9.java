import java.awt. *;
import java.awt.event. *;
import javax.swing. *;

class Q9 implements ActionListener


{int
m1;
String
sss1, sss2;
JFrame
f2, q;
JLabel
l1;
JRadioButton
b1, b2, b3, b4;
JButton
b5;
Q9(JFrame
f, int
m, JFrame
f1, String
ss1, String
ss2)
{m1 = m;
f2 = f;
sss1 = ss1;
sss2 = ss2;
q = new
JFrame("QUESTION 9");
ButtonGroup
j = new
ButtonGroup();
l1 = new
JLabel("9.What is the lunch date of Chndryaan-3 mission?");
b1 = new
JRadioButton("9 July 2010");
b2 = new
JRadioButton("24 July 2023");
b3 = new
JRadioButton("10 July 2023");
b4 = new
JRadioButton("30 July 2023");
b5 = new
JButton("Save and next");
JLabel
ll = new
JLabel(new
ImageIcon("chandryan.JPEG"));
l1.setFont(new
Font("cooper", Font.BOLD, 50));
b1.setFont(new
Font("casteller", Font.BOLD, 40));
b2.setFont(new
Font("casteller", Font.BOLD, 40));
b3.setFont(new
Font("casteller", Font.BOLD, 40));
b4.setFont(new
Font("casteller", Font.BOLD, 40));
b5.setFont(new
Font("cooper", Font.BOLD, 50));
q.setVisible(true);
q.setSize(1000, 1000);
q.setLayout(new
FlowLayout(FlowLayout.CENTER, 2000, 5));
j.add(b1);
j.add(b2);
j.add(b3);
j.add(b4);
q.add(ll);
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
public
void
actionPerformed(ActionEvent
ae)
{
if (ae.getSource().equals(b5))

{
if (b2.isSelected())
m1 = m1 + 5;
q.setVisible(false);
Page1
k = new
Page1(f2, sss1, sss2);
k.marks(m1);
}
}
}