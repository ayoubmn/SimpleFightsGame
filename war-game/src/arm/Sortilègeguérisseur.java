package arm;
import jeuCombat.*;

public class Sortil�gegu�risseur extends arme{
		
		float SprobadeR;
		float Sampact;
		int facil;
		int eff ;
		combattant c;
		
		public Sortil�gegu�risseur(combattant c ,kind type, int facil , int eff) {
			super(type);
			SprobadeR=(float)(c.concentration * facil)/10000;
			Sampact=(float)(c.intelligence*eff)/100;
		}

	//Action
		public float psoin(combattant a,  arme A ) {
		    return (SprobadeR);
	}
		// ampact
		public float asoin(combattant a,  arme A ) {
		     return (Sampact);
	        }
	   
	
}
