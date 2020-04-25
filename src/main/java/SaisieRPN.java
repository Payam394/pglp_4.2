import java.util.Scanner;
import java.util.Stack;

public class SaisieRPN {
	
	Stack <String> list =new Stack<String>();
	
	private Scanner scan =  new Scanner(System.in);
	private MoteurRPN moteur = new MoteurRPN(list);
	
	
	public void input() {
		String s = this.scan.nextLine();
		
		try {
			Integer.parseInt(s);
			this.moteur.enregistrer(s);
			//this.moteur.executer("enregistrer");
		}
		catch(NumberFormatException e) {
			if(s.equals("undo") || s.equals("quit") || s.equals("retourner")) {
				this.moteur.executer(s);
			}
			else if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")){
				this.moteur.appliquer(s);
			}
			else {
				
			}
		}
	}


	public SaisieRPN() {
		super();
	}

}
