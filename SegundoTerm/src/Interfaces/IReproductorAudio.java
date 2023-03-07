package Interfaces;
//Ejercicio 2 Relacion de Ejercicios Actividad-10
public interface IReproductorAudio extends IReproductorPortatil{
	public void setreproduceMP3(boolean reproduceMP3);
	public boolean getreproduceMP3();
	public void setreproduceWMA(boolean reproduceWMA);
	public boolean getreproduceWMA();
	public void setreproduceVorbis(boolean reproduceVorbis);
	public boolean getreproduceVorbis();
	public void setreproduceAudioCDs(boolean reproduceAudioCDs) throws Exception;
	public boolean getreproduceAudioCDs();
	public void setaccesoPorCarpetas(boolean accesoPorCarpetas);
	public boolean getaccesoPorCarpetas();
	public void setradio(boolean radio);
	public boolean getradio();
	public void setgrabacionDeVoz(boolean grabacionDeVoz);
	public boolean getgrabacionDeVoz();

}
