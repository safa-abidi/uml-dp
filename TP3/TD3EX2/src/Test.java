
public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FabriqueSuperPouvoir fabrique= new FabriqueSuperPouvoir();
		AvatarCommand� avatar1=new AvatarCommand�();
		avatar1.ajouteSuperPouvoir("TornadeFeu", 80, fabrique);
		avatar1.ajouteSuperPouvoir("TourbillonEau", 90, fabrique);
		avatar1.ajouteSuperPouvoir("Voler", 85, fabrique);
		avatar1.afficheSuperPouvoirs();
		AvatarCommand� avatar2=new AvatarCommand�();
		avatar2.ajouteSuperPouvoir("TornadeFeu", 100, fabrique);
		avatar2.ajouteSuperPouvoir("TourbillonEau", 60, fabrique);
		avatar2.ajouteSuperPouvoir("Transparence", 45, fabrique);
		avatar2.afficheSuperPouvoirs();
		
		System.out.println(fabrique.superPouvoirs.toString());
	}

}
