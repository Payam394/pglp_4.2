import java.util.Stack;

public class Retourner implements Command{

	private Stack <String> list;
	
	
	
	public Retourner(Stack<String> list) {
		super();
		this.list = list;
	}


	public void execute() {
		try {
			while(!list.isEmpty()) {
				System.out.println(list.pop());
			}
		}
		catch(Exception I) {
			
		}
		
	}
	
	
}
