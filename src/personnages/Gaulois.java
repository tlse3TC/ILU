package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	private int effetPotion =1;
	
	public Gaulois (String nom, int force) {
		this.nom = nom;
		this.force = force;
		//temporary
		this.effetPotion = effetPotion;
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
		romain.recevoirCoup(force/(3*effetPotion));
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
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
