package structural;
import java.util.Scanner;

public class pdf{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Pdf should be shared?");
		String sen=sc.next();
		file s1=new dup(sen);
		s1.share();
		
	}
}
