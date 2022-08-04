package folder1;
import javax.swing.*;
public class GUI_04 extends JFrame
{
	GUI_04()
	{
		setLayout(null);
		DefaultComboBoxModel<String> dcbm=new DefaultComboBoxModel<String>();
		String mo[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		for(int i=0;i<mo.length;i++)
		{
			dcbm.addElement(mo[i]+"  "+i);
		}
		
		JComboBox<String> months=new JComboBox<String>();
		months.setModel(dcbm);
				
		months.setBounds(500, 100, 200, 30);
		add(months);
		
		JCheckBox c1=new JCheckBox("C");
		JCheckBox c2=new JCheckBox("C++");
		JCheckBox c3=new JCheckBox("JAVA");
		JCheckBox c4=new JCheckBox("PYTHON");
		JCheckBox c5=new JCheckBox("None Of These Above");
		c1.setBounds(100, 100, 100, 30);
		c2.setBounds(200, 100, 100, 30);
		c3.setBounds(300, 100, 100, 30);
		c4.setBounds(400, 100, 100, 30);
		c5.setBounds(500, 100, 150, 30);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
	}
	public static void main(String[] args) 
	{
		JFrame f1=new GUI_04();
		f1.setSize(500, 500);
		f1.setVisible(true);
	}
}