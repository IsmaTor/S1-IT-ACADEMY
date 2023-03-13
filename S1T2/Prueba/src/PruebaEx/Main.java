package PruebaEx;

import java.util.ArrayList;

public class Main   {
	

	
	public static void main(String[] args) {
		
		ArrayList<Expenedora> expen = new ArrayList<Expenedora>();
		
		
		
		Expenedora expenedora1 = new Expenedora("Makins");
		
		expen.add(expenedora1);
		
		Producte producte1 = new Producte("Coke", "Coca-Cola", 9, 2);
		Producte producte2 = new Producte("Sprite", "Coca-Cola", 9, 2);
		Producte producte3 = new Producte("Aigua", "Bezoya", 12, 1);
		
		expenedora1.afegirProductes(producte1);
		expenedora1.afegirProductes(producte2);
		expenedora1.afegirProductes(producte3);
		
		
		
		//expenedora1.Stock();
		//expenedora1.mostrarProducte();
		//expenedora1.mostrarMarcas();
		//expenedora1.mostrarQuantitat();
		//expenedora1.stockTotal();
		//Arxiu.llegir(expen);
			
		

			
		
		// TODO Auto-generated method stub

	}
}

	


