
public class Muse extends ZoneTouristique {

	@Override
	public void accepteVisiteur(Visiteur visiteur) {
		// TODO Auto-generated method stub
		System.out.println("Le parc a accepté votre visite");
		visiteur.visiterMuse(this);
		
		
	}

	@Override
	public boolean ajouteZoneTouristique(ZoneTouristique zoneTouristique) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
