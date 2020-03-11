package behaviour_pat;
public class endst implements stcalc {
	public void action( ab a) {
	      System.out.println("End state ");
	      a.setState(this);	
	   }

	   public String toString(){
	      return " in the End State";
	   }
}