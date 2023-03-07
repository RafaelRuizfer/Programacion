package Interfaces;
//Ejercicio 1 Relacion de Ejercicios Actividad-10

public interface IReproductorPortatil {
	public final String CD = "CD";
	public final String DVD = "DVD";
	public final String MemoriaFlash = "MemoriaFlash";
	public final String MiniDisk = "MiniDisk";
	public final String Ninguna = "Ninguna";
	public final String texto = "texto";
	public final String Monocromo = "Monocromo";
	public final String Color = "Color";
	public final String Pilas = "Pilas";
	public final String Li_lon = "Li-lon";
	
	public void setMarca(String Marca);
	public String getMarca();
	public void setModelo(String Modelo);
	public String getModelo();
	public void setReproduceSonido(boolean reproduceSonido);
	public boolean getReproduceSonido();
	public void setReproduceVideo(boolean reproduceVideo);
	public boolean getReproduceVideo();
	public void setTipoDeAlmacenamiento(String TipoDeAlmacenamiento);
	public String getTipoDeAlamacenamiento();
	public void setCapacidadDeAlmacenamiento(int CapacidadDeAlmacenamiento);
	public int getCapacidadDeAlmacenamiento();
	public void setPantalla(String Pantalla);
	public String getPantalla();
	public void setTipoBateria(String TipoBateria);
	public String getTipoBateria();
	public void setautonomia(int autonomia);
	public int getautonomia();
	public void setpeso(double peso);
	public double getpeso();
	public void setancho(double ancho);
	public double getancho();
	public void setalto(double alto);
	public double getalto();
	public void setgrosor(double grosor);
	public double getgrosor();
	public String toStringtoString();
	
	
}
