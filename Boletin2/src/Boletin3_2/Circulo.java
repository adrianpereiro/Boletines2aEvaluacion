package Boletin3_2;

public class Circulo extends Figura {
	private double radio;
	private double pi;
	
	public Circulo(double radio, double pi) {
		this.pi=pi;
		this.radio=radio;
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public double getRadio(){
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getPi() {
		return pi;
	}
	
	public void setPi(double pi) {
		this.pi=pi;
	}
	
	@Override
	protected void calcularArea() {
		this.setArea(pi*radio*radio);
	}
	
	
}
