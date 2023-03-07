package ArrayList;

import java.util.ArrayList;

public class ArrayPersonas {
	
	public Persona Consultar(int index) {
		return this.arrayPersona.get(index);
	}
	
	public String consultarNombre(int index) {
		return this.arrayPersona.get(index).getNombre();
	}
	public String consultarApellidos(int index) {
		return this.arrayPersona.get(index).getApellidos();
	}
	public Persona Consultar(Persona p) {
		int index = this.arrayPersona.indexOf(p);
		return this.arrayPersona.get(index);
	}
	public String consultarNombre(Persona p) {
		int index = this.arrayPersona.indexOf(p);
		return this.arrayPersona.get(index).getNombre();
	}
	public String consultarApellidos(Persona p) {
		int index = this.arrayPersona.indexOf(p);
		return this.arrayPersona.get(index).getApellidos();
	}
	public ArrayList<Persona> consultar(){
		return this.arrayPersona;
	}
	public ArrayList<String> consultarNombre(){
		ArrayList<String> nombres = new ArrayList<String>();
		for(int i=0; i<arrayPersona.size();i++) {
			nombres.add(this.arrayPersona.get(i).getNombre());
		}
		return nombres;
	}
	public ArrayList<String> consultarApellidos(){
		ArrayList<String> apellidos = new ArrayList<String>();
		for(int i=0; i<arrayPersona.size();i++) {
			apellidos.add(this.arrayPersona.get(i).getApellidos());
		}
		return apellidos;
	}
}
