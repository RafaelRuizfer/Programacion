package Interfaces;
//Ejercicio 2 Relacion de Ejercicios Actividad-10
public class ReproductorPortatil implements IReproductorPortatil{
	
	private String marca;
	private String modelo;
	private boolean reproduceSonido;
	private boolean reproduceVideo;
	private String tipoDeAlmacenamiento;
	private int capacidadAlamacenamiento;
	private String pantalla;
	private String tipoDeBateria;
	private int autonomia;
	private double peso;
	private double ancho;
	private double alto;
	private double grosor;
	
	public ReproductorPortatil(){
		this.marca="";
		this.modelo="";
		this.reproduceSonido=true;
		this.reproduceVideo=true;
		this.tipoDeAlmacenamiento="";
		this.capacidadAlamacenamiento=0;
		this.pantalla="";
		this.tipoDeBateria="";
		this.autonomia=0;
		this.peso=0;
		this.ancho=0;
		this.alto=0;
		this.grosor=0;
	}
	
	public ReproductorPortatil(String marca, String modelo, String tipoDeAlmacenamiento) {
		this.marca=marca;
		this.modelo=modelo;
		this.tipoDeAlmacenamiento=tipoDeAlmacenamiento;
	}

	@Override
	public void setMarca(String Marca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public void setModelo(String Modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return this.modelo;
	}

	@Override
	public void setReproduceSonido(boolean reproduceSonido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getReproduceSonido() {
		// TODO Auto-generated method stub
		return reproduceSonido;
	}

	@Override
	public void setReproduceVideo(boolean reproduceVideo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getReproduceVideo() {
		// TODO Auto-generated method stub
		return reproduceVideo;
	}

	@Override
	public void setTipoDeAlmacenamiento(String TipoDeAlmacenamiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipoDeAlamacenamiento() {
		// TODO Auto-generated method stub
		return this.tipoDeAlmacenamiento;
	}

	@Override
	public void setCapacidadDeAlmacenamiento(int CapacidadDeAlmacenamiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCapacidadDeAlmacenamiento() {
		// TODO Auto-generated method stub
		return this.capacidadAlamacenamiento;
	}

	@Override
	public void setPantalla(String Pantalla) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPantalla() {
		// TODO Auto-generated method stub
		return this.pantalla;
	}

	@Override
	public void setTipoBateria(String TipoBateria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTipoBateria() {
		// TODO Auto-generated method stub
		return this.tipoDeBateria;
	}

	@Override
	public void setautonomia(int autonomia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getautonomia() {
		// TODO Auto-generated method stub
		return this.autonomia;
	}

	@Override
	public void setpeso(double peso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getpeso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	@Override
	public void setancho(double ancho) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getancho() {
		// TODO Auto-generated method stub
		return this.ancho;
	}

	@Override
	public void setalto(double alto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getalto() {
		// TODO Auto-generated method stub
		return this.alto;
	}

	@Override
	public void setgrosor(double grosor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getgrosor() {
		// TODO Auto-generated method stub
		return this.grosor;
	}

	@Override
	public String toStringtoString() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
