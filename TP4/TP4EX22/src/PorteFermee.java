public class PorteFermee extends EtatPorte
{
	public PorteFermee(PorteDeGarage porte)
	{
		super(porte);
	}
	
	
	
	public void ouvrir()
	{
		System.out.println("La porte va s'ouvrir");
		this.porte.etatSuivant();
		System.out.println("La porte est en ouverture");
		
	}
	
	public void fermer()
	{
		System.out.println("La porte est deja fermee");
	}
	
	public EtatPorte etatSuivant()
	{
		return new Ouverture(porte);
	}



	@Override
	public String getEtat() {
		// TODO Auto-generated method stub
		return "Fermée";
	}
}