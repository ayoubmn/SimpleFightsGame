package arm;
import jeuCombat.*;
public class Sortilègedéfensif extends arme{
	
	float DprobadeR;
	float Dampact;
	int facil;
	int eff ;
	combattant c;
	
	public Sortilègedéfensif(combattant c ,kind type, int facil , int eff) {
		super(type);
		DprobadeR=(c.concentration * facil)/10000;
		Dampact=(c.intelligence*eff)/100;
	}
	

	//Action
	public float pSortilègedéfensif(combattant a,  arme A ) {
	    return (DprobadeR);
          }
	// ampact
	public float aSortilègedéfensif(combattant a,  arme A ) {
		return (Dampact);
	        }
	    
	
}