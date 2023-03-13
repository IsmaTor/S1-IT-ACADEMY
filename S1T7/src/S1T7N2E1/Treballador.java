package S1T7N2E1;

@AnotacioPers
public class Treballador { 

	//atributs
	private String nom;
	private String cognom;
	private int edat;
	private double preuhora;
	private double horas;
	
	//constructor
	public Treballador(String nom, String cognom, int edat, double preuhora, double horas) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
		this.preuhora = preuhora;
		this.horas = horas;
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
	
	public double getHoras() {
		return this.horas;
	}
	
	public int getEdat() {
		return this.edat;
	}

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
	
	public void setHora(double horas) {
		this.horas = horas;
	}
	
	public void setEdat(int edat) {
		this.edat = edat;
	}

	//mètode obsolet
	//afegim aquest mètode @Deprecated com advertiment de que en algun moment serà esborrat o no s'utilitzarà
	@Deprecated
	public double calcularSou(double horas) {
		double preuFinal = this.getHoras() * this.getPreuhora();
		
		return preuFinal;
	}
	@Deprecated
	@Override
	public String toString() {
		return "El treballador " + this.getNom() + " " + this.getCognom() + " es el jefe i te un sou de "
				+ this.getPreuhora() + " euros l'hora amb una nomina final de " + this.calcularSou(getHoras()) + " euros/mes.";
	}
}