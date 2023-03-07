package ArrayList;

import java.util.ArrayList;

public class ArrayRata {

		private ArrayList<Integer> ratas;
		public ArrayRata() {
			this.ratas=new ArrayList<Integer>();
		}
		
		public ArrayList<Integer> getRatas() {
			return ratas;
		}
		public void setRatas(ArrayList<Integer> ratas) {
			this.ratas = ratas;
		}
		public void añadir(int peso) {
			this.ratas.add(peso);
		}
		public String toString() {
			return this.ratas.toString();
		}
		public void ordenar() {
			this.ratas.sort(null);
		}
		public ArrayList<Integer> pesos(){
			ArrayList<Integer> pesos = new ArrayList<Integer>();
			for(int i=0;i<this.ratas.size();i++) {
				if(!pesos.contains(this.ratas.get(i))){
					pesos.add(this.ratas.get(i));
				}
			}
			return pesos;
		}
		public int repeticiones(int peso) {
			int cont=0;
			for(int i=0;i<this.ratas.size();i++) {
				if(this.ratas.get(i).equals(peso)) {
					cont++;
				}
			}
			return cont;
		}
		public ArrayList<Integer> repeticiones(){
			ArrayList<Integer> resultado= new ArrayList<Integer>();
			ArrayList<Integer> pesos = this.pesos();
			for(int i=0;i<pesos.size();i++) {
				resultado.add(this.repeticiones(pesos.get(i)));
			}
			return resultado;
		}
}
