package S1T6N2E1;

import S1T6N1E2.Persona;

public class Main {

	public static void main(String[] args) {
		
		//atributs amb un String i una variable de tipus primitiu
		String nom = "Frodo";
		int edat = 40;
		
		//creem l'objecte persona
		Persona persona1 = new Persona("Ismael","Tortosa",39);
		
		//creem l'objecte amb el mètode Genèric T,S,U i mostrarà l'objecte de la classe Persona i Strig nom i l'edat.
		GenericMethods<Persona,String,Integer> obj = new GenericMethods<>(persona1, nom, edat);
		
		//System.out.println(obj.toString());
		obj.veureGenerics(persona1, nom, edat);   
	}
}