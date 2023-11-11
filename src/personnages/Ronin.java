package personnages;

public class Ronin extends Humain {
	private int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
		this.honneur=1;
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner=(int) (this.argent*0.1);
		this.argent=(this.argent-argentDonner);
		parler(beneficiaire.getNom()+" prend ces "+ argentDonner+" sous.");
		beneficiaire.recevoirArgent(argentDonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait a ce pauvre marchant!");
		
		int force=2*this.honneur;
		if (force>adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza!");
			this.argent=adversaire.perdre();
			this.honneur=this.honneur+1;
			
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en on pris un coup.");
			adversaire.gagner(this.argent);
			this.argent=0;
			this.honneur=this.honneur-1;
			
		}
		
	}
}
