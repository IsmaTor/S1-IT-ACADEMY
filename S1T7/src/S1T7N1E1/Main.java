package S1T7N1E1;
 
import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		ArrayList<Treballador> empresa = new ArrayList<Treballador>();
		
		Treballador treballador1 = new Treballador("Ismael", "Tortosa", 30);
		TreballadorPresencial treballador2 = new TreballadorPresencial("Federico", "Fernández", 17, 160);
		TreballadorOnline treballador3 = new TreballadorOnline("Bruce", "Wayne", 20);
		
	
		
		
		empresa.add(treballador1);
		empresa.add(treballador2);
		empresa.add(treballador3);
		
		
		
		System.out.println(treballador1.calcularSou(180));
		System.out.println(treballador2.calcularSou(180));
		System.out.println(treballador3.calcularSou(180));
		/*
		System.out.println(treballador1.toString());
		System.out.println(treballador2.toString());
		System.out.println(treballador3.toString());
		// TODO Auto-generated method stub
*/
	}

}
