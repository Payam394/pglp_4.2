
import java.util.Stack;


public class Undo implements Command{
	
	private Stack<String> list;
	
	
	public Undo(Stack<String> list) {
		super();
		this.list = list;
	}
	
	public Undo() {
		super();
	}

	public void execute() {
		try
		{
			if (list.size()== 0) {
				System.out.println("la liste est deja vide!");
			}
			else {
				this.list.pop();
				System.out.println("Supprimation de la dernière");
			}
			
		}
		catch (NullPointerException e)
		{
			System.out.println("Error!");
		}
	}

	
}

