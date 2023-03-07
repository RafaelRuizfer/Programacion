package Mapas;

public class MainLibro {

	public static void main(String[] args) {

			Libro librito = new Libro();
			librito.añadir(2,"Hola Pagina2");
			librito.añadir(3,"Hola Pagina3");
			librito.añadir(4,"Hola Pagina4");
			librito.añadir(5,"Hola Pagina5");
			librito.añadir(1,"Hola Pagina1");
			System.out.println(librito);
			librito.añadir(4, "Adios Pagina4");
			System.out.println(librito);
	}

}
