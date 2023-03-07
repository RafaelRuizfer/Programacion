package Interfaces;

public class ReproductorVideo extends ReproductorPortatil implements IReproductorVideo{
	private boolean reproduceWMV;
	private boolean reproduceDIVX;
	private boolean reproduceMPG;
	private boolean reproduceDVD;
	private boolean reproduceJPG;
	private double tamanyoPantalla;
	
	public ReproductorVideo(String marca, String modelo,double tamanyoPantalla) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.tamanyoPantalla=tamanyoPantalla;
		
	}
	@Override
	public void setreproduceWMV() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getreproduceWMV() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setreproduceDIVX() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getreproduceDIVX() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setreproduceMPG() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getreproduceMPG() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setreproduceDVD() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getreproduceDVD() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setreproduceJPG() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getreproduceJPG() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void settamanyoDeLaPantalla() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double gettamanyoDeLaPantalla() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void settelevision() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean gettelevision() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
