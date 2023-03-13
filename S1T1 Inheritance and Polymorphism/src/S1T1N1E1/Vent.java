package S1T1N1E1;

public class Vent extends Instrument{
	 {
		System.out.println("S'està preparant l'instrument de vent.");
	}
	//herencia 
	public Vent(String nom, double preu) {
		super(nom,preu);
	}
	
	//crida al metode Tocar
	public void Tocar() {
		System.out.println("Està sonant un instrument de vent, " + "aquest instrument es una " + super.getNom()
		+ " i te un preu de " + super.getPreu() + " euros.");
	}

}
