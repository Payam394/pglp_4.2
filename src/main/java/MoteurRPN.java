import java.util.Stack;

public class MoteurRPN extends Interpreteur{
	
	private Stack <String> list =new Stack<String>();
	
	public MoteurRPN(Stack<String> list) {
		super();
		this.list = list;
		
		Command rtn = new Retourner(list);
		this.ajouter("retourner", rtn);
		
		Command c1 = new Undo(list);
		this.ajouter("undo", c1);
		
	}

	
	public void enregistrer(String op) {
		list.push(op);
	}
	
	
	
	public void retourner() {
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
	}
	
	
	public int  appliquer(String opr) {
		/*
		if (opr.equals("quit") || opr.equals("undo")){
			super.executer(opr);
			return 1;
		}
		*/
		int elem1 = Integer.parseInt(this.list.pop());
		int elem2 = Integer.parseInt(this.list.pop());
		
		Integer res;
		
		if (opr.equals("+")) {
			res = elem1+elem2;
			list.push(res.toString());
			System.out.println("The result of the operation : " + res);
		}
		else if (opr.equals("-")) {
			res = elem1-elem2;
			list.push(res.toString());
			System.out.println("The result of the operation : " + res);
		}
		else if (opr.equals("*")) {
			res = elem1*elem2;
			list.push(res.toString());
			System.out.println("The result of the operation : " + res);
		}
		else if (opr.equals("/")) {
			try {
				res = elem1/elem2;
				list.push(res.toString());
				System.out.println("The result of the operation : " + res);
			}
			catch(ArithmeticException ae) {
		        System.out.println("divide by zero impossible!");
		        return 0;
			}
		}
		else {
			System.out.println("operation doesn't existe!");
			return 0;
		}
		list.pop();
		return 1;
		
		
	}
	
	

}
