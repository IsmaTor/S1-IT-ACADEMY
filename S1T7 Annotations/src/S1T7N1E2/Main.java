package S1T7N1E2;

import java.util.ArrayList;

public class Main {

	@SuppressWarnings("deprecation") 	//afegim aquesta anotació perque desaparegui l'advertiment de Deprecated a calcularSou()
										//si afegim "all" esborrarà totes les advertencies
	public static void main(String[] args) {
		
		ArrayList<Treballador> empresa = new ArrayList<Treballador>();
		
		Treballador treballador1 = new Treballador("Ismael", "Tortosa", 30);
		TreballadorPresencial treballador2 = new TreballadorPresencial("Federico", "Fernández", 17, 160);
		TreballadorOnline treballador3 = new TreballadorOnline("Bruce", "Wayne", 20);
		
	
		empresa.add(treballador1);
		empresa.add(treballador2);
		empresa.add(treballador3);
		
		
		System.out.println(treballador1.calcularSou(160));
		System.out.println(treballador2.calcularSous(150)); //l'advertiment desapareix per posar a sobre del main @SuppressWarnings("deprecation")
		System.out.println(treballador3.calcularSous(150));	//l'advertiment desapareix per posar a sobre del main @SuppressWarnings("deprecation")
		// TODO Auto-generated method stub

	}
	/*
	La lista de señales que se pueden utilizar en una anotación SuppressWarnings es:

		all para suprimir todos los avisos
		boxing para suprimir los avisos relativos a las operaciones de empaquetado/desempaquetado
		cast para suprimir avisos relativos a las operaciones de conversión temporal
		dep-ann para suprimir avisos relativos a las anotaciones de desuso
		deprecation para suprimir avisos relativos al desuso
		fallthrough para suprimir avisos relativos a los enlaces faltantes en las sentencias switch
		finally para suprimir avisos relativos al bloque finally que retornan
		hiding para suprimir avisos relativos a locales que ocultan la variable
		incomplete-switch para suprimir avisos relativos a entradas faltantes en una sentencia switch (caso enum)
		javadoc para suprimir avisos relativos a avisos javadoc
		nls para suprimir avisos relativos a literales de serie no nls
		null para suprimir avisos relativos a análisis nulos
		rawtypes para suprimir avisos relativos al uso de tipos raw
		resource para suprimir avisos relativos al uso de recursos del tipo Closeable
		restriction para suprimir avisos relativos a la utilización de referencias en desuso o prohibidas
		serial para suprimir avisos relativos al campo serialVersionUID faltante para una clase serializable
		static-access para suprimir avisos relativos al acceso estático incorrecto
		static-method para suprimir los avisos relativos a lo métodos que podrían declararse como estáticos
		super para suprimir los avisos relativos a la alteración temporal de un método sin superinvocaciones
		synthetic-access para suprimir avisos relativos al acceso no optimizado desde clases internas
		sync-override para suprimir avisos debidos a la falta de sincronización al alterar temporalmente un método sincronizado
		unchecked para suprimir avisos relativos a operaciones no comprobadas
		unqualified-field-access para suprimir avisos relativos al acceso a campo no calificado
		unused para suprimir avisos relativos a código no utilizado y código muerto
		*/
}
