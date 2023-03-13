package PruebaEx;

public class Producte {
	
	//atributs
	private String nom;
	private String marca;
	private int stock;
	private double preu;
	
	//constructor
	public Producte(String nom, String marca, int stock, double preu) {
		this.nom = nom;
		this.marca = marca;
		this.stock = stock;
		this.preu = preu;
	}

	//getters
	public String getNom() {
		return nom;
	}

	public String getMarca() {
		return marca;
	}

	public int getStock() {
		return stock;
	}

	public double getPreu() {
		return preu;
	}

	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Productes [nom=" + nom + ", marca=" + marca + ", stock=" + stock + ", preu=" + preu + "]";
	}
	
	
	
	
	
	

}
