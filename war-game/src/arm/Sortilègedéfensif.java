package arm;
import jeuCombat.*;
public class Sortil�ged�fensif extends arme{
	
	float DprobadeR;
	float Dampact;
	int facil;
	int eff ;
	combattant c;
	
	public Sortil�ged�fensif(combattant c ,kind type, int facil , int eff) {
		super(type);
		DprobadeR=(c.concentration * facil)/10000;
		Dampact=(c.intelligence*eff)/100;
	}
	

	//Action
	public float pSortil�ged�fensif(combattant a,  arme A ) {
	    return (DprobadeR);
          }
	// ampact
	public float aSortil�ged�fensif(combattant a,  arme A ) {
		return (Dampact);
	        }
	    
	
}