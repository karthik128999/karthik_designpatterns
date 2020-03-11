package structural;
public class dup implements file {
	private String doc;
	private origin o;
	  
	dup(String doc)
	{
		this.doc=doc;
		
	}
	public void share()
	{
		
		
		if(o==null)
		{
			o =new origin(doc);
		}
		o.share();
	}

}