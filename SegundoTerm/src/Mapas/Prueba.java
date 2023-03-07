package Mapas;

import java.util.ArrayList;
import java.util.HashMap;

public class Prueba {

		public static void main(String[] args) {
			
			HashMap<Integer,String> mapa1 = new HashMap<Integer,String>();
			HashMap<Integer,String> mapa2 = new HashMap<Integer,String>();

			
			//Introducir elementos en el mapa
			mapa1.put(1, "Enrique");
			mapa1.put(2, "Alex");
			mapa1.put(3, "Dani");
			mapa1.put(4, "Adrian");
			
			
			//Mostrar todos los elementos del mapa
//			for(Map.Entry i:mapa1.entrySet()) {
//				System.out.println(i.getKey());
//				System.out.println(i.getValue());
//			}
//			
//			System.out.println(mapa1.size());//Tamaño del mapa
//			mapa2.putAll(mapa1);
//			System.out.println(mapa1.isEmpty());//Ver si esta vacio
//			mapa1.clear();
//			System.out.println(mapa1.isEmpty());
			System.out.println(mapa1.get(2));//Mostrar un valor de la posicion indicada
			System.out.println(mapa1.containsKey(9));
			ArrayList<String> arra=new ArrayList<String>();
			arra.addAll(mapa1.values());
			mapa1.remove(1);//Borrar un elemento del mapa
			System.out.println(mapa1.get(1));
			System.out.println(mapa1.values());//Devuelve una coleccion con todos los valores del mapa
		}
}
