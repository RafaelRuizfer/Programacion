package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Palindromo {

		private ArrayList<Character>palindromo;
		
		public Palindromo() {
			this.palindromo=new ArrayList<Character>();
		}

		public ArrayList<Character> getPalindromo() {
			return palindromo;
		}

		public void setPalindromo(ArrayList<Character> palindromo) {
			this.palindromo = palindromo;
		}
		public void añadirLetra(char letra) {
			this.palindromo.add(letra);
		}
		public boolean ispalindromo() {
			ArrayList<Character> aux = new ArrayList<Character>();
			aux.addAll(this.palindromo);
			Collections.reverse(aux);
			return aux.equals(this.palindromo);
		}
		@Override
		public String toString() {
			String resultado="";
			for(int i=0;i<this.palindromo.size();i++) {
				resultado+=this.palindromo.get(i);
			}
			return resultado;
		}
		
}
