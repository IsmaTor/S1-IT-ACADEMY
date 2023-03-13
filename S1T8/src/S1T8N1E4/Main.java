package S1T8N1E4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 
		ArrayList<String> mesos = new ArrayList<String>();
		
		mesos.add("gener");
		mesos.add("febrer");
		mesos.add("març");
		mesos.add("abril");
		mesos.add("maig");
		mesos.add("juny");
		mesos.add("juliol");
		mesos.add("agost");
		mesos.add("setembre");
		mesos.add("octubre");
		mesos.add("novembre");
		mesos.add("desembre");
		
		
		//mesos.forEach( (calendari) -> { System.out.println(calendari); });
		
		//afegim mesos al forEach
		//creem calendari
		
		mesos.forEach(System.out::println);
		
		
		//Referencia a un método estático	
		//ContainingClass::staticMethodName	EJEMPLO = Person::compareByAge
		
		//Referencia a un método de instancia de un objeto en particular	
		//containingObject::instanceMethodName	EJEMPLO = myComparisonProvider::compareByName
		
		//Referencia a un método de instancia de un objeto arbitrario de un tipo particular	
		//ContainingType::methodName	EJEMPLO = String::compareToIgnoreCase
		
		//Referencia a un constructor
		//ClassName::new	HashSet::new
		
		
		// TODO Auto-generated method stub

	}

}
