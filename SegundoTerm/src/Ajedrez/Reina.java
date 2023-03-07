package Ajedrez;

public class Reina extends Ajedrez{
	
	public Reina(String nombre, char color, int fila, int columna) {
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
			if(this.fila==letra) {
				if(num>0 && num<9) {
					resultado=true;
				
				}
			}else if (this.fila!=letra) {
				if(this.columna!=num) {
					resultado=false;
				}
			}
		}
		return resultado;
	}
}
