package jeuCombat;



public class arme {
	kind type;

	public enum kind{
		ep�e,
		sortilegeoffenssif,
		bouclier,
		Sortil�ged�fensif,
		remede,
		Sortil�gegu�risseur,
	}
	public  arme(kind a) {
		type=a;

		
	}
	
}