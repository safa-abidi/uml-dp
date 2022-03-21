
public class PorteDeGarage 
{
	private EtatPorte etat;
	
	public PorteDeGarage()
	{
	
		etat=new PorteFermee(this);
		System.out.println("La porte est fermée");
	}
	
	public void etatSuivant()
	{
		etat=etat.etatSuivant();
	
	}
	
	public void ouvrir()
	{
		etat.ouvrir();
	}
	
	public void fermer()
	{
		etat.fermer();
	}
	

}