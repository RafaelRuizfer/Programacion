package Pokemon;

import java.util.ArrayList;

public class Ruta {

	private int id;
	private String nombre;
	private ArrayList<Pokemon> pokemons;
	
	public Ruta(int id,Pokemon p1,Pokemon p2,Pokemon p3, String Nombre,Pokemon ... pN) {
		this.id=id;
		this.nombre=Nombre;
		this.pokemons = new ArrayList<Pokemon>();
		agregarPokimones(p1);
		agregarPokimones(p2);
		agregarPokimones(p3);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	public void agregarPokimones(Pokemon pokimon) {
		this.pokemons.add(pokimon);
	}
	
	public String toString() {
		return "Estas en la ruta" + this.nombre + "el numero de la ruta es: " + this.id + " y los pokemons de ruta son: " + this.pokemons;
	}
}
