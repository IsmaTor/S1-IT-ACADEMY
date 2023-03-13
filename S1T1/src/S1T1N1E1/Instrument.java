package S1T1N1E1;

public abstract class Instrument {
	
	//atributs
	private String nom;
	private double preu;
	
	//constructor
	public Instrument(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	//metode
		public abstract void Tocar();
	
	//getters
	public String getNom(){
		return nom;
	}
	
	public double getPreu() {
		return preu;
	}
	
	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPreu(double preu) {
		this.preu = preu;
	}
		
	}


