
public class SuperPouvoirAvatar {
	protected String nom;
	protected String description;
	
	
	public SuperPouvoirAvatar(String nom) {
		// TODO Auto-generated constructor stub
		
		this.nom=nom;
		this.description="Description de "+nom;
	}
	public void affiche(int prixDeVente) {
		System.out.println("Super Pouvoir");
		System.out.println("Nom: "+nom);
		System.out.println(description);
		System.out.println("Prix de vente "+prixDeVente);
	}

}
