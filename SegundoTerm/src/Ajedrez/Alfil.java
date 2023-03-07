package Ajedrez;

public class Alfil extends Ajedrez{

	public Alfil(String nombre, char color, int fila, int columna) {
		super(nombre, color, fila, columna);
	}
	
	
	@Override
	public boolean Mover(char letra, int num) {
		boolean resultado= false;
		int y=0;
		if(comprobar(letra,num)==true) {
			for(int x=0;letra>this.fila;x++) {
				if(letra==this.fila+1) {
					y=x;
					break;
				}
				this.fila+=1;
			}
			for(int x=0;letra<this.fila;x++) {
				if(letra==this.fila-1) {
					y=x;
					break;
				}
				this.fila-=1;
			}
			if(num==columna+y || num==columna-y) {
				resultado=true;
			}
		}
		return resultado;
	}
}
