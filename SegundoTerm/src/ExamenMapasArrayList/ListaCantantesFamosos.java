package ExamenMapasArrayList;

import java.util.ArrayList;

public class ListaCantantesFamosos {

	private ArrayList<CantanteFamoso> cantante;
	
	public ListaCantantesFamosos() {
		this.cantante=new ArrayList<CantanteFamoso>();
	}

	public ArrayList<CantanteFamoso> getCantante() {
		return cantante;
	}

	public void setCantante(ArrayList<CantanteFamoso> cantante) {
		this.cantante = cantante;
	}
	
	public void añadirCantante(CantanteFamoso c) {
		cantante.add(c);
	}
	
	public void borrarCantante(CantanteFamoso p) {
		cantante.remove(p);
	}
	
	public CantanteFamoso masVentas() {
		CantanteFamoso ventas = cantante.get(0);
			for(CantanteFamoso a: cantante) {
				if(a.getVentas() > ventas.getVentas()) {
					ventas=a;
				}
			}
		return ventas;
		
	}
	
	public CantanteFamoso genero() {
		CantanteFamoso genero = cantante.get(0);
		for(CantanteFamoso b: cantante) {
			if(b.getGenerom().equals(genero)) {
				genero=b;
			}
		}
		return genero;
	}

	public boolean genero(String genero) {
		return this.cantante.contains(genero);
	}
	@Override
	public String toString() {
		return "Lista de los cantantes" + cantante;
	}
	
	
}
