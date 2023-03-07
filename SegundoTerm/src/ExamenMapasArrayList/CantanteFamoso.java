package ExamenMapasArrayList;

public class CantanteFamoso {

		private String nombre;
		private int ventas;
		private String generom;
		
		public CantanteFamoso(String nombre, int ventas, String generom) {
			this.nombre=nombre;
			this.ventas=ventas;
			this.generom=generom;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getVentas() {
			return ventas;
		}

		public void setVentas(int ventas) {
			this.ventas = ventas;
		}

		public String getGenerom() {
			return generom;
		}

		public void setGenerom(String generom) {
			this.generom = generom;
		}

		@Override
		public String toString() {
			return "El nombre del cantante es: " + nombre + " , tiene " + ventas + " ventas y su genero musical es: " + generom;
		}
		
		
}
