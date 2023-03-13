package S1T7N1E2;



public class TreballadorOnline extends Treballador {
	//atributs
	private static final int internet = 120;
 
	//constructor
	public TreballadorOnline(String nom, String cognom, double preuhora) {
		super(nom, cognom, preuhora);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSou(double horas) {
		double preuFinal = (horas * super.getPreuhora()) + internet;
		
		return preuFinal;
	}
	
	//mètode obsolet
	//afegim aquest mètode @Deprecated com advertiment de que en algun moment serà esborrat o no s'utilitzarà
	@Deprecated
	public double calcularSous(double horas) {
		double preuFinal = horas * this.getPreuhora();
			
		return preuFinal;
		}
		
	/*
	@Override
	public String toString() {
		return "El treballador " + super.getNom() + " " + super.getCognom() + " treballa des de casa i te un sou de "
				+ super.getPreuhora() + " euros l'hora amb una nomina final de " + this.calcularSou(super.getHoras()) + " euros/mes.";
	}*/
	

}
