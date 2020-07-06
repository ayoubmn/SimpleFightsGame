package jeuCombat;
import java.util.Scanner;
import arm.*;
import jeuCombat.arme.kind;

public class execution {
	public static final boolean skip = true; 
	public int aa=5;
	 kind type ;
	public static void main(String[] args){
		
		int test=0;
		
		System.out.println("Que voulez vous faire?");
		System.out.println("1 | Commencer le jeu");
		System.out.println("2 | Quitter");
		System.out.print("\t>");
		int A = /*skip?1:*/new Scanner(System.in).nextInt();
		
		combattant[] c = {null,null};
		if(A == 1) {
			for(int i = 0; i<2 ; i++) {
				System.out.println("\tCréation d'un nouveau combattant ");
				
				System.out.println("Veuillez inserer son nom : ");
				String nom = /*skip?"m":*/new Scanner(System.in).nextLine();
				
				System.out.println("Veuillez choisir son type : ");
				System.out.println("1 | Guerrier");
				System.out.println("2 | Athlete");
				System.out.println("3 | Magicien");
				System.out.print("\t>");
				int type = /* skip?1:*/new Scanner(System.in).nextInt();
				
				c[i] = new combattant(nom,combattant.types.values()[type-1],4);
			}
		} else {
			System.out.println("Quit ..");
			System.exit(0);
		}
		
		
		for(int i = 0; i<2 ; i++) {	
			do {
				c[i].showStats();
				System.out.print("\t>");
				c[i].cmd(new Scanner(System.in).nextLine(),c[i].type);		
			}while(!c[i].ready);
		}
		
		// affectation des arms
				for(int j=0;j<2;j++) {
					for(int i=0;i<3;i++) {
						
						System.out.println("voulez vous ajouter une arme pour combatant"+j);
						System.out.println("1 | OUI");
						System.out.println("2 | NON");
						System.out.print("\t>");
						int t=/*skip?1:*/ new Scanner(System.in).nextInt();
						if(t==1) {
							System.out.println("Quelle type d'arme voulez vous ajouter ?");
							System.out.println("1 | epee");
							System.out.println("2 | sortilègeoffensif");
							System.out.println("3 | bouclier");
							System.out.println("4 | Sortilègedéfensif");
							System.out.println("5 | remede");
							System.out.println("6 | Sortilègeguérisseur");
							int T = new Scanner(System.in).nextInt();
							switch(T) {
								case 1 :
									System.out.println("veuillez inserer respectivement les valeurs suivantes l'une apres l autre \n\t maniabilité \n\t impact \n\t parade ");
									Scanner val =new Scanner(System.in);
									int mania=/*skip?1:*/val.nextInt();
									int impact=/*skip?1:*/val.nextInt();
									int parade=/*skip?1:*/val.nextInt();
									epée ep = new epée(/*arme.types.values()[T-1]*/c[j],kind.epée , mania,impact,parade);
							        try{c[j].arm.add(i,ep);
							        }catch(Exception e) {i=i-1;};
							        break;
								case 2 :
									System.out.println("veuillez inserer respectivement les valeurs suivantes l'une apres l autre \n\t facilité \n\t eff ");
									Scanner va2 =new Scanner(System.in);
									int facil1=/*skip?1:*/va2.nextInt();
									int eff1=/*skip?1:*/va2.nextInt();
									sortilegeoffenssif so = new sortilegeoffenssif(c[j],kind.sortilegeoffenssif ,facil1,eff1);

							        try{c[j].arm.add(i,  so);
							        }catch(Exception e) {i=i-1;}
							        
							        break;
								case 3 :
									System.out.println("veuillez inserer respectivement les valeurs suivantes l'une apres l autre \n\t maniabilité \n\t protect ");
									Scanner va3 =new Scanner(System.in);
									int maniab=/*skip?1:*/va3.nextInt();
									int protect=/*skip?1:*/va3.nextInt();
									bouclier b = new bouclier(c[j],kind.bouclier ,maniab,protect);

									try{c[j].arm.add(i,  b);
							        }catch(Exception e) {i=i-1;}
									
							        break;
								case 4 :
									System.out.println("veuillez inserer respectivement les valeurs suivantes l'une apres l autre \n\t facilité \n\t efficacité ");
									Scanner va4 =new Scanner(System.in);
									int facil2=/*skip?1:*/va4.nextInt();
									int eff2=/*skip?1:*/va4.nextInt();
									Sortilègedéfensif SD = new Sortilègedéfensif(c[j],kind.Sortilègedéfensif ,facil2,eff2);
									try{c[j].arm.add(i,  SD);
							        }catch(Exception e) {i=i-1;}							        
							        break;
								case 5 :
									System.out.println("veuillez inserer respectivement les valeurs suivantes l'une apres l autre \n\t facilité \n\t efficacité ");
									Scanner va5 =new Scanner(System.in);
									int facil3=/*skip?1:*/va5.nextInt();
									int eff3=/*skip?1:*/va5.nextInt();
									remede R = new remede(c[j],kind.remede ,facil3,eff3);
									try{c[j].arm.add(i,  R);
							        }catch(Exception e) {i=i-1;}	
									break;
								case 6 :
									System.out.println("veuillez inserer respectivement les valeurs suivantes l'une apres l autre \n\t facilité \n\t efficacité ");
									Scanner va6 =new Scanner(System.in);
									int facil4=/*skip?1:*/va6.nextInt();
									int eff4=/*skip?1:*/va6.nextInt();
									Sortilègeguérisseur SG = new Sortilègeguérisseur(c[j],kind.Sortilègeguérisseur ,facil4,eff4);
									try{c[j].arm.add(i,  SG);
							        }catch(Exception e) {i=i-1;}		
									break;
							}
						}
						else if(t==2) {
							break;
						}
						else {
							System.out.println("veuillez inserer une valeur valide");
							i=i-1;
							
						}
					   }
				      }
				
				
		// System.out.println(a.get(0).type+" 1 "+a.get(1).type+" 2 "+a.get(2).type+" 3  "+a.get(3).type+"  4  "+a.get(4).type+"  5   "+a.get(5).type);		
		 System.out.println("press p pour play");
	     String start =new Scanner(System.in).nextLine();
		 if (start.equals("p")) {
			 int v=1;
			 while (v!=0) {
				 System.out.println("voulez vous faire une tentative \n \t 1 : oui ");
				 int t= new Scanner(System.in).nextInt();
				 if (t==1) {
					 System.out.println("Quelle arme voulez vous utiliser \n \t 1 : 1st arme \n \t  2: 2nd arm \n \t 3 : 3rd arm (if exist)");
//					 System.out.println(c[0].arm.get(0)+""+c[0].arm.get(1)+""+c[0].arm.get(2));
					 int r=/*skip?0:*/ new Scanner(System.in).nextInt()-1;
					 System.out.println("Quelle arme voulez vous que votre advairsaire utilise \n \t 1 : 1st arme \n \t 2 : 2nd arm \n \t 3 : 3rd arm (if exist)");
//					 System.out.println(c[1].arm.get(0)+""+c[1].arm.get(1)+""+c[1].arm.get(2));
					 int m=/*skip?0: */new Scanner(System.in).nextInt()-1;
					 combat.tentative(c[0],c[1],c[0].arm.get(r),c[1].arm.get(m));
				 }
				 if(c[0].vitalité<=0 ) {
					 if(c[0].expérience>0) { c[0].expérience-=1;}
					 if(c[1].expérience<10){ c[1].expérience+=1;}
					 v=0; System.out.println("*************game over  **********");}
				 else if(c[1].vitalité<=0 ) {
					 if(c[1].expérience>0) { c[1].expérience-=1;}
					 if(c[0].expérience<10){ c[0].expérience+=1;}
					 v=0; System.out.println("***********you win !! **********");}
				 
				 	 
			 }
			 
			 
			 
		 }

 }
}