package Examen;

public class Perro extends Animal{

	public Perro(String familia, String especie, String reino) {
		super(familia, especie, reino);

	}

	public String sonido() {
		return "Los perros hacen hacen Guau Guau";
	}

	public String comer() {
		return "Los perros comen bolillas de pienso";
	}

	public String reproduccion() {
		return "Se reproducen cuando quieren";
	}

}
