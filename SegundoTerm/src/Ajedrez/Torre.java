package Ajedrez;

public class Torre extends Ajedrez{
	
	public Torre(String nombre, char color, int fila, int columna) {
		super(nombre, color, fila, columna);
	}

	@Override
	public boolean Mover(char letra, int num) {
		boolean resultado= false;
		if(comprobar(letra,num)==true) {
		if(this.fila==letra) {
			if(num>0 && num<9) {
				resultado=true;
			}else {
				resultado=false;
			}
		}else if (this.fila!=letra) {
			if(this.columna!=num) {
				resultado=false;
			}else {
				resultado=true;
			}
		}
	}
		return resultado;
	}
}
