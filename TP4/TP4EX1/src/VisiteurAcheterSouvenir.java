
public class VisiteurAcheterSouvenir implements Visiteur{

	@Override
	public void visiterMuse(Muse muse) {
		// TODO Auto-generated method stub
		System.out.println("j'achéte un souvenir du muse!");
	}

	@Override
	public void visiterParc(Parc parc) {
		// TODO Auto-generated method stub
		System.out.println("j'achéte un souvenir du parc!");
	}

	@Override
	public void visiterVille(Ville ville) {
		// TODO Auto-generated method stub
		System.out.println("j'achéte un souvenir de la ville!");
	}

}
