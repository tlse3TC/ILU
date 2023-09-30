package personnages;

public enum Equipement {
	CASQUE("Casque"),
	BOUCLIER("bouclier");
	
	private String nom;
	
	Equipement(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}
