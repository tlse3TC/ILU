package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTp4 {

	
	public static void main(String[] args) {
//		Humain prof= new Humain("Prof","kombucha",54);
//		prof.direbonjour();
//		prof.acheter("boisson", 12);
//		prof.boire();
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
	
		Commercant marco=new Commercant("Marco", "the", 4);
//		marco.direbonjour();
//		marco.seFaireExtorquer();
//		marco.recevoirArgent(15);
//		marco.boire();
		Yakuza yaku=new Yakuza("Yaku", "whisky", 0,"Warsong",4 );
//		yaku.direbonjour();
//		yaku.extorquer(marco);
		
		Ronin roro=new Ronin("Roro", "shochu", 60);
//		roro.direbonjour();
//		roro.donner(marco);
		
		roro.provoquer(yaku);
	}
		
}
