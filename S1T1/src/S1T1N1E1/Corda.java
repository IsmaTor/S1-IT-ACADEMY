package S1T1N1E1;

public class Corda extends Instrument {
	 {
		System.out.println("S'està preparant l'instrument de corda.");
	}
	//herencia
	public Corda(String nom, double preu) {
		super(nom,preu);
	}

	//crida metode Tocar
	public void Tocar() {
		System.out.println("Està sonant un instrument de corda, " + "aquest instrument es una " + super.getNom()
		+ " i te un preu de " + super.getPreu() + " euros.");
	}
}
