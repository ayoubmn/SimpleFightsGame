package jeuCombat;
import java.util.ArrayList;

public class combattant {
	
		public enum types{
			Guerrier,
			Athlete,
			Magicien
		}
	
	    public int test=0;
		int a;
		ArrayList<arme> arm = new ArrayList<arme>();
		types type;
		String nom;
		public int force;
		public int dextérité;
		public int intelligence;
		public int concentration;
		public float vitalité ;
		public int expérience ;
		boolean ready = false;
		private static final int stars = 10;
		
		public combattant (String nom, types kind, int exp) {
			this.nom = nom;
			type=kind;
			expérience = exp;
			//construction des objets en donnant des valeurs par default  respectant les critéres de chaque type 
			switch(kind) {
			case Guerrier:
				force = 40;
				dextérité = 30;
				intelligence = 20;
				concentration = 10;
				vitalité=(200 -((force + dextérité + intelligence + concentration) +( expérience*3)));
				break;
			case Athlete:
				force = 30;
				dextérité = 30;
				intelligence = 30;
				concentration = 30;
				vitalité=(200 -((force + dextérité + intelligence + concentration) +( expérience*3)));

				break;
			case Magicien:
				force = 10;
				dextérité = 10;
				intelligence = 30;
				concentration = 30;
				vitalité=(200 -((force + dextérité + intelligence + concentration) +( expérience*3)));

				break;
			}

		} 
		// methodes pour verifier la possibilté de modifier les carateristique
		private boolean checkCombattantConstraint() {
			return (this.force+this.intelligence+this.concentration+this.dextérité <= (100 + this.expérience))&&(1 <= this.expérience && this.expérience <= 20);
		}
		private boolean checkGuerrierConstraint() {
			return this.checkCombattantConstraint()&&((this.force >= (this.dextérité +10)) && ((this.dextérité+10) >= (this.intelligence +10)) && ((this.intelligence +10)>=this.concentration));
		}
		private boolean checkAthleteConstraint() {
			return this.checkCombattantConstraint()&&(this.force > 20  && this.dextérité > 20  && this.intelligence > 20  && this.concentration > 20);
		}
		private boolean checkMagicienConstraint() {
			return this.checkCombattantConstraint()&&(this.intelligence > Math.max(this.force, this.dextérité) + 15  && this.concentration > Math.max(this.force, this.dextérité) + 15);
		}
		private boolean checktype() {
			switch(this.type) {
			case Guerrier:
				return this.checkGuerrierConstraint();
				
			case Athlete:
				return this.checkAthleteConstraint();
				
			case Magicien:
				return this.checkMagicienConstraint();
				
				default: return false;
			}
			
			
		}
		
		/**
		 *  Displays a meter (like a progress bar)
		 *  
		 *  eg. meter(3,6);
		 *  Output :
		 *  [***   ]
		 *  
		 * @param current The number of filled spaces
		 * @param max The number of spaces 
		 */
		private static void meter(float current, float max) {
			float ratio = current / max;
			float n = (ratio * stars);
			System.out.print("[");
			for(int k = 0; k < stars;k++) {
				if(k<n) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.print("]");
		}
		
		public void showStats() {
			System.out.println("\t"+ this.type.toString()+": "+this.nom);
			
			System.out.print("Force \t\t ");meter(this.force,100+this.expérience);System.out.println();
			System.out.print("Dextérité \t ");meter(this.dextérité,100+this.expérience);System.out.println();
			System.out.print("Intelligence \t ");meter(this.intelligence,100+this.expérience);System.out.println();
			System.out.print("Concentration \t ");meter(this.concentration,100+this.expérience);System.out.println();
			
		}

		  
		
		public void cmd(String cmd,types type) throws IllegalArgumentException {
			
			// -A +B n   syntax to modify 
			  int i =this.intelligence;
			  int d =this.dextérité;
			  int c =this.concentration;
			  int f =this.force;
			if(cmd.equals("ready")) {
				this.ready = true;
				return;
			}
			if(cmd.charAt(0) != '-' || cmd.charAt(3) != '+')
				throw new IllegalArgumentException();
			
			Integer n = new Integer(cmd.substring(6));
			
			char X = cmd.charAt(4);
			char Y = cmd.charAt(1);
			switch(type) {
				case Guerrier:
					switch(X) {
						case 'F': this.force += n;
							break;
						case 'D': this.dextérité += n;
							break;
						case 'I': this.intelligence += n;
							break;
						case 'C': this.concentration += n;
							break;
						default: throw new IllegalArgumentException();
					}
					switch(Y) {
						case 'F': this.force -= n;
							break;
						case 'D': this.dextérité -= n;
							break;
						case 'I': this.intelligence -= n;
							break;
						case 'C': this.concentration -= n;
							break;
						default: throw new IllegalArgumentException();
					}
				  break;
				case Athlete:
					switch(X) {
						case 'F' : this.force += n;
							break;
						case 'D': this.dextérité += n;
							break;
						case 'I': this.intelligence += n;
							break;
						case 'C': this.concentration += n;
							break;
						default: throw new IllegalArgumentException();
					}
					switch(Y) {
						case 'F': this.force -= n;
							break;
						case 'D': this.dextérité -= n;
							break;
						case 'I': this.intelligence -= n;
							break;
						case 'C': this.concentration -= n;
							break;
						default: throw new IllegalArgumentException();
					}
				  break;
				case Magicien:
					switch(X) {
						case 'F' : this.force += n;
							break;
						case 'D': this.dextérité += n;
							break;
						case 'I': this.intelligence += n;
							break;
						case 'C': this.concentration += n;
							break;
						default: throw new IllegalArgumentException();
					}
					switch(Y) {
						case 'F': this.force -= n;
							break;
						case 'D': this.dextérité -= n;
							break;
						case 'I': this.intelligence -= n;
							break;
						case 'C': this.concentration -= n;
							break;
						default: throw new IllegalArgumentException();
					}
			 	  break;
		      } 
			 if(!this.checktype()) {
				 System.out.println("operation invalide veuillez inserer d'autre valeur ");
				  this.intelligence=i;
				  this.dextérité=d;
				  this.concentration=c;
				  this.force=f;
			 }
				 
				 
		}
}
