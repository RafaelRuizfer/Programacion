package Simulacro;


public interface ILista {// declaramos la interfaz.
	//Setters y Getters de un Array cualquiera.
	public int[] getArrayEnteros();
	public void setArrayEnteros(int[] arrayEnteros);
	//Setters y Getters de la Capacidad Maxima de un Array.
	public int getCapacidadMaxima();
	public void setCapacidadMaxima(int capacidadMaxima);
	//Declaramos los metodos booleanos full y empty los cuales se encargan de comprobar los ultimos valores de nuestro Array.
	public boolean isFull();
	public boolean isEmpty();
	//Declaramos los metodos push y pop.
	public void push(int elemento);//Elimina un valor de nuestro Array y lo convierte a otro digito.
	public int pop();//Elimina el ultimo valor de nuestro Array y lo convierte a cero.
	
}