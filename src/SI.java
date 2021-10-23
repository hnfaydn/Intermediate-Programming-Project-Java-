import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SI extends JFrame implements KeyListener
{
	JPanel o,k;
	JLabel Use,Pass,Gal,Age,Info,Ban;
	JTextField u,p,g,a;
	public SI()
	{
		setLayout(new BorderLayout());
		o=new JPanel();
		k=new JPanel();
		Use=new JLabel("Username:");
		Pass=new JLabel("Password:");
		Gal=new JLabel("Galaxy:");
		Age=new JLabel("Age:");
		Info=new JLabel("Please press the 'Enter' button to log in the system.");
		Ban=new JLabel("Do not use the '$' sign in the first two fields! Because the powershell hates it!");
		u=new JTextField();
		p=new JTextField();
		g=new JTextField();
		a=new JTextField();
		u.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyChar()=='$')
					u.setText("");
			}
		});
		p.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent e)
			{
				if(e.getKeyChar()=='$')
					p.setText("");
			}
		});
		a.addKeyListener(this);
		o.setLayout(new GridLayout(4,2));
		o.add(Use);
		o.add(u);
		o.add(Pass);
		o.add(p);
		o.add(Gal);
		o.add(g);
		o.add(Age);
		o.add(a);
		k.setLayout(new GridLayout(2,1));
		k.add(Info);
		k.add(Ban);
		add(k,BorderLayout.SOUTH);
		add(o,BorderLayout.CENTER);
		setSize(450,200);
		setTitle("SIGN IN");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void pre()
	{
		new SI();	
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyChar()==',')
		{
			u.setText("Communist");
			p.setText("Anarchist");
			g.setText("Feminist");
			a.setText("CAN");
		}
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_ENTER)
			if(18<=Integer.valueOf(a.getText()))
			{
				User.comp(u.getText(),p.getText(),g.getText(),Integer.valueOf(a.getText()));
				super.setVisible(false);
			}
			else
				System.exit(0);
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar()=='9')
		{
			u.setText("You are too young.");
			p.setText("Or too old.");
			g.setText("But I don't care.");
			a.setText("Because I'm Powershell :");
		}
	}
}