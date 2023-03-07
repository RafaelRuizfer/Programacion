package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayColores {
	
	private ArrayList<String> arrayColores = new ArrayList<String>();
	private Scanner sc = new Scanner(System.in);
	public ArrayColores(int ncolores) {
		for(int i=0;i<ncolores;i++) {
			this.arrayColores.add(sc.nextLine());
		}	
	}
	
	public ArrayList<String> getArrayColores(){
		return this.arrayColores;
	}
	
	public void setArrayColores(ArrayList<String>arrayColores){
		this.arrayColores=arrayColores;
	}
	
	public void addColor(String color) {
		this.arrayColores.add(color);//añadir un elemento color en el arraylist
	}
	
	public String removeColor(int pos) {
		return this.arrayColores.remove(pos);//eliminar por posicion indicada
	}
	
	public void addColorMitad(String color) {
		int pos=this.arrayColores.size()/2;
		this.arrayColores.add(pos,color);//añade color en la posicion resultante
	}
	
	public void addColorPrincipio(String color) {
		this.arrayColores.add(0,color);//añadir color en la posicion 0
	}
	
	public void sustituir(String color, int pos) {
		this.arrayColores.set(pos, color);//sustituye color en la posicion indicada
	}
	
	public boolean buscar(String color) {
		return this.arrayColores.contains(color);
	}
	
	public void barajar() {
		Collections.shuffle(this.arrayColores);//Desordenar el array
	}
	
	public void invertir() {
		Collections.reverse(this.arrayColores);//Invertir el array
	}
	
	public void intercambiar(int pos1, int pos2) {
		Collections.swap(this.arrayColores, pos1, pos2);//Intercambiar posiciones
	}
	
	public void sustituir(String colorin, String colorcambio) {
		int pos= this.arrayColores.indexOf(colorin);
		this.sustituir(colorcambio, pos);
	}
	@Override
	public String toString() {
		String respuesta="(";
		
		for(int j=0;j<this.arrayColores.size();j++){
			respuesta+=this.arrayColores.get(j);//pasar por todas las posiciones del array
			if(j!=this.arrayColores.size()-1){
				respuesta+=",";//añadir comas 
			}
		}
		respuesta+=")";
		return respuesta;
	}
}
