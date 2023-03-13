package S1T8N1E1;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	//mètode per buscar la lletra o i mostrar el jugadors que tinguin aquesta lletra amb Lambdas
	public static void buscaLletra(ArrayList<String> plantilla) {
		
		List<String> agafaO = plantilla.stream().filter(lletra -> lletra.contains("o")).collect(Collectors.toList());
		System.out.println(agafaO);
		
		//.stream = per agafar una llista (plantilla)
		//.filter = per filtrar el que volem, un nom, una lletra, etc... (lletra.contains("o")
		//.collect = recoletar/agafar el elements de la llista (Collectors.toList())
	}

	public static void main(String[] args) {
		
		ArrayList<String> plantilla = new ArrayList<String>();
		
		plantilla.add("Schmeichel");
		plantilla.add("Cafú");
		plantilla.add("Puyol");
		plantilla.add("Nesta");
		plantilla.add("Maldini");
		plantilla.add("Xavi");
		plantilla.add("Iniesta");
		plantilla.add("Baggio");
		plantilla.add("Messi");
		plantilla.add("Ronaldo");
		plantilla.add("Stoichkov");
		
		//plantilla.forEach( (jugadors) -> { System.out.println(jugadors); } );
		
		Main.buscaLletra(plantilla);
		
		// TODO Auto-generated method stub

	}

}
