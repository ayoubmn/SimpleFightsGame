package jeuCombat;



public class arme {
	kind type;

	public enum kind{
		epée,
		sortilegeoffenssif,
		bouclier,
		Sortilègedéfensif,
		remede,
		Sortilègeguérisseur,
	}
	public  arme(kind a) {
		type=a;

		
	}
	
}