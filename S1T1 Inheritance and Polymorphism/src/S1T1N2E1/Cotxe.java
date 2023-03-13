package S1T1N2E1;

public class Cotxe {
	//atributs
	private static final String marca = "Hyundai"; //al ser static final, este atributo no admitirá cambios.
	private static String model = "";
	private final double potencia;
	
	//constructor
	public Cotxe(String model, double potencia) {
		
		this.model = model;
		this.potencia = potencia;
	}
	//getters
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public double getPotencia() {
		return potencia;
	}
	
	//setters
	public void setModel(String model) {
		this.model = model;
	}
	
	//metodes
	public static void Frenar() {
		System.out.println("El cotxe està frenan");
	}
	
	public void Accelerar() {
		System.out.println("El cotxe està accelerant");
	}
	
	public void Informacio() {
		System.out.println("Es un cotxe es de marca " + this.marca + ", model " + this.model + " i te una potencia de " 
				+ this.potencia + " C.V.");
	}
	
	

}
