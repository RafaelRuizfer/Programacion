package ArrayList;

public class MainColores {
	public static void main(String[] args) {
		
		ArrayColores ArrayEj1 = new ArrayColores(4);//creamos un objeto array que contendra los colores
		
		System.out.println(ArrayEj1);
		ArrayEj1.addColorMitad("Violeta");
		ArrayEj1.barajar();//barajar el array
		ArrayEj1.intercambiar(0, 1);//invertir el array
		System.out.println(ArrayEj1);
		System.out.println(ArrayEj1.removeColor(1));//elimina el elemento pero te devuelve el elemneto por pantalla
		System.out.println(ArrayEj1.buscar("Rojo"));
		System.out.println(ArrayEj1);
	}

}
