package behaviour_pat;
public class divcalc implements calc{
	public void calc(int a,int b)
	{
		try
		{
int d=a/b;
		System.out.println(d);
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}