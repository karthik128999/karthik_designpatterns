package behaviour_pat;
import java.util.Scanner;

public class technique{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
System.out.println("give  values for a and b");
int p=sc.nextInt();
int q=sc.nextInt();
	access a = new access(new addcalc());		
    a.accessing(p,q);
    access a3 = new access(new modcalc());		
    a3.accessing(p,q);
    access a4 = new access(new powcalc());		
    a4.accessing(p,q);
    access a5 = new access(new subcalc());
    a5.accessing(p,q);
	
}
}