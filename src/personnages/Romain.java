package personnages;

public class Romain {
	private String nom;
	private int force;
	//tp3
	
	//tp3
	
	private Equipement[] equipements;
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force>=0: "La force d'un romain est toujours positive";
		this.force = force;
		
		this.equipements = new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	public String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	//tp3
	
//	public void recevoirCoup(int forceCoup) {
//		assert force>=0: "La force d'un romain est toujours positive";
//		int verif=force;
//		force-= forceCoup;
//		if (force>0) {
//			parler("Aie");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert verif>force: "La force d'un romain doit avoir diminuer";
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculresistanceEquipement(forceCoup);
		force -= forceCoup;
		
		if (force>0) {
				parler("Aie");
		} else {
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
			}
			// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
		}

	
	private int calculresistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null &&
						equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
					}
				
				}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup<0) {forceCoup=0;}
		return forceCoup;
		}
	
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i <= nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				nbEquipement=nbEquipement-1;
				}
			}
			return equipementEjecte;
		}
	
		
		
		public int getForce() {
			return force;
		}
	
	
	
	//tp3
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) { 
		
		case 2: 
			System.out.println("Le soldat "+getNom()+" est deja bien equiper.");
			break;
		
		case 1: 
			
			if (equipements[nbEquipement-1] == equipement) { 
				System.out.println("Le soldat "+getNom()+" possede deja un "+equipement);
			} else {
				System.out.println("Le soldat "+getNom()+" s'equipe avec: "+equipement);
				equipements[nbEquipement]=equipement;
				nbEquipement=nbEquipement+1;
			}
			break;
			
		default:
			System.out.println("Le soldat "+getNom()+" s'equipe avec: "+equipement);
			equipements[nbEquipement]=equipement;
			nbEquipement=nbEquipement+1;
		}
	}
	
	public static void main(String[] args) {
		Romain minus= new Romain("Minus",6);
		minus.parler("Bonjour");
		minus.recevoirCoup(2);
		
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
	}

	
}
