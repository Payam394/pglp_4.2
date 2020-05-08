import java.util.HashMap;

public class Interpreteur {
	
	private HashMap<String, Command> mapCommand = new HashMap<String, Command>();

	public HashMap<String, Command> getMapCommand() {
		return mapCommand;
	}

	public void setMapCommand(HashMap<String, Command> mapCommand) {
		this.mapCommand = mapCommand;
	}

	public Interpreteur() {
		this.mapCommand = new HashMap<String, Command>();
			Command c2 = new Quit();
			this.mapCommand.put("quit", c2);
		
	}
	
	public void ajouter(String nom, Command cmd) {
		this.mapCommand.put(nom, cmd);
	}
	
	
	public int executer(String nom) {
		if(mapCommand.get(nom) == null) {
			System.out.println("il n'existe pas de commande au nom de "+nom);
			return 0;
		}
		//System.out.println("goodinterpreteur");
		mapCommand.get(nom).execute();
		
		return 1;
		
	}
	
	
}
