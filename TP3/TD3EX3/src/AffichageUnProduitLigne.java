import java.util.List;

public class AffichageUnProduitLigne implements AffichageCatalogue {

	@Override
	public void affiche(List<VueProduit> contenu) {
		// TODO Auto-generated method stub
		System.out.println("Dessine les produits avec un produit par ligne");
		for(VueProduit vueProduit:contenu)
		{
			vueProduit.description=vueProduit.description.toUpperCase();
			vueProduit.affiche();
			System.out.println();System.out.println();
		}
		System.out.println();
	}

}
