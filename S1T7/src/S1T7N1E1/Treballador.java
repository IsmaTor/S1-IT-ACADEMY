package S1T7N1E1;
 
public class Treballador {
	//atributs
	private String nom = "";
	private String cognom = "";
	private double preuhora = 0;
	//private double horas = 0;
	
	//constructor
	public Treballador(String nom, String cognom, double preuhora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuhora = preuhora;
		//this.horas = horas;
	}

	//getters
	public String getNom() {
		return this.nom;
	}

	public String getCognom() {
		return this.cognom;
	}

	public double getPreuhora() {
		return this.preuhora;
	}
	/*
	public double getHoras() {
		return this.horas;
	}

	*/
	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setPreuhora(double preuhora) {
		this.preuhora = preuhora;
	}
	/*
	public void setHora(double horas) {
		this.horas = horas;
	}
*/
	//mètodes
	
	public double calcularSou(double horas) {
		double preuFinal = horas * this.getPreuhora();
		
		return preuFinal;
		
	}
	/*
	@Override
	public String toString() {
		return "El treballador " + this.getNom() + " " + this.getCognom() + " es el jefe i te un sou de "
				+ this.getPreuhora() + " euros l'hora amb una nomina final de " + this.calcularSou(getHoras()) + " euros/mes.";
	}*/
}
