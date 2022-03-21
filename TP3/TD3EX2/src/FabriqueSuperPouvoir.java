import java.util.Map;
import java.util.TreeMap;

public class FabriqueSuperPouvoir {
protected Map<String,SuperPouvoirAvatar> superPouvoirs=new TreeMap<String,SuperPouvoirAvatar>();

SuperPouvoirAvatar getSuperPouvoir(String nom)
{
	SuperPouvoirAvatar résultat;
	résultat=superPouvoirs.get(nom);
	if (résultat==null) {
		résultat=new SuperPouvoirAvatar(nom);
		superPouvoirs.put(nom, résultat);
	}
	return résultat;
		
}
}

