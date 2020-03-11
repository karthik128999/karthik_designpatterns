package behaviour_pat;
public class instate implements stcalc {
	public void action( ab a) {
	      System.out.println("Intermediate state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return "in the Intermediate state";
	   }
}