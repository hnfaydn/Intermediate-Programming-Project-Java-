import java.awt.*;

import javax.swing.*;
public class MP extends JFrame
{
	JPanel main,user,center,photo,other,info,phrase;
	JLabel pp,name,count,motto;
	JButton ex,it,cm,ag;
	MP(String u,String g,Integer a,Byte r,ImageIcon i)
	{
		pp=new JLabel(i);
		photo=new JPanel();
		photo.setBackground(Color.CYAN);
		photo.add(pp);
		name=new JLabel(User.rank[r]+" "+u+'/'+g+'/'+a);
		count=new JLabel("Count: "+User.c);
		motto=new JLabel(User.motto[(int)((Math.random()*100)%4)]);
		info=new JPanel();
		info.setBackground(Color.CYAN);
		info.setLayout(new FlowLayout(FlowLayout.CENTER));
		info.add(name);
		info.add(count);
		phrase=new JPanel();
		phrase.setBackground(Color.CYAN);
		phrase.setLayout(new FlowLayout(FlowLayout.CENTER));
		phrase.add(motto);
		other=new JPanel();
		other.setBackground(Color.CYAN);
		other.setLayout(new GridLayout(2,1));
		other.add(info);
		other.add(phrase);
		user=new JPanel();
		user.setBackground(Color.CYAN);
		user.setLayout(new BorderLayout());
		user.add(other,BorderLayout.SOUTH);
		user.add(photo,BorderLayout.CENTER);
		it=new JButton("Interstellar Travel");
		cm=new JButton("Cavcavat Music");
		ag=new JButton("Astronaut Game");
		center=new JPanel();
		center.setLayout(new GridLayout(3,1));
		center.add(it);
		center.add(cm);
		center.add(ag);
		ex=new JButton("Exit");
		main=new JPanel();
		main.setLayout(new BorderLayout());
		main.add(ex,BorderLayout.SOUTH);
		ex.setPreferredSize(new Dimension(960,100));
		main.add(user,BorderLayout.WEST);
		main.add(center,BorderLayout.CENTER);
		add(main);
		setTitle("CAVAT VISUAL INTERFACE");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void pre(String u,String g,Integer a,Byte r,ImageIcon i)
	{
		new MP(u,g,a,r,i);
	}
}