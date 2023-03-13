package Numeros;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*Programa (Kata) per dilluns:
			Fes un programa que generi 20 números aleatoris entre 0 i 100, i els guardi en un array.
			Un cop tenim l'array amb els 20 números, el programa ha de passar tots els parells a les primeres posicions de l'array, 
			i tots els imparells a les posicions finals de l'array. Si ho necessites pots utilitzar més d'un array per poder fer la 
			solució final.
		*/
		

		int numero;
		
		ArrayList<Integer> numeros = new ArrayList();
		ArrayList<Integer> numerosPares = new ArrayList<>();
		ArrayList<Integer> numerosImpares = new ArrayList<>();
		
		
		for (int i = 1; i <= 20; i++) {
		    numero = (int) (Math.random() * 100 + 1);
		    if (numero % 2 == 0) {
		        numerosPares.add(numero);
		    } else {
		        numerosImpares.add(numero);
		    }
		}
		
		for (Integer numPar : numerosPares) {
			numeros.add(numPar);
		}
		
		for (Integer numImp : numerosImpares) {
			numeros.add(numImp);
		}
		
		for (Integer nums : numeros) {
			System.out.println(nums);
		}
		
		
		
		

		
		
		// TODO Auto-generated method stub

	}

}
