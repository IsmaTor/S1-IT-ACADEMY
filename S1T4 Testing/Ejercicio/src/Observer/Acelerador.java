package Observer;

import java.util.ArrayList;

public class Acelerador implements Observable {
	
	private ArrayList<Observador> observadores;
	
	public Acelerador() {
		observadores = new ArrayList<Observador>();
	}
	
	public void pisarAcelerador() {
		notificar();
	}
	
	public void enlazarObservador(Observador obj) {
		
		observadores.add(obj);
	}

	@Override
	public void notificar() {
		for(Observador ob : observadores) {
			ob.update();
		}
		// TODO Auto-generated method stub
		
	} //observado

}
