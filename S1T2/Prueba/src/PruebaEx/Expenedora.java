package PruebaEx;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.Stream;

public class Expenedora {
	static Scanner entrada = new Scanner(System.in);

	private static ArrayList<Producte> productes = new ArrayList<Producte>();
	private String nom;
	private final int STOCK = 20; // stock com max serà 20 sempre

	public Expenedora(String nom) {
		this.nom = nom;
	}

	// getters
	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public String getNom() {
		return nom;
	}

	// setters
	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// afegir productes
	public void afegirProductes(Producte producte) {
		productes.add(producte);
	}

	// veure/afegir Stock
	public void Stock() {

		for (Producte producte : productes) {
			System.out.println("Escull producte: ");
			String nom = entrada.next();

			if (producte.getNom().equalsIgnoreCase(nom) && producte.getStock() < STOCK) {
				System.out.println("Producte " + producte.getNom() + " : " + producte.getStock() + " unitats.");

				int stockInicial = producte.getStock();
				int stockActual = STOCK - producte.getStock();
				System.out.println("S'han d'omplir " + stockActual + " unitats.");
				int stockFinal = stockActual + stockInicial;
				// afegim la diferencia
				producte.setStock(stockFinal);

				System.out.println("Stock del producte després de reposar: " + " " + producte.getNom() + " "
						+ producte.getStock() + " unitats.");
			}
			break;
		}
	}

	// mostrar productes amb LAMBDA
	public void mostrarProducte() {
		
		System.out.println("Indica producte a mostrar: ");
		String nom = entrada.next();
		
		Stream<Producte> nomProducte = productes.stream().filter(producte -> producte.getNom().equalsIgnoreCase(nom));
	        
		 nomProducte.forEach(veureNom -> System.out.println(veureNom.toString()));
		}
	
	//mostrar productes de una mateixa marca amb LAMBDA
	public void mostrarMarcas() {
		
		System.out.println("Marca a trobar: ");
		String marca = entrada.next();
		
		Stream<Producte> marcaProducte = productes.stream().filter(producte -> producte.getMarca().equalsIgnoreCase(marca));
        
		marcaProducte.forEach(veureMarca -> System.out.println(veureMarca.toString()));

    }
	
	//mostrar quantitat de productes de una mateixa marca amb LAMBDA
	public void mostrarQuantitat() {
		
		System.out.println("Marca a trobar: ");
		String marca = entrada.next();
		
		long quantitat;
		
		quantitat = productes.stream().filter(quantitatProductes -> quantitatProductes.getMarca().equalsIgnoreCase(marca)).count();
		
		System.out.println("Hi han " + quantitat + " productes de la mateixa marca.");
		
	}
	
	//stock total
	public void stockTotal() {
		
		int stockTotal = 0;
		
		for (Producte producte : productes) {
			stockTotal += producte.getStock();
		}
		System.out.println(stockTotal);
	}

	@Override
	public String toString() {
		return "Expenedora " + nom + " [productes=" + productes + ", capacitat stock=" + STOCK + " unitats.]";
	}
	
	
	
}
	


