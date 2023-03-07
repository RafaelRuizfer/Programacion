package ExamenMapasArrayList;

public class Test {

	public static void main(String[] args) {
		
		CantanteFamoso c1 = new CantanteFamoso("Annuel", 12, "Regueton");
		CantanteFamoso c2 = new CantanteFamoso("Pitbull", 5, "ElectroLatino");
		
		ListaCantantesFamosos c=new ListaCantantesFamosos();
		
//		//Añadir Cantantes
		c.añadirCantante(c1);
		c.añadirCantante(c2);
//		//Imprimir todos los cantantes
		System.out.println(c);
		//Borrar cantante
		c.borrarCantante(c2);
		System.out.println(c);
		//Mostrar las mayores ventas
		System.out.println(c.masVentas());
		c.genero();
		System.out.println(c);
	}
}
