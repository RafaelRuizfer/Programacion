package Interfaces;
//Ejercicio 2 Relacion de Ejercicios Actividad-10
import java.util.Scanner;

public class ReproductorDeAudio extends ReproductorPortatil implements IReproductorAudio{
	Scanner sc=new Scanner(System.in);
	private boolean reproduceMP3;
	private boolean reproduceAudioCDs;
	private boolean reproduceWMA;
	private boolean reproduceVorbis;
	private boolean accesoPorCarpetas;
	private boolean radio;
	private boolean grabacionDeVoz;
	
	public ReproductorDeAudio(String marca, String modelo, String tipoAlmacenamiento,boolean reproduceAudioCDs, boolean reproduceMP3,boolean reproduceWMA,boolean reproduceVorbis) {
		super(marca, modelo, tipoAlmacenamiento);
		this.reproduceAudioCDs=reproduceAudioCDs;
		this.reproduceMP3=reproduceMP3;
		this.reproduceVorbis=reproduceVorbis;
		this.reproduceWMA=reproduceWMA;
	}
	
	public boolean isReproduceMP3() {
		return reproduceMP3;
	}

	public void setReproduceMP3(boolean reproduceMP3) {
		this.reproduceMP3 = reproduceMP3;
	}

	public boolean isReproduceAudioCDs() {
		return reproduceAudioCDs;
	}

	public void setReproduceAudioCDs(boolean reproduceAudioCDs) {
		this.reproduceAudioCDs = reproduceAudioCDs;
	}

	public boolean isReproduceWMA() {
		return reproduceWMA;
	}

	public void setReproduceWMA(boolean reproduceWMA) {
		this.reproduceWMA = reproduceWMA;
	}

	public boolean isReproduceVorbis() {
		return reproduceVorbis;
	}

	public void setReproduceVorbis(boolean reproduceVorbis) {
		this.reproduceVorbis = reproduceVorbis;
	}

	public boolean isAccesoPorCarpetas() {
		return accesoPorCarpetas;
	}

	public void setAccesoPorCarpetas(boolean accesoPorCarpetas) {
		this.accesoPorCarpetas = accesoPorCarpetas;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public boolean isGrabacionDeVoz() {
		return grabacionDeVoz;
	}

	public void setGrabacionDeVoz(boolean grabacionDeVoz) {
		this.grabacionDeVoz = grabacionDeVoz;
	}

	@Override
	public void setreproduceMP3(boolean reproduceMP3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getreproduceMP3() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceWMA(boolean reproduceWMA) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getreproduceWMA() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceVorbis(boolean reproduceVorbis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getreproduceVorbis() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setreproduceAudioCDs(boolean reproduceAudioCDs) throws Exception {

		if(this.getTipoDeAlamacenamiento().equals(CD)) {
			this.reproduceAudioCDs = reproduceAudioCDs;
		}else {
			throw new Exception("Ese no es");
		}
		
	}

	@Override
	public boolean getreproduceAudioCDs() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setaccesoPorCarpetas(boolean accesoPorCarpetas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getaccesoPorCarpetas() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setradio(boolean radio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getradio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setgrabacionDeVoz(boolean grabacionDeVoz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getgrabacionDeVoz() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toStringtoString() {
		return "Reproductor portatil de la marca"+this.getMarca()+",modelo"+this.getModelo()+
				"que tiene un almacenamiento interno en forma de"+this.getTipoDeAlamacenamiento()+
				"cuya capacidad es de"+this.getCapacidadDeAlmacenamiento()+"cuenta con una pantalla de tipo"
				+this.getPantalla()+".Ademas cuenta con una bateria en forma de"+this.getTipoBateria()+
				"con una autonomia de"+this.getautonomia()+". Su peso es de"+this.getpeso()+"un acho de"+
				this.getancho()+"un alto de "+this.getalto()+"y con un grosor de "+this.getgrosor()+".";
	}
}
