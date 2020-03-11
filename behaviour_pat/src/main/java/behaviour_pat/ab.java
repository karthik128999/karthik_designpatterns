package behaviour_pat;

public class ab {
private stcalc s;

ab()
{
	s=null;
}
public void setState(stcalc s){
    this.s = s;		
 }

 public stcalc getState(){
    return s;
 }
}