package S1T6N1E2;

public class GenericMethods <T, S, U> {
	/*Según las convenciones los nombres de los parámetros de tipo usados comúnmente son los siguientes:

		E: elemento de una colección.
		K: clave.
		N: número.
		T: tipo.
		V: valor.
		S, U, V etc: para segundos, terceros y cuartos tipos.*/
	
	//atributs
	private T gen1;
	private S gen2;
	private U gen3;
	
	//constructor
	public GenericMethods(T gen1, S gen2, U gen3) {
		this.gen1 = gen1;
		this.gen2 = gen2;
		this.gen3 = gen3;
	}

	//getters
	public T getGen1() {
		return this.gen1;
	}

	public S getGen2() {
		return this.gen2;
	}

	public U getGen3() {
		return this.gen3;
	}

	//setters
	public void setGen1(T gen1) {
		this.gen1 = gen1;
	}

	public void setGen2(S gen2) {
		this.gen2 = gen2;
	}

	public void setGen3(U gen3) {
		this.gen3 = gen3;
	}

	//mètodes
	public void veureGenerics(T gen1, S gen2, U gen3) { //li diem que agafi T,S,U dins del mètode i desprès els mostri.
		System.out.println("Persona: " + this.gen1 + " " + this.gen2 + " " + this.gen3);
	}/*
	@Override
	public String toString() {
		return "Persona: " + this.gen1 + this.gen2 + this.gen3;
	}*/
	
	

}
