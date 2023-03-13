package S1T6N2E2;

import java.util.ArrayList;

import S1T6N1E2.Persona;


public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Persona> academia = new ArrayList<Persona>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		academia.add(new Persona("Ismael","Tortosa",39));
		academia.add(new Persona("Ataulfo","Santos",54));
		
		numeros.add(0);
		numeros.add(58);
		numeros.add(54);
		
		GenericMethods obj = new GenericMethods();
		
		//veiem la llista
		obj.veureLlista(academia);
		obj.veureLlista(numeros); 
		
		
		
		
		
	}
}