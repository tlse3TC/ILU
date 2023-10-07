package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	//tp3
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	//tp3
	
	private int effetPotion =1;
	
	public Gaulois (String nom, int force) {
		this.nom = nom;
		this.force = force;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	
	//tp3
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
			}
		}

	
	
	public void faireUneDonation(Musee musee) {
		if (nbTrophees>0) {
			parler("Je donne tout mes trophes: ");
			for (int i=0;i!=nbTrophees;i++) {System.out.println(trophees[i]);}
		} else {
			parler("je n'ai pas de trophee");
		}
	}
	
	
	//tp3
//	public void frapper(Romain romain) {
//		System.out.println(nom + " Envoie un grand coup dans la machoire de " + romain.getnom());
//		romain.recevoirCoup(force/(3*effetPotion));
//	}
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est " +forcePotion+ " fois decuplee");
	}
	
	@Override
	public String toString() {
		String effectPotion = null;
		return "Gaulois [nom=" + nom +", force=" +force +" , effectPotion=" + effectPotion +"]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix);
		asterix.parler("Bonjour");
		Romain minus= new Romain("Minus",6);
		asterix.boirePotion(9);
		asterix.frapper(minus);
	}

}
