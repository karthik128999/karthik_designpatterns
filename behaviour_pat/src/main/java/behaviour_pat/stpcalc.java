package behaviour_pat;

public class stpcalc {
public static void main(String args[])
{
	ab d=new ab();
	
	
	
	 finals s = new finals();
     s.action(d);

     System.out.println(d.getState().toString());
     instate s1 = new instate();
     s1.action(d);

     System.out.println(d.getState().toString());
     endst s2 = new endst();
     s2.action(d);

     System.out.println(d.getState().toString());
     
     	
	
}
}