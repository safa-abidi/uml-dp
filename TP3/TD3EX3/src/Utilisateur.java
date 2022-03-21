
public class Utilisateur {
	public static void main(String args[])
	{
		VueCatalogueProduits vueCatalogue1=new VueCatalogueProduits(new AffichageTroisProduitsLigne());
		vueCatalogue1.affiche();
		VueCatalogueProduits vueCatalogue2=new VueCatalogueProduits(new AffichageUnProduitLigne());
		vueCatalogue2.affiche();
		
	}

}
