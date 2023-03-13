package S1T1N1E1;

public class Percussio extends Instrument{
	 {
		System.out.println("S'està preparant l'instrument de percussió.");//se mostrará siempre que se llame a la clase
	}
	//herencia
	public Percussio(String nom, double preu) {
		super(nom,preu);
	}
	
	//crida del metode Tocar
	public void Tocar() {
		System.out.println("Està sonant un instrument de percussió, " + "aquest instrument es un " + super.getNom()
		+ " i te un preu de " + super.getPreu() + " euros.");
	}

}
