package creational;
import java.util.Scanner;

public class selection {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What model you want to verify");
		
		
		
		String sr=sc.next();
		
		mobilecost e=new mobilecost();
		mobilespecial w=e.getPhone(sr);
		
		w.camera();
		w.stc();
		
		w.cost();
	}

}
