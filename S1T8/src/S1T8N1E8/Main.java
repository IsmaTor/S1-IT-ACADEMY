package S1T8N1E8;

public class Main {

	public static void main(String[] args) {
		//Construeix un generador de cadenas sense caràcters
		//cridem a la classe FunctionalInterficies creada i li afegim el mètode
		FunctionalInterficies paraula = (paraulaGira) -> new StringBuilder(paraulaGira).reverse().toString();
		
		System.out.println(paraula.reverse("Stoichkov"));
		
		// TODO Auto-generated method stub

	}

}
