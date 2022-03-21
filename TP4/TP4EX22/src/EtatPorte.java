public abstract class EtatPorte
{
	PorteDeGarage porte;
	public EtatPorte(PorteDeGarage porte)
	{
		this.porte=porte;
	}
	public abstract void ouvrir();
	public abstract void fermer();
	public abstract EtatPorte etatSuivant();
	public abstract String getEtat();
}