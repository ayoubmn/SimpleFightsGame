package arm;

import jeuCombat.*;

public class bouclier extends arme{
	float DprobadeR;
	float Dampact;
	int mania;
	int protect ;
	combattant c;
	
	public bouclier(combattant c ,kind type, int mania , int protect) {	
		super(type);
		DprobadeR=(float)(c.dextérité * mania)/10000;
		Dampact=(float)(c.force*protect)/100;
	}
	

	//Action
			public float pbouclier(combattant a,  arme A ) {
			    return (DprobadeR);
		}
	// ampact
			public float abouclier(combattant a,  arme A ) {
			     return (Dampact);
		        }
		   
}


