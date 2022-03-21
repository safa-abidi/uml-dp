public class Ouverture extends EtatPorte
{
	
	public Ouverture(PorteDeGarage porte)
	{
		super(porte);
	}
	
	
	public void ouvrir()
	{
		System.out.println("La porte est déja en ouverture");
		this.porte.etatSuivant();
		System.out.println("...");
		System.out.println("La porte est ouverte");
	}
	
	public void fermer()
	{
		System.out.println("Attendez, la porte est en train de s'ouvrir");
	}
	
	public EtatPorte etatSuivant()
	{
		return new PorteOuverte(porte);
	}
}