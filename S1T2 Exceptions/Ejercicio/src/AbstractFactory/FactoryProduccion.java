package AbstractFactory;

public class FactoryProduccion {

	public static AbstractFactory getFactory(boolean redonda) {
		if (redonda) {
			return new FiguraFactory2();
		}else {
			return new FiguraFactory();
		}
	}
}
