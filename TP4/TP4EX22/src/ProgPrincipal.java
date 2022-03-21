
public class ProgPrincipal {
	public static void main(String[] args)
	{
		PorteDeGarage porte=new PorteDeGarage();
		EcranCuisine ecran= new EcranCuisine(porte);
		porte.ouvrir();
		porte.fermer();
		porte.ouvrir();
		porte.fermer();
		porte.ouvrir();
		porte.fermer();
	}

}
