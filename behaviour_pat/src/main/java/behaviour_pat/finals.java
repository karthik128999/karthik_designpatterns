package behaviour_pat;
public class finals implements stcalc {
public void action(ab a)
{
	System.out.println("Initial state is instantiated");
	a.setState(this);
}
public String toString(){
    return (" in the Initial State");
 }
}