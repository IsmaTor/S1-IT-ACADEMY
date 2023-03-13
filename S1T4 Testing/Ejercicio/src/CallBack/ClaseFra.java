package CallBack;

public class ClaseFra {
	//interfaz que permite que el pedido sea interpretado afuera de esta clase
	 private CamareroMultilingue pedido; 
	 private boolean hambre; //variable ejemplo

	   // constructor
	    public ClaseFra(CamareroMultilingue p){
	        pedido = p;
	    }

	    public void procesa(){

	        hambre = true;

	        if (hambre){
	           System.out.println("Bonjour, un café s'il vous plaît?");
	           pedido.pedirCafe();
	        }
	    }
	}
