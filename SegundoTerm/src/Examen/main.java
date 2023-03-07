package Examen;

public class main {

	public static void main(String[] args) {
		Fraccion fra = new Fraccion(1, 3);
		
		fra.Dividir(2);
		System.out.println(fra.getNum1());
		System.out.println(fra.getdenominador());

	}

}
