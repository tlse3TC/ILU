package personnages;
import personnages.Chef;
import personnages.Gaulois;

public class Village {
	
	private String nom;
	private Chef chef;
	
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom,int nbVillagoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillagoisMaximum];
		}
	
	public void setChef(Chef chef) {
		this.chef= chef;
		
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois=nbVillageois+1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom() +" vivent les legendaires gaulois :");
		for (int i=0;i!=nbVillageois;i=i+1) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	
	public String getNom() {
		return nom;
		}
	
	
	public static void main(String[] args) {
		Village village= new Village("Village des irreductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef abraracourcix = new Chef("Abraracourcix",8,0,village);
		Gaulois asterix = new Gaulois("Asterix",8);
		
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
		
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
	}
}

