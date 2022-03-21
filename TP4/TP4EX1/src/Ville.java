import java.util.ArrayList;
import java.util.List;

public class Ville extends ZoneTouristique{
protected List<ZoneTouristique> zonesTouristiques=new ArrayList<ZoneTouristique>();
	@Override
	public void accepteVisiteur(Visiteur visiteur) {
		// TODO Auto-generated method stub
		System.out.println("la ville a accepté votre visite");
		visiteur.visiterVille(this);
		
		for(ZoneTouristique zt:zonesTouristiques)
			zt.accepteVisiteur(visiteur);
		
	}

	@Override
	public boolean ajouteZoneTouristique(ZoneTouristique zoneTouristique) {
		// TODO Auto-generated method stub
		return zonesTouristiques.add(zoneTouristique);
	}

}
