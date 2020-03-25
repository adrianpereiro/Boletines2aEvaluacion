package Boletin3_2;

public final class Cuadrado extends Figura{  //Al poner final da error en los metodos que se sobreescribe en rectangulo
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public  void calcularArea() {
		
		this.setArea(lado*lado); 
		
	}

	@Override
	public void calcularPerimetro() {
		this.setPerimetro(lado*4);
	}
	
	public void imprimirDatosFigura() {
		
	}

}
