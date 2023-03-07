package ED1702;

import java.util.HashMap;

public class año {
	private HashMap<String,mes> año;
	
	public año() {
		this.año=new HashMap<String,mes>();
	}

	public HashMap<String, mes> getAño() {
		return año;
	}

	public void setAño(HashMap<String, mes> año) {
		this.año = año;
	}
	
	public void añadirMes(String clave,mes valor) {
		this.año.put(clave,valor);
	}
	
	public mes consultaMes(String mes) {
		return this.año.get(mes);
	}
	public Tiempo consultaDia(String mes,int dia) {
		return this.año.get(mes).getTiempo(dia);
	}
	
	public double getPrecipitaciones(String mes,int dia) {
		return this.año.get(mes).getPrecipitaciones(dia);
	}
	public double getTemperatura(String mes,int dia) {
		return this.año.get(mes).getTemperatura(dia);
	}
	public int getHumedad(String mes,int dia) {
		return this.año.get(mes).getHumedad(dia);
	}
	public String getClima(String mes,int dia) {
		return this.año.get(mes).getClima(dia);
	}
	public boolean isLluvia(String mes,int dia) {
		return this.año.get(mes).isLluvia(dia);
	}
}
