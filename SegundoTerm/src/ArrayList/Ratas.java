package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ratas {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		ArrayList<Double> arrayRatas = new ArrayList<Double>();
		for(int i = 0;i<=2;i++) {
			System.out.println("Introduce peso rata:");
			arrayRatas.add(sc.nextDouble());
		}
		arrayRatas.sort(null);
		ArrayList<Double> orden = new ArrayList<Double>();
		orden.addAll(arrayRatas);
		System.out.println(arrayRatas);
		for(int i=0;i<orden.size();i++) {
				
		}
	}
}