package personnages;

public class Musee {
	private Trophee[] trophees;
	private int nbTrophee=0;
	
	public void donnertrophees(Gaulois gaulois, Equipement equipement) {
		trophees[nbTrophee]=new Trophee(gaulois,equipement);
		nbTrophee++;
	}

}
