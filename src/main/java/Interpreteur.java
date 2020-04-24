import java.util.HashMap;

public class Interpreteur {
	
	private HashMap<String, Command> mapCommand = new HashMap<String, Command>();

	
	
	
	public int executer(String nom) {
		if(mapCommand.get(nom) == null) {
			System.out.println("il n'existe pas de commande au nom de "+nom);
			return 0;
		}
		
		mapCommand.get(nom).execute();
		return 1;
		
	}
	
	
}
