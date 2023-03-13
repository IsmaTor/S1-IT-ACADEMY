package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory figuraFactory = FactoryProduccion.getFactory(false);
		
		Forma figura1 = figuraFactory.getForma("TRIANGULO");
		
		figura1.pintar();

	}

}
