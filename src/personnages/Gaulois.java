package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
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
	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " Envoie un grand coup dans la machoire de " + romain.getnom());
		romain.recevoirCoup(force/3);
	}
	
//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom +", force=" +force +" , effectPotion=" + effectPotion +"]";
//	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix);
	}

}
