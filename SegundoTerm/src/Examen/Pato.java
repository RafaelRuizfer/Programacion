package Examen;

public class Pato extends Animal{

	public Pato(String familia, String especie, String reino) {
		super(familia, especie, reino);

	}

	public String sonido() {
		return "El pato hace Cuak";
	}

	public String comer() {
		return "El pato come algas submarinas";
	}

	public String reproduccion() {
		return "Los meses de menos calor se reproducen";
	}

}
