import java.util.*;
import javax.swing.*;
public class User
{
	static ArrayList<String> names=new ArrayList<String>();
	static ArrayList<String> pass=new ArrayList<String>();
	static ArrayList<String> gals=new ArrayList<String>();
	static ArrayList<Integer> ages=new ArrayList<Integer>();
	static ArrayList<Byte> ranks=new ArrayList<Byte>();
	static ArrayList<ImageIcon> icons=new ArrayList<ImageIcon>();
	static String[] rank={"Youngling","Padawan","Jedi","Sith","Darth","Masterkiller","Father","Emperorkiller"};
	static String[] motto={"Gelin tanis olalim, isi kolay kilalim, sevelim sevilelim; dunya kimseye kalmaz.",
		"Ey ogul! Bagi coz, ozgur ol. Ne zamana kadar gumuse, altina bagli kalacaksin? Sevgi aciyi tatlilastirir. Sevgi bakiri" +
		" altin eder.","Ana gibi yar olmaz Istanbul gibi diyar, guleni soyle dursun aglayani bahtiyar. Gecesi sunbul kokan," +
				"Turkcesi bulbul kokan; Istanbul, Istanbul.","Benim manevi mirasim ilim ve akildir. Egitimdir ki bir milleti ya" +
						" hur, bagimsiz, sanli yuksek bir topluluk halinde yasatir; ya da bir milleti esaret ve sefalete terk eder."};
	static int c=0;
	public static void fdm(String s)
	{
		StringTokenizer t=new StringTokenizer(s,"$");
		names.add(t.nextToken());
		pass.add(t.nextToken());
		gals.add(t.nextToken());
		ages.add(Integer.valueOf(t.nextToken()));
		ranks.add(Byte.valueOf(t.nextToken()));
		ImageIcon icon= new ImageIcon("C:/Users/Bedir HALCI/Desktop/str/pps/"+t.nextToken());
		icons.add(icon);
	}
	public static void comp(String u,String p,String g,Integer a)
	{
		boolean b=true;
		for(int i=0;i<names.size();i++)
			{
				if(u.equalsIgnoreCase(names.get(i)))
					b=false;
				if(p.equalsIgnoreCase(pass.get(i)))
					b=false;
			}
		if(b)
		{
			add(u,p,g,a);
			ImageIcon i=PP.pre();
			MP.pre(u,g,a,(byte)0,i);
		}
		else
		{
			System.out.println("These are being used by another person.");
		}
	}
	private static void add(String u, String p, String g, Integer a)
	{
		names.add(u);
		pass.add(p);
		gals.add(g);
		ages.add(Integer.valueOf(a));
		ranks.add((byte) 0);
	}
	public static void srch(String u, String p)
	{
		int n=-1;
		for(int i=0;i<names.size();i++)
			if(u.equals(names.get(i)))
				for(int j=0;j<pass.size();j++)
					if(p.equals(pass.get(j)))
						if(i==j)
							n=i;
		if(n!=-1)
		{
			String g=gals.get(n);
			Integer a=ages.get(n);
			Byte r=ranks.get(n);
			ImageIcon i=icons.get(n);
			MP.pre(u,g,a,r,i);
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
}