package ArrayList;

import java.util.ArrayList;

public class Boleto {
		//Declaramos los atributos 
		private ArrayList<Integer> boleto;
		//Constructor de la clase
		public Boleto() {
			this.boleto=new ArrayList<Integer>();
		}
		//Getters y Setters
		public ArrayList<Integer> getBoleto() {
			return boleto;
		}
		public void setBoleto(ArrayList<Integer> boleto) {
			this.boleto = boleto;
		}
		public void añadirNumero(int num) {
			this.boleto.add(num);
		}
		public int comparar(Boleto b1) {
			int cont=0;
			for(int i=0;i<this.boleto.size();i++) {
				if(this.boleto.get(i).equals(b1.getBoleto().get(i))){
					cont++;
				}
			}
			return cont;
		}
		@Override
		public String toString() {
			return this.boleto.toString();
		}
}
