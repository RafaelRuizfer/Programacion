package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayExperimento {

	private ArrayList<Integer> elementos = new ArrayList<Integer>();
	private Scanner sc = new Scanner(System.in);
	
	public ArrayExperimento() {
		for(int i=0;i<5;i++) {
			this.elementos.add(sc.nextInt());
		}
	}
	
	public ArrayList<Integer> getElementos(){
		return elementos;

	}
	
	public void setElementos(ArrayList<Integer>elementos){
		this.elementos=elementos;
	}
	
	public ArrayList
	
	
}
