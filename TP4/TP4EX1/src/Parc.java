
public class Parc extends ZoneTouristique{

	@Override
	public void accepteVisiteur(Visiteur visiteur) {
		// TODO Auto-generated method stub
		System.out.println("Le parc accepté votre visite");
		visiteur.visiterParc(this);
		
		
	}

	@Override
	public boolean ajouteZoneTouristique(ZoneTouristique zoneTouristique) {
		// TODO Auto-generated method stub
		return false;
	}

}
