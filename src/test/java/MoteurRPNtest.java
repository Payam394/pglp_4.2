import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class MoteurRPNtest {
	
	Stack <String> list =new Stack<String>();
	private MoteurRPN moteur = new MoteurRPN(list);

	@Test
	public void testEnregistrer() {
		moteur.enregistrer("12");
		moteur.enregistrer("56");

		String tst= list.pop();
		assertEquals("56", tst);
		
		tst= list.pop();
		assertEquals("12", tst);
	}
	
	
	@Test
	public void testAppliquerPlus() {
		moteur.enregistrer("11");
		moteur.enregistrer("8");
		
		int tstRes= moteur.appliquer("+");
		assertEquals(tstRes, 19);
	}
	
	@Test
	public void testAppliquerMinus() {
		moteur.enregistrer("11");
		moteur.enregistrer("18");
		
		int tstRes= moteur.appliquer("-");
		assertEquals(tstRes, 7);
	}
	
	
	@Test
	public void testAppliquerMult() {
		moteur.enregistrer("11");
		moteur.enregistrer("8");
		
		int tstRes= moteur.appliquer("*");
		assertEquals(tstRes, 88);
	}
	
	
	@Test
	public void testAppliquerDiv() {
		moteur.enregistrer("11");
		moteur.enregistrer("22");
		
		int tstRes= moteur.appliquer("/");
		assertEquals(tstRes, 2);
	}
	

	@Test
	public void testRetourner() {
		moteur.enregistrer("11");
		moteur.enregistrer("22");
		
		try {
			moteur.retourner();
		}
		catch(Exception I) {
			
		}
	}
	
	
	
	@Test
	public void testUndo() {
		moteur.enregistrer("11");
		moteur.enregistrer("22");
		
		moteur.executer("undo");
		assertEquals(list.size(), 1);
		
		String tst = this.list.pop();
		assertEquals(tst, "11");
		
		//
	}
	

	
	
	
}
