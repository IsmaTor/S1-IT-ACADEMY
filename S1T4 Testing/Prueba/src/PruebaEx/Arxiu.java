package PruebaEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arxiu {
	
	public static void llegir(ArrayList<Expenedora> expen) {
		
		File carpeta = new File("Expenedora.csv");
		
		try {
			PrintWriter print = new PrintWriter(carpeta);
			
			for (int i = 0; i < expen.size(); i++) {
				print.println(expen.get(i).toString());
			}
			print.close();
			
		} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			System.out.println("ERROR al crear l'arxiu.");
		}
	}

}
