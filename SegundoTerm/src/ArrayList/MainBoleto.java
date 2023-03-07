package ArrayList;

import java.util.Scanner;

public class MainBoleto {

	public static void main(String[] args) {

		Boleto ganador = new Boleto();
		Boleto miBoleto = new Boleto();
		Scanner sc = new Scanner(System.in);
		ganador.añadirNumero(3);
		ganador.añadirNumero(5);
		ganador.añadirNumero(1);
		ganador.añadirNumero(2);
		ganador.añadirNumero(3);
		ganador.añadirNumero(9);

		for(int i =0;i<6;i++) {
			System.out.println("Introduce el numero" + i+1 + "");
			miBoleto.añadirNumero(sc.nextInt());
		}
		System.out.println(ganador);
		System.out.println(miBoleto);
		System.out.println(comprar());
	}

}
