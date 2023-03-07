package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MainPersona {
	
	public static void main(String[] args) {
		//Declaramos Array
		ArrayList<Persona> arrayPersonas= new ArrayList<Persona>();
		//Declaramos Personas
		Persona p1 = new Persona("rafa", "ruiz");
		Persona p2 = new Persona("rocio", "gavira");
		Persona p3 = new Persona("enrique", "profesor");
		//Añadimos Personas al Array
		arrayPersonas.add(p1);
		arrayPersonas.add(p2);
		arrayPersonas.add(p3);
		//Muestra la lista de personas del Array
		System.out.println(arrayPersonas);
		//Invertir orden del Array
		Collections.reverse(arrayPersonas);
		System.out.println(arrayPersonas);
	}
}
