import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int count = 0; //counter 
	for(int i=0; i<purchases.size();i++){
		if(purchases.get(i).isElectronic()==true&&purchases.get(i).getMaker()==maker) {
		count++;
		}
	}
	return count;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    if(purchases.size()<2) {
	return false;
	}
	for(int i = 1; i < purchases.size()-1; i++) { //starts at 1 and goes to purchases length -1
		if(purchases.get(i).equals(purchases.get(i+1))|| purchases.get(i-1).equals(purchases.get(i))) { 
			return true; //it will return true
			}
		}
	return false; //if nothing is found it will return false
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
