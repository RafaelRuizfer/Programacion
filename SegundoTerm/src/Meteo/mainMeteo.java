package ED1702;

public class mainMeteo {

	public static void main(String[] args) {
//		double temperatura, double viento, String clima, int humedad, double precipitaciones,
//		boolean lluvia
		Tiempo t= new Tiempo(33,12,"soleado",5,0,false);
		Tiempo t2= new Tiempo(29,10,"lluvioso",60,10,true);
		mes julio= new mes(31);
		julio.añadirDia(1, t);
		julio.añadirDia(2, t2);
		año año2023= new año();
		año2023.añadirMes("Julio", julio);
//		System.out.println(a�o2023.getClima("Julio", 1));
//		System.out.println(a�o2023.getA�o().get("Julio").getMes().get(1).getClima());
		System.out.println(año2023.consultaMes("Julio"));
	}

}
