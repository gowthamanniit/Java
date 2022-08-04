package folder1;

import javax.swing.*;
public class GUI_03 extends JFrame 
{
	GUI_03()
	{
		setLayout(null);
		ButtonGroup bg=new ButtonGroup();
		JRadioButton b1=new JRadioButton("Male");
		JRadioButton b2=new JRadioButton("FeMale");
		JRadioButton b3=new JRadioButton("Others");
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		b1.setBounds(100, 100, 100, 30);
		b2.setBounds(200, 100, 100, 30);
		b3.setBounds(300, 100, 100, 30);
		add(b1);add(b2);add(b3);
	}
	public static void main(String[] args) 
	{
		JFrame f1=new GUI_03();
		f1.setSize(500,500);
		f1.setVisible(true);				
	}
}
