package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}

	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}
	
	public String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion = random.nextInt(effetPotionMin,effetPotionMax);
		
		if (forcePotion>7) {
			parler("J'ai prepare une super potion de force");
		} else {
		parler("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force: "+forcePotion);}
	}
	
	public void booster(Gaulois gaulois) {
		if ("Obelix".equals(gaulois.getNom())) {parler("Non, Obelix !... Tu n auras pas de potion magique !");}
		else {
		preparerPotion();
		gaulois.boirePotion(forcePotion);}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
	
}
