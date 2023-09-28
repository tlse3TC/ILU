package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		Romain minus= new Romain("Minus",6);
		Druide panoramix =new Druide("Panoramix",5,10);
		
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
