import java.util.ArrayList;
import java.util.List;

public class VueCatalogueProduits {
protected List<VueProduit> contenu= new ArrayList<VueProduit>();
protected AffichageCatalogue affichage;

public VueCatalogueProduits(AffichageCatalogue affichage)
{
	contenu.add(new VueProduit("Chaussures orthopédiques"));
	contenu.add(new VueProduit("Thérmométre"));
	contenu.add(new VueProduit("Hydromasseur pieds"));
	contenu.add(new VueProduit("tensiomètre"));
	contenu.add(new VueProduit("Piquet médical"));
	this.affichage=affichage;
}
public void affiche()
{
	affichage.affiche(contenu);
}
}
