package jeuCombat;
import arm.*;
public class combat {
	combattant a;
	combattant d;
	public static void tentative(combattant a, combattant d, arme A, arme D ) {
		System.out.println(A.type);
		switch(A.type) {
			case epée:
//								System.out.println(D.type);
								switch(D.type) {
								case epée:

									
									  if(((epée)A).pattaque(a, A) >= ((epée)D).pdefence(d, D)) {
										  d.vitalité -= ((epée)A).aattaque(a, A);
										  System.out.println("la vitalité du 2eme combattant devient   "+d.vitalité);
											}
								      break;
								
								case bouclier :
									if(((epée)A).pattaque(a, A) >= ((bouclier)D).pbouclier(d, D)) {
										d.vitalité=d.vitalité-((epée)A).aattaque(a, A);
										System.out.println("la vitalité du 2eme combattant devient   "+d.vitalité);

										}
									  break;
			
								case Sortilègedéfensif:
									if(((epée)A).pattaque(a, A) >= ((Sortilègedéfensif)D).pSortilègedéfensif(d, D)) {
										d.vitalité=d.vitalité-((epée)A).aattaque(a, A);
										System.out.println("la vitalité du 2eme combattant devient   "+d.vitalité);

									}
								      break;
								default:
									break;
										
								}					
					
			      break;
			      
			case sortilegeoffenssif:
									switch(D.type) {
									case epée:									      
										  if(((sortilegeoffenssif)A).psortilegeoffenssif(a, A) >= ((epée)D).pdefence(d, D)) {
												d.vitalité=d.vitalité-((sortilegeoffenssif)A).asortilegeoffenssif(a, A);
												System.out.println("la vitalité du 2eme combattant devient   "+d.vitalité);

												}
									      break;
									
									case bouclier :
										if(((sortilegeoffenssif)A).psortilegeoffenssif(a, A) >= ((bouclier)D).pbouclier(d, D)) {
											d.vitalité=d.vitalité-((sortilegeoffenssif)A).asortilegeoffenssif(a, A);
											System.out.println("la vitalité du 2eme combattant devient   "+d.vitalité);

											}
										  break;
					
									case Sortilègedéfensif:
										if(((sortilegeoffenssif)A).psortilegeoffenssif(a, A) >= ((Sortilègedéfensif)D).pSortilègedéfensif(d, D)) {
											d.vitalité=d.vitalité-((sortilegeoffenssif)A).asortilegeoffenssif(a, A);
											System.out.println("la vitalité du 2eme combattant devient    "+d.vitalité);

										}
									      break;
									default:
										break;
											
									}
				
				  break;
			case bouclier :
									switch(D.type) {
										case epée:
										      
											  if(((bouclier)A).pbouclier(a, A) <= ((epée)D).pattaque(d, D)) {
													a.vitalité=a.vitalité-((epée)D).aattaque(d, D);
													System.out.println("la vitalité du 1er combattant devient   "+a.vitalité);

													}
										      break;
									
						
										case sortilegeoffenssif:
											if(((bouclier)A).pbouclier(a, A) <= ((sortilegeoffenssif)D).psortilegeoffenssif(d, D)) {
												a.vitalité=a.vitalité-((sortilegeoffenssif)D).asortilegeoffenssif(d, D);
												System.out.println("la vitalité du 1er combattant devient   "+a.vitalité);

												}
											
										      break;
										default:
											break;
												
										}
				  break;

			case Sortilègedéfensif:
									switch(D.type) {
										case epée:
										      
											  if(((Sortilègedéfensif)A).pSortilègedéfensif(a, A) <= ((epée)D).pattaque(d, D)) {
													a.vitalité=a.vitalité-((epée)D).aattaque(d, D);
													System.out.println("la vitalité du 1er combattant devient   "+a.vitalité);

													}
										      break;
									
						
										case sortilegeoffenssif:
											if(((Sortilègedéfensif)A).pSortilègedéfensif(a, A) <= ((sortilegeoffenssif)D).psortilegeoffenssif(d, D)) {
												a.vitalité=a.vitalité-((sortilegeoffenssif)D).asortilegeoffenssif(d, D);
												System.out.println("la vitalité du 1er combattant devient    "+a.vitalité);

												}   
											
										      break;
										default:
											break;
												
										}
			       break;
			case remede:
										a.vitalité=a.vitalité+((remede)A).aremede(a, A);
										System.out.println("la vitalité du 1er combattant devient    "+a.vitalité);

				  break;
			case Sortilègeguérisseur:
				a.vitalité=a.vitalité+((Sortilègeguérisseur)A).asoin(a, A);
				System.out.println("la vitalité du 1er combattant devient    "+a.vitalité);


			      break;
			      
			default: break;
		}
		
		
	}
	
	
}
	

	
	
	
	


