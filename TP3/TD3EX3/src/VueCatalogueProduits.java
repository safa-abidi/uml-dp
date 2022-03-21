import java.util.ArrayList;
import java.util.List;

public class VueCatalogueProduits {
protected List<VueProduit> contenu= new ArrayList<VueProduit>();
protected AffichageCatalogue affichage;

public VueCatalogueProduits(AffichageCatalogue affichage)
{
	contenu.add(new VueProduit("Chaussures orthop�diques"));
	contenu.add(new VueProduit("Th�rmom�tre"));
	contenu.add(new VueProduit("Hydromasseur pieds"));
	contenu.add(new VueProduit("tensiom�tre"));
	contenu.add(new VueProduit("Piquet m�dical"));
	this.affichage=affichage;
}
public void affiche()
{
	affichage.affiche(contenu);
}
}
