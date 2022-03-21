
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forme Fp1=new FormePrimitive();
		Fp1.ajouteCouleur("Rouge");
		Forme fp2=new FormePrimitive();
		fp2.ajouteCouleur("Bleu");
		Forme groupe1=new FormeComplexe();
		groupe1.ajouteForme(Fp1);
		groupe1.ajouteForme(fp2);
		groupe1.ajouteCouleur("Jaune");
		System.out.println("La surface de la forme complexe 1 est "+groupe1.calculerSurface());
		System.out.println("C est "+groupe1.afficherCouleur());
		Forme Fp3=new FormePrimitive();
		Fp3.ajouteCouleur("Vert");
		Forme groupe2=new FormeComplexe();
		groupe2.ajouteForme(Fp3);
		groupe2.ajouteForme(groupe1);
		System.out.println("La surface de la forme complexe 2 est "+groupe2.calculerSurface());
		System.out.println("C est "+ groupe2.afficherCouleur());
		
		

	}

}
