package S1T1N1E1;



public class Main {
	static {
		System.out.println("S'estàn preparant els instruments."); //static solo se mostrará una vez al iniciar programa.
	}
	
	public static void main(String[] args) {
		Vent instrument1 = new Vent("Trompeta",185.99);
		Corda instrument2 = new Corda("Guitarra", 250.50);
		Percussio instrument3 = new Percussio("Timbal", 58.60);
		Percussio instrument4 = new Percussio("Tamborí", 25.10);
		
		instrument1.Tocar();
		instrument2.Tocar();
		instrument3.Tocar();
		instrument4.Tocar();
		
		Percussio instrument5 = new Percussio("Surdo", 78.25);
		
		instrument5.Tocar();
		
		// TODO Auto-generated method stub

	}

}
