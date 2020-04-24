
import java.util.ArrayList;


public class Undo implements Command{
	
	private ArrayList<String> list;
	
	public void execute() {
		try
		{
			this.list.remove(this.list.size()-1);
			System.out.println("Supprimer la dernière commande");
		}
		catch (NullPointerException e)
		{
			System.out.println("Error!");
		}
	}
}

