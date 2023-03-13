package S1T1N2E1;

public class Main {

	public static void main(String[] args) {
		Cotxe cotxe1 = new Cotxe("i30", 110);
		cotxe1.Informacio();
		Cotxe cotxe2 = new Cotxe("i20", 90);
		
		
		//metodos static son accesibles desde la clase y el objeto.
		//metodos no statics no se pueden acceder desde la clase, solo desde el objeto.
		cotxe1.Accelerar();
		cotxe1.Frenar();
		cotxe1.Informacio();
		cotxe2.Informacio();
		
		Cotxe.Frenar(); //accesible desde la clase el metodo static
		// TODO Auto-generated method stub

	}

}
