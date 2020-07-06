package arm;
import jeuCombat.*;
public class remede extends arme {
		float SprobadeR;
		float Sampact;
		int facil;
		int eff ;
		combattant c;
		
		public remede(combattant c ,kind type, int facil , int eff) {
			super(type);
			SprobadeR=(c.dextérité * facil)/10000;
			Sampact=(c.dextérité*eff)/100;
		}
	
	
	//Action
		public float premede(combattant a,  arme A ) {
		    return (SprobadeR);
	}
	// ampact
		public float aremede(combattant a,  arme A ) {
		     return (Sampact);
	        }
	   
}
