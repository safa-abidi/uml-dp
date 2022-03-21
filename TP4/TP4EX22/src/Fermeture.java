public class Fermeture extends EtatPorte
{
	
	public Fermeture(PorteDeGarage porte)
	{
		super(porte);
	}
	

	
	public void ouvrir()
	{
		System.out.println("Attendez, la porte est en fermeture");
	}
	
	public void fermer()
	{
		System.out.println("La porte est déjà en fermeture");
		this.porte.etatSuivant();
		System.out.println("...");
		System.out.println("La porte est fermée");
		
	}
	public EtatPorte etatSuivant()
	{
		return new PorteFermee(porte);
	}



	@Override
	public String getEtat() {
		// TODO Auto-generated method stub
		return "en fermeture";
	}

}