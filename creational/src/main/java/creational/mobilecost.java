package creational;
public class mobilecost {
public mobilespecial getPhone(String s)
{
	if (s.equals("SamsungA60"))
{
	return new mobile2();
}
	else if(s.equals("SamsungA70"))
			{
		return new mobile3();
				
			}
	else if(s.equals("SamsungA50"))
	{
		return new mobile1();
		
	}
	else
	{
		return(null);
	}
	
	
	
	
}
}