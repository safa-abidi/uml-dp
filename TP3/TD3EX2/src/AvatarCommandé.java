import java.util.ArrayList;
import java.util.List;

public class AvatarCommandé {
	List<SuperPouvoirAvatar> superPouvoirs=new ArrayList<SuperPouvoirAvatar>();
	List<Integer> prixDeVenteSuperPouvoirs=new ArrayList<Integer>();
	public void ajouteSuperPouvoir(String nom, int prixDeVente, FabriqueSuperPouvoir fabrique)
	{
		superPouvoirs.add(fabrique.getSuperPouvoir(nom));
		prixDeVenteSuperPouvoirs.add(prixDeVente);
	}
	public void afficheSuperPouvoirs()
	{
		int i, taille;
		taille=superPouvoirs.size();
		for(i=0;i<taille;i++)
		{
			superPouvoirs.get(i).affiche(prixDeVenteSuperPouvoirs.get(i).intValue());
			System.out.println();
		}
	}

}
