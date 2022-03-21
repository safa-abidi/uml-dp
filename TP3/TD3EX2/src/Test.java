
public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FabriqueSuperPouvoir fabrique= new FabriqueSuperPouvoir();
		AvatarCommandé avatar1=new AvatarCommandé();
		avatar1.ajouteSuperPouvoir("TornadeFeu", 80, fabrique);
		avatar1.ajouteSuperPouvoir("TourbillonEau", 90, fabrique);
		avatar1.ajouteSuperPouvoir("Voler", 85, fabrique);
		avatar1.afficheSuperPouvoirs();
		AvatarCommandé avatar2=new AvatarCommandé();
		avatar2.ajouteSuperPouvoir("TornadeFeu", 100, fabrique);
		avatar2.ajouteSuperPouvoir("TourbillonEau", 60, fabrique);
		avatar2.ajouteSuperPouvoir("Transparence", 45, fabrique);
		avatar2.afficheSuperPouvoirs();
		
		System.out.println(fabrique.superPouvoirs.toString());
	}

}
