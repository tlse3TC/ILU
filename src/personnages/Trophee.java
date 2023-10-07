package personnages;
import personnages.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public String donnerNom(Gaulois goulois) {
		return gaulois.getNom();
	}
}
