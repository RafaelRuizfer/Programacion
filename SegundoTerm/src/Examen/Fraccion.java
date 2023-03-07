package Examen;

public class Fraccion implements iOperable{
	//Declaracion de atributos
	private int numerador;
	private int denominador;
	
	
	//COnstructor con parametros
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//Getters Y Setters
	public int getNum1() {
		return this.numerador;
	}

	public void setnumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getdenominador() {
		return this.denominador;
	}

	public void setNum2(int denominador) {
		this.denominador = denominador;
	}

	//Metodos de Operacion
	public void Sumar(int numentero) {
		this.denominador=this.denominador*1;
		int nuevonum1 = this.numerador*1;
		int nuevonum2= this.denominador*numentero;
		this.numerador=nuevonum1+nuevonum2;
	}
	public void Restar(int numentero) {
		this.denominador= this.denominador * 1;
		int nuevonum1 = this.numerador*1;
		int nuevonum2= this.denominador*numentero;
		this.numerador=nuevonum1-nuevonum2;
		
	}
	public void Multiplicar(int numentero) {
		this.denominador=this.denominador*1;
		this.numerador=this.numerador*numentero;
	}
	public void Dividir(int numentero) {
		this.denominador=this.denominador*1;
		this.numerador=this.numerador*numentero;
	}
	
}
