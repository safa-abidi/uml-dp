
public class VisiteurVisterPourLa1Fois implements Visiteur {

	@Override
	public void visiterMuse(Muse muse) {
		// TODO Auto-generated method stub
		System.out.println("Je visite pour la premi�re fois le muse!");
		
	}

	@Override
	public void visiterParc(Parc parc) {
		// TODO Auto-generated method stub
		System.out.println("Je visite pour la premi�re fois le parc!");
	}

	@Override
	public void visiterVille(Ville ville) {
		// TODO Auto-generated method stub
		System.out.println("Je visite pour la premi�re fois la ville!");
	}

}
