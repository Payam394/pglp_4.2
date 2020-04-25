import java.util.Stack;

public class MoteurRPN extends Interpreteur{
	
	private Stack <String> list =new Stack<String>();
	
	public MoteurRPN(Stack<String> list, Interpreteur inter) {
		super();
		this.list = list;
	}
/*
	public int ajouter(String nom) {
		if (nom.equals("enregistrer")){
			CommandMoteur c = new Enregistrer(this.list);
			this.ajouter(nom, c);
			return 1;
		}
		else if (nom.equals("appliquer")){
			CommandMoteur c = new Appliquer(this.list);
			this.ajouter(nom, c);
			return 1;
		}
		else if (nom.equals("Retourner")){
			Command c = new Retourner(this.list);
			this.ajouter(nom, c);
			return 1;
		}
		return 0;
	}
*/
	
	public void enregistrer(String op) {
		list.push(op);
	}
	
	public void retourner() {
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
	}
	
	public int  appliquer(String opr) {
		if (opr.equals("Quit") || opr.equals("Undo")){
			super.executer(opr);
			return 1;
		}
		
		int elem1 = Integer.parseInt(this.list.pop());
		int elem2 = Integer.parseInt(this.list.pop());
		
		if (opr.equals("+")) {
			Integer res = elem1+elem2;
			list.push(res.toString());
		}
		else if (opr.equals("-")) {
			Integer res = elem1-elem2;
			list.push(res.toString());
		}
		else if (opr.equals("*")) {
			Integer res = elem1*elem2;
			list.push(res.toString());
		}
		else if (opr.equals("/")) {
			Integer res;
			try {
				res = elem1/elem2;
				list.push(res.toString());
				return 1;
			}
			catch(ArithmeticException ae) {
		        System.out.println("divide by zero impossible!");
		        return 0;
			}
		}
		
		System.out.println("operation doesn't existe!");
		return 0;
	
		
	}
	
	

}
