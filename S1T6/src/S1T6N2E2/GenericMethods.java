package S1T6N2E2;

import java.util.List;

public class GenericMethods /*<T, S, U>*/ {
	
	//mètodes
	public void veureLlista(List<?> llista) { //mètode d'arguments variable indefinida
		
		for (Object obj : llista) {
			System.out.println(obj.toString());  
		}  
	}
	
}
