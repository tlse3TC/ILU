package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		assert force>=0: "La force d'un romain est toujours positive";
		this.force = force;
	}
	
	public String getnom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	public String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force>=0: "La force d'un romain est toujours positive";
		int verif=force;
		force-= forceCoup;
		if (force>0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert verif>force: "La force d'un romain doit avoir diminuer";
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) { 
		
		case 2: 
			System.out.println("Le soldat "+getnom()+" est deja bien equiper.");
			break;
		
		case 1: 
			
			if (equipements[0] == equipement) { 
				System.out.println("Le soldat "+getnom()+" possede deja un "+equipement);
			} else {
				System.out.println("Le soldat "+getnom()+" s'equipe avec: "+equipement);
				equipements[1]=equipement;
				nbEquipement=nbEquipement+1;
			}
			break;
			
		default:
			System.out.println("Le soldat "+getnom()+" s'equipe avec: "+equipement);
			equipements[0]=equipement;
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
