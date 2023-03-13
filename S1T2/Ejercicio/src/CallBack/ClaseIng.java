package CallBack;

public class ClaseIng {
	//interfaz que permite que el pedido sea interpretado afuera de esta clase
	 private CamareroMultilingue pedido; 
	 private boolean hambre; //variable ejemplo
	   
	    // constructor
	    public ClaseIng(CamareroMultilingue p){
	        pedido = p;
	    }

	    public void procesa(){

	        hambre = true;

	        if (hambre){
	           System.out.println("Good morning, can I have a coffee please ?");
	           pedido.pedirCafe();
	        }
	    }
	}