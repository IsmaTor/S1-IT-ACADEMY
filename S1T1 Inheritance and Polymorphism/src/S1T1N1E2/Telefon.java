package S1T1N1E2;

public class Telefon {
	//atributs
	private String marca;
	private String model;
	private int num;
	
	//constructor
	public Telefon(String marca, String model, int num) {
		this.marca = marca;
		this.model = model;
		this.num = num;
	}
	
	//getters
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public int getNum() {
		return num;
	}
	
	//setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	//mètodes
	public void Trucar() {
		System.out.println("S'està trucant al numero " + this.num);
	}
	//metodo Trucar tiene que recibir un String con un numero de telefono, ha de salir un mensaje 
	//conforme le está llamando el número

}
