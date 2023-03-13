package CallBack;

public class ClaseEsp {
	//interfaz que permite que el pedido sea interpretado afuera de esta clase
	 private CamareroMultilingue pedido; 
	 private boolean hambre; //variable ejemplo

	    // constructor
	    public ClaseEsp(CamareroMultilingue p){
	        pedido = p;
	    }

	    public void procesa(){

	        hambre = true;

	        if (hambre){
	           System.out.println("Buen día, un café por favor");
	           pedido.pedirCafe();
	        }
	    }
	}

