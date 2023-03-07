package Pokemon;

import java.util.HashMap;

public class Pokedex {

	private HashMap<String,Pokemon> pokedex;
	private final Pokemon bulbasaur = new Pokemon ("Bulbasaur",1,"Es un Bulbasaur","Planta");
	private final Pokemon charmander = new Pokemon("Charmander", 2, "Es un charmander", "Fuego");
	private final Pokemon squirtle = new Pokemon  ("Squirtle", 3, "Es un Squirtle", "Agua");
	
	public Pokedex() {
		this.pokedex = new HashMap<String,Pokemon>();
		añadirPokeHard();
	}

	public HashMap<String, Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(HashMap<String, Pokemon> pokedex) {
		this.pokedex = pokedex;
	}

	public void añadirPokePokedex(Pokemon p) {
		this.pokedex.put(p.getNombre(),p);
	}
	
	private void añadirPokeHard() {
		pokedex.put(bulbasaur.getNombre(), bulbasaur);
		pokedex.put(charmander.getNombre(), charmander);
		pokedex.put(squirtle.getNombre(), squirtle);
	}
	@Override
	public String toString() {
		return "Pokedex:" + this.pokedex.toString();
	}
}
