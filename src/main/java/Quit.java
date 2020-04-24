
public class Quit implements Command{
	
	public void execute() {
		System.out.println("Quitting the programme");
		System.exit(0);
	}
}
