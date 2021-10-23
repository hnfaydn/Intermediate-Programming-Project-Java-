import java.awt.*;

import javax.swing.*;
public class PP extends JFrame
{
	static ImageIcon i1=new ImageIcon("C:/Users/Bedir HALCI/Desktop/str/pps/a.jpg");
	static ImageIcon i3=new ImageIcon("C:/Users/Bedir HALCI/Desktop/str/pps/c.jpg");
	static ImageIcon i5=new ImageIcon("C:/Users/Bedir HALCI/Desktop/str/pps/e.jpg");
	JLabel l1,l3,l5;
	JRadioButton r1,r3,r5;
	JButton ex;
	JPanel p0,p1,p3,p5;
	PP()
	{
		l1=new JLabel(i1);
		l3=new JLabel(i3);
		l5=new JLabel(i5);
		r1=new JRadioButton();
		r3=new JRadioButton();
		r5=new JRadioButton();
		p1=new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(r1,BorderLayout.SOUTH);
		p1.add(l1,BorderLayout.CENTER);
		p3=new JPanel();
		p3.setLayout(new BorderLayout());
		p3.add(r3,BorderLayout.SOUTH);
		p3.add(l3,BorderLayout.CENTER);
		p5=new JPanel();
		p5.setLayout(new BorderLayout());
		p5.add(r5,BorderLayout.SOUTH);
		p5.add(l5,BorderLayout.CENTER);
		p0=new JPanel();
		p0.setLayout(new GridLayout(1,3));
		p0.add(p1);
		p0.add(p3);
		p0.add(p5);
		add(p0);
		pack();
		setTitle("PP");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static ImageIcon pre()
	{
		new PP();
		ImageIcon i=i3;
		return i;
	}
}