package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
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
		force-= forceCoup;
		if (force>0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		
	}
	public static void main(String[] args) {
		Romain minus= new Romain("Minus",2);
		minus.parler("Bonjour");
		minus.recevoirCoup(2);
	}
}
