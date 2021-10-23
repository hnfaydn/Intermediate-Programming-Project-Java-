import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
		File f=new File("./users.txt");
		try
		{
			FileReader r=new FileReader(f);
			BufferedReader b=new BufferedReader(r);
			boolean bo=true;
			while(bo)
			{
				String s=b.readLine();
				if(s==null)
					bo=false;
				else
					User.fdm(s);
			}
			LocScr.pre();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}