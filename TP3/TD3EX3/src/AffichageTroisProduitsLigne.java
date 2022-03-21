import java.util.List;

public class AffichageTroisProduitsLigne implements AffichageCatalogue{

	@Override
	public void affiche(List<VueProduit> contenu) {
		// TODO Auto-generated method stub
		int compteur=0;
		System.out.println("Dessine les produits avec trois produits par ligne");
		for(VueProduit vueProduit:contenu)
		{
			
			vueProduit.affiche();
			compteur++;
			if(compteur==3)
			{
				System.out.println();
				compteur=0;
			}
			else
				System.out.print(" ");
		}
		if(compteur!=0)
			System.out.println();
		System.out.println();
	}

}
