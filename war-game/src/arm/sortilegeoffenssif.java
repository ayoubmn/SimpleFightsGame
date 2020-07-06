package arm;

import jeuCombat.arme;
import jeuCombat.combattant;

public class sortilegeoffenssif extends arme{
		
		public  float AprobadeR;
		float Aampact;
		int faci;
		int eff ;
		combattant c;
		
		public sortilegeoffenssif (combattant c,kind type,int faci, int eff ) {
			super(type);
			AprobadeR=(c.dextérité * faci)/10000;
			Aampact=(c.force*eff)/100;
		}

		//Action
				public float psortilegeoffenssif(combattant a,  arme A ) {
				    return (AprobadeR);
			}
	    // ampact
				public float asortilegeoffenssif(combattant a,  arme A ) {
				     return (Aampact);
			        }
}

