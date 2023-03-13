package S1T1N1E2;


public class Smartphone extends Telefon implements Camera, Rellotge {

	//constructor
	public Smartphone(String marca, String model, int num) {
		super(marca,model,num);
	}
	
		// TODO Auto-generated constructor stub
	
	//interfaces
	public void Fotografiar() {
		System.out.println("S'està fent una foto");
	}
	
	public void Alarma() {
		System.out.println("Està sonant una alarma");
	}
}
