
public class EcranCuisine implements Observateur {
	PorteDeGarage porte;
	public EcranCuisine(PorteDeGarage porte) {
		// TODO Auto-generated constructor stub
		this.porte=porte;
		porte.ajouter(this);
		//actualise();
	}

	@Override
	public void actualise() {
		// TODO Auto-generated method stub
		System.out.println("Ecran de cuisine: La porte est "+porte.getEtat());
	}


}
