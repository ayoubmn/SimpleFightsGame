package jeuCombat;
import arm.*;
public class combat {
	combattant a;
	combattant d;
	public static void tentative(combattant a, combattant d, arme A, arme D ) {
		System.out.println(A.type);
		switch(A.type) {
			case ep�e:
//								System.out.println(D.type);
								switch(D.type) {
								case ep�e:

									
									  if(((ep�e)A).pattaque(a, A) >= ((ep�e)D).pdefence(d, D)) {
										  d.vitalit� -= ((ep�e)A).aattaque(a, A);
										  System.out.println("la vitalit� du 2eme combattant devient   "+d.vitalit�);
											}
								      break;
								
								case bouclier :
									if(((ep�e)A).pattaque(a, A) >= ((bouclier)D).pbouclier(d, D)) {
										d.vitalit�=d.vitalit�-((ep�e)A).aattaque(a, A);
										System.out.println("la vitalit� du 2eme combattant devient   "+d.vitalit�);

										}
									  break;
			
								case Sortil�ged�fensif:
									if(((ep�e)A).pattaque(a, A) >= ((Sortil�ged�fensif)D).pSortil�ged�fensif(d, D)) {
										d.vitalit�=d.vitalit�-((ep�e)A).aattaque(a, A);
										System.out.println("la vitalit� du 2eme combattant devient   "+d.vitalit�);

									}
								      break;
								default:
									break;
										
								}					
					
			      break;
			      
			case sortilegeoffenssif:
									switch(D.type) {
									case ep�e:									      
										  if(((sortilegeoffenssif)A).psortilegeoffenssif(a, A) >= ((ep�e)D).pdefence(d, D)) {
												d.vitalit�=d.vitalit�-((sortilegeoffenssif)A).asortilegeoffenssif(a, A);
												System.out.println("la vitalit� du 2eme combattant devient   "+d.vitalit�);

												}
									      break;
									
									case bouclier :
										if(((sortilegeoffenssif)A).psortilegeoffenssif(a, A) >= ((bouclier)D).pbouclier(d, D)) {
											d.vitalit�=d.vitalit�-((sortilegeoffenssif)A).asortilegeoffenssif(a, A);
											System.out.println("la vitalit� du 2eme combattant devient   "+d.vitalit�);

											}
										  break;
					
									case Sortil�ged�fensif:
										if(((sortilegeoffenssif)A).psortilegeoffenssif(a, A) >= ((Sortil�ged�fensif)D).pSortil�ged�fensif(d, D)) {
											d.vitalit�=d.vitalit�-((sortilegeoffenssif)A).asortilegeoffenssif(a, A);
											System.out.println("la vitalit� du 2eme combattant devient    "+d.vitalit�);

										}
									      break;
									default:
										break;
											
									}
				
				  break;
			case bouclier :
									switch(D.type) {
										case ep�e:
										      
											  if(((bouclier)A).pbouclier(a, A) <= ((ep�e)D).pattaque(d, D)) {
													a.vitalit�=a.vitalit�-((ep�e)D).aattaque(d, D);
													System.out.println("la vitalit� du 1er combattant devient   "+a.vitalit�);

													}
										      break;
									
						
										case sortilegeoffenssif:
											if(((bouclier)A).pbouclier(a, A) <= ((sortilegeoffenssif)D).psortilegeoffenssif(d, D)) {
												a.vitalit�=a.vitalit�-((sortilegeoffenssif)D).asortilegeoffenssif(d, D);
												System.out.println("la vitalit� du 1er combattant devient   "+a.vitalit�);

												}
											
										      break;
										default:
											break;
												
										}
				  break;

			case Sortil�ged�fensif:
									switch(D.type) {
										case ep�e:
										      
											  if(((Sortil�ged�fensif)A).pSortil�ged�fensif(a, A) <= ((ep�e)D).pattaque(d, D)) {
													a.vitalit�=a.vitalit�-((ep�e)D).aattaque(d, D);
													System.out.println("la vitalit� du 1er combattant devient   "+a.vitalit�);

													}
										      break;
									
						
										case sortilegeoffenssif:
											if(((Sortil�ged�fensif)A).pSortil�ged�fensif(a, A) <= ((sortilegeoffenssif)D).psortilegeoffenssif(d, D)) {
												a.vitalit�=a.vitalit�-((sortilegeoffenssif)D).asortilegeoffenssif(d, D);
												System.out.println("la vitalit� du 1er combattant devient    "+a.vitalit�);

												}   
											
										      break;
										default:
											break;
												
										}
			       break;
			case remede:
										a.vitalit�=a.vitalit�+((remede)A).aremede(a, A);
										System.out.println("la vitalit� du 1er combattant devient    "+a.vitalit�);

				  break;
			case Sortil�gegu�risseur:
				a.vitalit�=a.vitalit�+((Sortil�gegu�risseur)A).asoin(a, A);
				System.out.println("la vitalit� du 1er combattant devient    "+a.vitalit�);


			      break;
			      
			default: break;
		}
		
		
	}
	
	
}
	

	
	
	
	


