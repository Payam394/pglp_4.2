import java.util.ArrayList;

public class Retourner implements Command{

	private ArrayList<String> list;
		
		public Retourner(ArrayList<String> list) {
			this.list = list;
		}
		
		public void execute() {
			System.out.println("voila les elements de la liste");
			for(int i=0; i<list.size(); i++) {
				System.out.println(this.list.get(i));
			}
		}
}
