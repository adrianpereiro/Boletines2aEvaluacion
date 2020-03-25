package Boletin3_2;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.altura=altura;
		this.base=base;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		this.setArea((base*altura)/2);
	}

	@Override
	public void calcularPerimetro() {
		this.setPerimetro(base*3);
	}
	public void imprimirDatosFigura() {
		
	}

}
