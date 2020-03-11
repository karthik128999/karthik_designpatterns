package behaviour_pat;
public class access {
public calc c;
access(calc c)
{
	this.c=c;
	
}
public void accessing(int a,int b)
{
	c.calc(a,b);
	
}
}