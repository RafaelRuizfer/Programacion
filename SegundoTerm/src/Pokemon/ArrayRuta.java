package Pokemon;

import java.util.ArrayList;

public class ArrayRuta {

	private ArrayList<Ruta> rutitas;
	
	public ArrayRuta() {
		this.rutitas = new ArrayList<Ruta>();
	}

	public ArrayList<Ruta> getRutitas() {
		return rutitas;
	}

	public void setRutitas(ArrayList<Ruta> rutitas) {
		this.rutitas = rutitas;
	}
	public void añadirRuta(Ruta rutita) {
		this.rutitas.add(rutita);
	}
}
