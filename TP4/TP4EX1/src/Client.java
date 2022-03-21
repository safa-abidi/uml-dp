
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parc p=new Parc();
		Muse m=new Muse();
		Ville v= new Ville();
		v.ajouteZoneTouristique(p);
		v.ajouteZoneTouristique(m);
		v.accepteVisiteur(new VisiteurVisterPourLa1Fois());
		//m.accepteVisiteur(new VisiteurAcheterSouvenir());
		//p.accepteVisiteur(new VisiteurVisterPourLa1Fois());
		
		
	}

}
