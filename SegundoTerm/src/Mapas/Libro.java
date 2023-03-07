package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Libro {

		private HashMap<Integer,String> libro;
		
		public Libro() {
			this.libro=new HashMap<Integer,String>();
		}

		public HashMap<Integer, String> getLibro() {
			return this.libro;
		}

		public void setLibro(HashMap<Integer, String> libro) {
			this.libro = libro;
		}
		
		public String añadir(int pos, String contenido) {
			String resultado="";
			if(this.libro.containsKey(pos)) {
				this.reemplazar(pos, contenido);
				resultado="Pagina reeplazada";
			}else {
				this.libro.put(pos, contenido);
				resultado="Pagina Insertada";
			}
			return resultado;
		}
		
		public void eliminar(int pos) {
			this.libro.remove(pos);
		}
		
		public void reemplazar(int pos, String contenido) {
			this.eliminar(pos);
			this.añadir(pos, contenido);
		}
		
		public String getContenido(int pos) {
			return this.libro.get(pos);
		}

		@Override
		public String toString() {
			String resultado ="";
			for(Map.Entry pagina:libro.entrySet()) {
				resultado+= pagina.getKey() + "-->" + pagina.getValue() + "\n";
		}
			return resultado;
		}
		
}
