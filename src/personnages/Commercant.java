package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		
	}

	
	public int seFaireExtorquer() {
		int sommeExtorquer=0;
		sommeExtorquer=this.argent;
		this.argent=0;
		parler("J'ai tout perdu! Le monde est trop injuste");
		return  sommeExtorquer;
	}
	
	public void recevoirArgent(int argent) {
		this.argent=this.argent+argent;
		parler(argent+" sous ! Je te remercie genereux donateur!");
	}
	
}
