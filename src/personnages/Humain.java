package personnages;



public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	
	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	protected void parler(String texte) {
		System.out.println("("+nom+")"+"<< " + texte + ">>");
	}
	
	
	public void direbonjour() {
		parler("Bonjour ! Je m appelle " +nom+" et j'aime boire du "+boisson+".");
	}
	
	
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson+" ! Gloups !");
	}
	
	public void gagnerArgent(int argent) {
		this.argent+=argent;
	}
	
	public void perdreArgent(int argent) {
		this.argent-=argent;
	}
	
	public void acheter(String achat,int argent) {
		if (this.argent<argent) {parler("Je n'ai plus que "+this.argent+" sous en poche. Je ne peux meme pas m offrir un "+achat+" a :"+argent+" sous");}
		else {
			parler("J'ai "+this.argent+" sous en poche. Je vais pouvoir m offrir un(e) "+achat+" a : "+argent+" sous.");
		}
		
		perdreArgent(argent);
		
	}
	
}


