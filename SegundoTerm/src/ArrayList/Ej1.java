package ArrayList;

import java.util.ArrayList;

public class Ej1 {

		public static void main(String[] args) {
			//No permiten datos enteros,double,boolean
			ArrayList<String> arrayString = new ArrayList<String>();
			ArrayList<Boolean> arrayString1 = new ArrayList<Boolean>();
			ArrayList<Double> arrayString2 = new ArrayList<Double>();
			ArrayList<Integer> arrayString3 = new ArrayList<Integer>();
			
			arrayString.add("Holi");//Posicion1
			arrayString.add("Adios");//Posicion2
			arrayString.add("UwU");//Posicion3
			System.out.println(arrayString);//Mostrar por pantalla
			System.out.println(arrayString.get(1));//Mostrar una posicion del array
			arrayString.set(2, "Pataton");//Cambiar elemento de una posicion del array por otro nuevo
			arrayString.remove(0);//Borrar un elemento del array
			arrayString.remove(arrayString3);//Borrar el elemento seleccionado sin saber su posicion
			arrayString.removeIf(i->(i.equals("Adios")));//Borra el elemento Adios
			arrayString.removeIf(i->(i.charAt(0)=='V'));//Borra los elementos que comiencen por v
			arrayString.removeIf(i->(i.charAt(0)=='V' && i.charAt(1)=='a'));//Borra los elementos que comiencen por v y su segunda letra sea a
			arrayString.sort(null);//Ordenar el array de mayor a menor
			
			
			
		}
}
