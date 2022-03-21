import java.util.Map;
import java.util.TreeMap;

public class FabriqueSuperPouvoir {
protected Map<String,SuperPouvoirAvatar> superPouvoirs=new TreeMap<String,SuperPouvoirAvatar>();

SuperPouvoirAvatar getSuperPouvoir(String nom)
{
	SuperPouvoirAvatar r�sultat;
	r�sultat=superPouvoirs.get(nom);
	if (r�sultat==null) {
		r�sultat=new SuperPouvoirAvatar(nom);
		superPouvoirs.put(nom, r�sultat);
	}
	return r�sultat;
		
}
}

