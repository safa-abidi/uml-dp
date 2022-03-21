import java.util.ArrayList;

public abstract class Sujet {
	public ArrayList<Observateur> observateurs= new ArrayList<Observateur>();
	public void ajouter(Observateur observateur)
	{
		observateurs.add(observateur);
	}
	
	public void retire(Observateur observateur)
	{
		observateurs.remove(observateur);
	}
	
	public void notifier()
	{
		for (Observateur observateur:observateurs)
        {
			observateur.actualise();

        }
	}
	


}
