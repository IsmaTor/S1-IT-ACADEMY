package S1T6N1E1;


public class NoGenericMethods {
	
	private static Object[] objecte;
	private static int a = 0;
	
	public NoGenericMethods(String nom1, String nom2, String nom3) {
		objecte = new Object[6];
		NoGenericMethods.afegirObjecte(nom1);
		NoGenericMethods.afegirObjecte(nom2);
		NoGenericMethods.afegirObjecte(nom3);
		
	}
	
	public Object getObject(int a) {
		return objecte[a];
	}
	
	public static Object afegirObjecte(Object obj) {
		objecte[a] = obj;
		a++;
		return obj;
	}
	
}
