package CallBack;

public class Restaurant {
	 public static void main(String[] args){
	        class Mozo implements CamareroMultilingue{
	           public void pedirCafe(){    
	               System.out.println("El mozo le pide al cocinero: UN JAVA!");
	               System.out.println(" ");
	           }
	        }

	    //Notar que la interfaz es publica porque deben conocerla
	    //todas las clases que la contienen como propiedad
	    //pero! las clases que la implementan pueden ser privadas, internas, etc
	    //cada una que implemente puede tener el alcance y la implementacion que quiera
	    //siempre que respete los métodos y campos mínimos que propone la interfaz.
	 
	    Mozo mozoInterprete = new Mozo();

	    //Clientes, al ingresar al bar se le asigna un mozo interprete (en este caso el mismo)
	    ClaseEsp  ce = new ClaseEsp(mozoInterprete);
	    ClaseFra  cf = new ClaseFra(mozoInterprete);
	    ClaseIng  ci = new ClaseIng(mozoInterprete);

	    //acción! se procesa el pedido de los clientes
	    ce.procesa();
	    cf.procesa();
	    ci.procesa();
	    }
	}
