package Examen;

public class Vector implements iOperable{

	//Declaracion de Atributos
	private int[] arrayEnteros;
	private int capacidadVector;
	
	//Constructor con parametros
	public Vector(int capacidadVector) {
		super();
		this.arrayEnteros = new int [capacidadVector];
	}

	//Getters y Setters
	public int[] getArrayEnteros() {
		return this.arrayEnteros;
	}

	public void setArrayEnteros(int[] arrayEnteros) {
		this.arrayEnteros = arrayEnteros;
	}

	public int getCapacidadVector() {
		return this.capacidadVector;
	}

	public void setCapacidadVector(int capacidadVector) {
		this.capacidadVector = capacidadVector;
	}
	
	//Metodos Operadores
	public void Sumar(int numentero) {
		for(int i=capacidadVector;i>=0;i--) {
			this.arrayEnteros[i]+=numentero;
		}
	}
	public void Restar(int numentero) {
		for(int i=capacidadVector;i>=0;i--) {
			this.arrayEnteros[i]-=numentero;
		}
	}
	public void Multiplicar(int numentero) {
		for(int i=capacidadVector;i>=0;i--) {
			this.arrayEnteros[i]*=numentero;
		}
	}
	public void Dividir(int numentero) {
		for(int i=capacidadVector;i>=0;i--) {
			this.arrayEnteros[i]/=numentero;
		}
	}

}
