package S1T7N2E1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import com.google.gson.Gson;
 
public class Main {

	public static void main(String[] args) throws IOException {

		//creem l'objecte treballador
		Treballador treballador = new Treballador("Ismael", "Tortosa", 39, 30, 160);
		
		//cridem al mètode per veure el que es guardarà a dins de l'arxiu .json
		arxiuJson(treballador);
}

	public static String arxiuJson (Treballador treballador) throws IOException {
											
		Class classeP = treballador.getClass();		//obtindrem la notificació d'una classe amb l'objecte Class de la mateixa classe 
													
		Annotation anotacio = classeP.getAnnotation(AnotacioPers.class); //cridarem al mètode .getAnnotatio i li passarem com argument l'objecte Class de l'anotació.
		
		AnotacioPers anotacioGuia = (AnotacioPers) anotacio; //cast 
			
			String direccio = anotacioGuia.direccioJson(); //fiquem la direcció a dins del String

			Gson arxiuJson = new Gson(); //objecte Json
			
			String arxiu = arxiuJson.toJson(treballador); //fiquem treballador a dins del Json

			try {
				File carpeta = new File(direccio); //direcció a dins de carpeta
				
				carpeta.createNewFile(); //nou arxiu
				
				FileWriter escriuArxiu = new FileWriter(carpeta, true); //escribim l'arxiu
				
				BufferedWriter arxiuBuf = new BufferedWriter(escriuArxiu); //guardem l'arxiu a la memoria intermedia
				
				arxiuBuf.write(arxiu); //fiquem l'arxiu Json
				arxiuBuf.close(); 
				
				System.out.println(arxiu);
				
			} catch (FileNotFoundException ex) {
				System.out.println("No s'ha trobat l'arxiu.");
			}
			return arxiu;
	}
}