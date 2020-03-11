package structural;

public class avail {
public  branch c;
public  branch e;
public  branch r;

avail()
{
	c=new cse();
	e=new ece();
	r=new civil();
}
public void csecount()
{
	c.count();
	
}
public void ececount()
{
	e.count();
}
public void civilcount()
{
	r.count();
	
}


}
