package Examen;

public class Medusa extends Animal{
	
	public Medusa(String familia, String especie, String reino) {
		super(familia, especie, reino);

	}

	public String sonido() {
		return "Ni idea del sonido de las medusas";
	}

	public String comer() {
		return "Tampoco se de que se alimentan estos seres";
	}

	public String reproduccion() {
		return "Y si no se lo anterior los periodos de reproduccion menos todavia";
	}

}
