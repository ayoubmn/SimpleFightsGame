package arm;
import jeuCombat.*;

public class ep�e extends arme {
		public  float AprobadeR;
		public  float Aampact;
		public  float DprobadeR;
		public  float Dampact;
		public  int mania;
		public  int impact ;
		public  int parade;

		combattant c;
		
			public ep�e(combattant c,kind type,int mania, int impact ,int parade) {
				super(type);
				AprobadeR=(float)(c.dext�rit� * mania)/10000;
				//System.out.println("arme.AprobadeR est"+AprobadeR);
				Aampact=(float)(c.force*impact)/100;
				DprobadeR=(float)(c.dext�rit� * mania)/10000;
				Dampact=(float)(c.force*parade)/100;
			}
	      

	//Actions
	public float pattaque(combattant a,  arme A ) {
		return (AprobadeR);
       }
	public float pdefence(combattant a,  arme A ) {
	    return (DprobadeR);
        }
	// ampact
	public float aattaque(combattant a,  arme A ) {
	     return (Aampact);
        }
    public float adefence(combattant a,  arme A ) {
        return (Dampact);
        }
	

}