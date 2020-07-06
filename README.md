# SimpleFightsGame
le projet est un jeu de combat simple basée sur l'initialisation de la force du caractere choisie par le joueur

# explications du programme
##	début
Le programme commence par demander le nom et le type du personnage   puis il appel la classe Combattant pour le construire on se basant sur les critères par default qui correspond à la condition mentionner dans le sujet
##	modification des caractéristiques des personnages
Les caractéristique des personnages sont guidés par plusieurs conditions qui dépend du type de personnage ce qui rend la tache de les remplir par le joueur très difficile  pour cela on a décidé de donner des valeurs par default a chaque type de combattant au construction puis on donne au joueur la possibilité de les modifier d’une façons plus facile, d’abord on affichant les caractéristiques sous forme d’un showStats comme l’exemple ci-dessous :
> Guerrier: 1er combattant <br />
Force 	         [****      ] <br />
Dextérité   	 [***       ] <br />
Intelligence 	 [**        ] <br />
Concentration    [*         ] <br />
Pour la phase de la modification le joueur utilise l’instruction suivante :
    -A +B n	 (*)
                A : caractéristique à diminuer
    				B : caractéristique à augmenter
				N : la valeur de la modification


(*)   F : force   ,  D : dextérité, I : intelligence,  C : concentration
(**) Il peut que le changement ne s’applique pas s’il ne respect pas les conditions 
À la fin des modifications le joueur doit taper  ready pour que le programme passe à la deuxième étape.
##	La création et l’affectation des armes
On demande au joueur s’il veut ajouter des armes en choisissant le type d’arme voulut et en remplissant les caractéristique qui correspond au type d’arme choisie puis on répète l’opération 2 ou 3 fois ca dépend du volonté du joueur ensuite en ajoute l’arme dans l’ « ArrayList» qui correspond au 1er personnage par suite on refait la même chose pour le 2eme  
A la fin on commence le combat en faisant la 1ere tentative 
##	Le combat
On appelle a la méthode tentative qui prend comme argument les deux combattant et les deux armes qui vont être utilisé au niveau de cette tentative dont la quelle on étudier les probabilités d’attaque et de défense des deux armes et on agit sur la vitalité du personnage perdu on diminue l’impact du personnage gagnant (*) et on répète les tentatives jusqu’à la mort de un des personnages c est à dire que sa vitalité devient nul (ou négatif).
(*) Les  armes du soin augmentent la vitalité du personnage qu’il utilise
