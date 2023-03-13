package S1T6N1E2;

public class Persona {
	//atributs
	private String nom = "";
	private String cognom = "";
	private int edat = 0;
	
	//constructor
	public Persona(String nom, String cognom, int edat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	//getters
	public String getNom() {
		return this.nom;
	}

	public String getCognom() {
		return this.cognom;
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

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona: " + this.nom + " " + this.cognom + " " + this.edat;
	}
	
	

}
