
import java.util.Stack;


public class Undo implements Command{
	
	private Stack<String> list;
	
	public void execute() {
		try
		{
			this.list.pop();
			System.out.println("Supprimer la dernière commande");
		}
		catch (NullPointerException e)
		{
			System.out.println("Error!");
		}
	}
}

