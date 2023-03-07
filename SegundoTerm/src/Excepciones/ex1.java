package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce edad: ");
		boolean seguir =true;
		int edad=0;
		do {
			try {
				edad= sc.nextInt();
				seguir=false;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Intentalo de nuevo");
				sc.next();//limpiar codigo
			}catch(InputMismatchException e) {
				System.out.println("Intentalo de nuevo");
				sc.next();//limpiar codigo
			}catch(Exception e) {
				e.printStackTrace();//muestra el error
				System.out.println("Intentalo de nuevo");
				sc.next();//limpiar codigo
			}
		}
		
		while(seguir);
		System.out.println("Tu edad es :"+ edad);
		
	}
}
