package Ajedrez;

public class Caballo extends Ajedrez{

	public Caballo(String nombre, char color, int fila, int columna) {
		super(nombre, color, fila, columna);
	}

	@Override
	public boolean Mover(char letra, int num) {
		boolean resultado= false;
		if(comprobar(letra,num)==true) {
			if(letra==this.fila+1 || letra==this.fila-1) {
				if(num==this.columna+2 || num==this.columna-2) {
					resultado=true;
				}
			}else if(letra==this.fila+2 || letra==this.fila-2) {
				if(num==this.columna+1 || num==this.columna-1) {
					resultado=true;
				}
			}
		}
		return resultado;
	}
}
