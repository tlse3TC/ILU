package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;

	public Yakuza(String nom, String boisson, int argent, String clan,int reputation) {
		super(nom, boisson, argent);
		this.clan =clan;
		this.reputation=reputation;
		// TODO Auto-generated constructor stub
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait ce pasun faible marchant qui passe par la?");
		parler(victime.getNom()+" si tu tiens a la vie donne moi ta bourse!");
		int argentExtorquer =victime.seFaireExtorquer();
		this.argent=this.argent+argentExtorquer;
		parler("J ai piquer les "+argentExtorquer+" de "+victime+" ,ce qui me fait "+this.argent+" sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		
		int argentPerdu=this.argent;
		this.argent=0;
		parler("J'ai perdu mon duel et mes "+argentPerdu+" ,snif... J'ai deshonore le clan "+this.clan);
		this.reputation=this.reputation-1;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		this.argent=this.argent+gain;
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan "+this.clan+" ?");
		parler("Je l ai depouille de ses "+gain+" sous.");
		this.reputation=this.reputation+1;
	}
}
