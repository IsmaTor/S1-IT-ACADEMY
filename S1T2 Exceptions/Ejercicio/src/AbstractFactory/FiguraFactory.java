package AbstractFactory;

public class FiguraFactory extends AbstractFactory{

	@Override
	Forma getForma(String formaTipo) {
		// TODO Auto-generated method stub
		if (formaTipo.equalsIgnoreCase("RECTANGULO")) {
			return new RectanguloSpecial();
		} else if (formaTipo.equalsIgnoreCase("TRIANGULO")) {
			return new Triangulo();
		}
		return null;
	}

}
