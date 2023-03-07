package ExamenMapasArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioArtistas {

	private HashMap<String,ArrayList<String>> artistas;
	
	public RepositorioArtistas() {
		this.artistas = new HashMap<String, ArrayList<String>>();
	}

	public HashMap<String, ArrayList<String>> getArtistas() {
		return artistas;
	}

	public void setArtistas(HashMap<String, ArrayList<String>> artistas) {
		this.artistas = artistas;
	}
	
	public void añadirCantante(String cantante, ArrayList<String> cancion) {
		artistas.put(cantante, cancion);
	}
	
	public void añadirCancion(String cantante, String cancion) {
		ArrayList<String> canciones=artistas.get(cantante);
		canciones.add(cancion);
		artistas.put(cantante, canciones);
	}
	
	public ArrayList<String> consultarCancion(String cantante) {
		return artistas.get(cantante);
	}
}
