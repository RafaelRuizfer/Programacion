package ED1702;

import java.util.ArrayList;
import java.util.HashMap;

public class mes {
	private int numdias;
	private HashMap<Integer,Tiempo> mes;
	
	public mes(int numdias) {
		this.mes= new HashMap<Integer,Tiempo>();
		this.numdias=numdias;
	}

	public HashMap<Integer, Tiempo> getMes() {
		return mes;
	}

	public void setMes(HashMap<Integer, Tiempo> mes) {
		this.mes = mes;
	}
	
	public boolean añadirDia(int dia, Tiempo t) {
		boolean resultado=false;
		if(dia>0 && dia<=this.numdias) {
			this.mes.put(dia, t);
			resultado=true;
		}
		return resultado;
	}
	
	public Tiempo getTiempo(int dia) {
		return this.mes.get(dia);
	}
	
	public double getPrecipitaciones(int dia) {
		return this.mes.get(dia).getPrecipitaciones();
	}
	public double getTemperatura(int dia) {
		return this.mes.get(dia).getTemperatura();
	}
	public int getHumedad(int dia) {
		return this.mes.get(dia).getHumedad();
	}
	public String getClima(int dia) {
		return this.mes.get(dia).getClima();
	}
	public boolean isLluvia(int dia) {
		return this.mes.get(dia).isLluvia();
	}
	
	@Override
	public String toString() {
		String resultado="";
		ArrayList<Integer> tiempos= new ArrayList<Integer>(this.mes.keySet());
		tiempos.sort(null);
		for(int i=0;i<tiempos.size();i++) {
			resultado+=tiempos.get(i)+"->" + this.mes.get(tiempos.get(i)) + "\n";
		}
		return resultado;
	}
	
	
}
