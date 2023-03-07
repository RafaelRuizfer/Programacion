package Examen;

public abstract class Animal {

	protected String Familia;
	protected String Especie;
	protected String Reino;
	
	
	public Animal(String familia, String especie, String reino) {
		Familia = familia;
		Especie = especie;
		Reino = reino;
	}
	
	
	public String getFamilia() {
		return this.Familia;
	}


	public void setFamilia(String familia) {
		Familia = familia;
	}


	public String getEspecie() {
		return this.Especie;
	}


	public void setEspecie(String especie) {
		Especie = especie;
	}


	public String getReino() {
		return this.Reino;
	}


	public void setReino(String reino) {
		Reino = reino;
	}


	public abstract String sonido();
	public abstract String comer();
	public abstract String reproduccion();
	
}
