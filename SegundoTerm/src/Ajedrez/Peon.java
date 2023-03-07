package Ajedrez;

public class Peon extends Ajedrez{
	
	public Peon(String nombre, char color, int fila, int columna) {
		super(nombre, color, fila, columna);
	}
	@Override
	public boolean Mover(char letra, int num) {
		boolean resultado= false;
		if(comprobar(letra,num)==true) {
			if(color=='b') {
				if(this.columna==num+1 || this.columna==num+2) {
					resultado=true;
				}else {
					resultado=false;
				}
			}
		}
		return resultado;
	}
}
