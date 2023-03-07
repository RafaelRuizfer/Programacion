package Simulacro;

public class Cola implements ILista{//Declaramos la clase Cola e implementamos la interfaz ILista.
	

		private int[] arrayEnteros;//Declaramos un atributo privado entero como un array sin dimensiones.
		private int capacidadMaxima;//Declaramos un atributo el cual sera la capacidad maxima que contenga nuestro Array.
		
		
		public Cola(int capacidadMaxima) {//Constructor de la clase Cola en el cual implementamos por parametro la capacidad maxima de nuestro Array.
			super();
			this.arrayEnteros = new int[capacidadMaxima];//Igualamos el atributo Array a la capacidad maxima que el usuario nos indique por parametro.
			
		}
		
		public int[] getArrayEnteros() {//Gett de nuestro Array y devolvemos nuestro atributo con la capacidad previamente asignada.
			return this.arrayEnteros;
		}

		public void setArrayEnteros(int[] arrayEnteros) {//Sett de nuestro Array con el cual podemos cambiar el nuestro por otro.
			this.arrayEnteros=arrayEnteros;
			
		}

		public int getCapacidadMaxima() {//Gett de la capacidad maxima del Array, el cual nos devuelve la capacidad asignada previamente.
			return this.capacidadMaxima;
		}

		public void setCapacidadMaxima(int capacidadMaxima) {//Sett de la capacidad maxima del Array, con el cual podemos cambiar el valor de este.
			this.capacidadMaxima=capacidadMaxima;
			
		}
		//Un digito esta ocupado cuando sea distindo de 0, en caso contrario es que esta vacio.
		public boolean isFull() {//Metodo con el cual comprobaremos si el Array esta completo o le falta algun valor.
			boolean resultado=false;//Declaramos una variable con la cual indicaremos el resultado de nuestro if.
			if(this.arrayEnteros[this.capacidadMaxima-1]!=0) {//Preguntamos a la capacidad del Array si su ultima posicion esta ocupada o no.
				resultado=true;//True en caso de que este ocupado el ultimo valor.
			}
			return resultado;//Devuelve el resultado de la pregunta anterior.
		}
		
		public boolean isEmpty() {//Metodo con el cual verificamos que el ultimo digito introducido este ocupado o no.
			boolean resultado=false;//Declaramos una variable con la cual indicaremos el resultado de nuestro if.
			if(this.arrayEnteros[0]==0) {//Preguntamos si el ultimo valor de la cola es 0 o distinto de 0.
				resultado=true;//True en caso de que sea 0.
			}
			return resultado;//Devuelve el resultado de la pregunta anterior.
		}

		public void push(int elemento) {
			int posicion=0;
			if(!this.isFull()) {
				for(int i=0;i<this.capacidadMaxima;i++) {
					if(this.arrayEnteros[i]==0) {
						posicion=i;
						break;
					}
				}
				this.arrayEnteros[posicion]=elemento;
			}
			
		}
		

		public int pop() {
			int devolver=-1;
			if(!this.isEmpty()) {
				devolver=this.arrayEnteros[0];
				int aux=this.arrayEnteros[this.capacidadMaxima-1];
				this.arrayEnteros[this.capacidadMaxima-1]=0;
				for(int i=this.capacidadMaxima-2;i>0;i--) {
					this.arrayEnteros[i]=aux;
					aux=this.arrayEnteros[i-1];
				}
				this.arrayEnteros[0]=aux;
			}
			return devolver;
		}
}