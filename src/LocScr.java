import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LocScr extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l;
	JButton log,sig;
	public LocScr()
	{
		setLayout(new BorderLayout());
		p1=new JPanel();
		l=new JLabel("Edep Ya Hu!");
		p1.add(l);
		p2=new JPanel();
		log=new JButton("Log In");
		sig=new JButton("Sign In");
		log.addActionListener(this);
		sig.addActionListener(this);
		p2.setLayout(new GridLayout(1,2));
		p2.add(log);
		p2.add(sig);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		setSize(300,125);
		setTitle("CVI 1.0");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void pre()
	{
		new LocScr();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==log)
			LI.pre();
		else if(e.getSource()==sig)
			SI.pre();
		super.setVisible(false);
	}
}