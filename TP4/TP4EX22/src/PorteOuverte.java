public class PorteOuverte extends EtatPorte
{
	
	public PorteOuverte(PorteDeGarage porte)
	{
		super(porte);
	}
	
	
	
	public void ouvrir()
	{
		System.out.println("La porte est deja ouverte");
	}
	
	public void fermer()
	{
		System.out.println("La porte va se fermer");
		this.porte.etatSuivant();
		System.out.println("La porte est en fermeture");
		
	}
	
	public EtatPorte etatSuivant()
	{
		return new Fermeture(porte);
	}



	@Override
	public String getEtat() {
		// TODO Auto-generated method stub
		return "Ouverte";
	}
}