package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Persona {
			//Declaracion de atributos de la clase persona
			private String nombre;
			private String apellidos;

			
			//Constructor por parametros de la clase persona
			public Persona(String nombre, String apellidos) {
				this.nombre = nombre;
				this.apellidos = apellidos;
				
			}

			//Getters Y Setters
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getApellidos() {
				return apellidos;
			}

			public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
			}
			

			@Override
			public String toString() {
				return "Nombre:" + this.nombre + ", Apellidos:" + this.apellidos;
			}
			
			
			
	}

