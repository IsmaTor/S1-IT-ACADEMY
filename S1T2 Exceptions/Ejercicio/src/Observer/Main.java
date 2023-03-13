package Observer;

public class Main {

	public static void main(String[] args) {
		
		Motor v8 = new Motor();
		
		Acelerador acel = new Acelerador();
		
		acel.enlazarObservador(v8);
		
		acel.pisarAcelerador();
		// TODO Auto-generated method stub

	}

}
