package S1T7N2E1;
 
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

	//RUNTIME perque es mantingui durant la duració de la aplicació
	@Retention(RetentionPolicy.RUNTIME)
	//Creació d'una anotació personalitzada amb @Target com a TYPE, que significa que pont anotar una classe, enumeració o interfície.
	@Target(ElementType.TYPE)
	//descripcion de la anotacion
	public @interface AnotacioPers 
	{
		//Direcció on anirà l'arxiu Json
		String direccioJson() default "c:\\CLASE\\Treballador.json";
	}
