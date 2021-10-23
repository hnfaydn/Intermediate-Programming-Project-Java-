import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class LI extends JFrame implements KeyListener
{
	static int r1,r2,r3;
	JPanel o,k;
	JLabel Use,Pass,Info,Ban;
	JTextField u;
	JPasswordField p;
	public LI()
	{
		setLayout(new BorderLayout());
		o=new JPanel();
		k=new JPanel();
		Use=new JLabel("Username:");
		Pass=new JLabel("Password:");
		Info=new JLabel("Please press the 'Enter' button to log in the system.");
		Ban=new JLabel("Do not use the '$' sign in any field! Because the powershell hates it!");
		u=new JTextField();
		p=new JPasswordField();
		u.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyChar()=='$')
					u.setText("");
			}
		});
		p.addKeyListener(this);
		o.setLayout(new GridLayout(2,2));
		Color c=new Color((r1+255)%256,(r2+255)%256,(r3+255)%256);
		o.setBackground(c);
		o.add(Use);
		o.add(u);
		o.add(Pass);
		o.add(p);
		k.setLayout(new GridLayout(2,1));
		k.add(Info);
		k.add(Ban);
		add(k,BorderLayout.SOUTH);
		add(o,BorderLayout.CENTER);
		setSize(400,125);
		setTitle("LOG IN");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void pre()
	{
		new LI();
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyChar()=='é')
		{
			u.setText("God damn French...");
			p.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		if(e.getKeyChar()=='$')
			p.setText("");
		else if(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			super.setVisible(false);
			User.srch(u.getText(),p.getText());
		}
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		Random r=new Random();
		r1=r.nextInt(255)/2+127;
		r2=r.nextInt(255)/2+127;
		r3=r.nextInt(255)/2+127;
		if(e.getKeyChar()=='#')
		{
			setVisible(false);
			pre();
		}
	}
}