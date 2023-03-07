package Ajedrez;

public abstract class Ajedrez {
	
	protected String nombre;
	protected char color;
	protected int fila;
	protected int columna;
	
	protected Ajedrez(String nombre, char color, int fila, int columna) {
		this.nombre = nombre;
		this.color = color;
		this.fila = fila;
		this.columna = columna;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color =color;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public boolean Mover(char letra, int num) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean comprobar(char letra, int num) {
		boolean resultado=false;
		if(num>0 || num<9) {
			resultado=true;
		}else {
			resultado=false;
		}
		
		if(letra>='a' || letra<='h') {
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
		
	}
}
