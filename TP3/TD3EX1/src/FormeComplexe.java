import java.util.ArrayList;
import java.util.List;

public class FormeComplexe extends Forme{
	List<Forme> formesComposants=new ArrayList<Forme>();
	
	public boolean ajouteForme(Forme forme) {
		return formesComposants.add(forme);
	}
	public boolean supprimerForme(Forme forme) {
		return formesComposants.remove(forme);
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		double surfaceFinale=0.0;
		for(Forme forme: formesComposants)
			surfaceFinale=surfaceFinale+forme.calculerSurface();
		return surfaceFinale;
	}

	@Override
	public String afficherCouleur() {
		// TODO Auto-generated method stub
		String couleurSuperpos�e="";
		for(Forme forme: formesComposants)
			couleurSuperpos�e=couleurSuperpos�e+" "+forme.afficherCouleur();
		return "La superposition des couleurs "+couleur+" avec "+couleurSuperpos�e;
	}

	

}
