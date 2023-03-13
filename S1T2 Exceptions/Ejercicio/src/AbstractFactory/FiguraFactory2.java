package AbstractFactory;

public class FiguraFactory2 extends AbstractFactory {

	@Override
	Forma getForma(String formaTipo) {
		if (formaTipo.equalsIgnoreCase("CUADRADO")) {
			return new RectanguloSpecial();
		} else if (formaTipo.equalsIgnoreCase("REDONDA")) {
			return new Triangulo();
		}
		return null;
	}
	

}
