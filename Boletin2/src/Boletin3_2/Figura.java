package Boletin3_2;

public abstract class Figura implements ICalculosFigura,IImpresionFigura {
	private double area;
	private double perimetro;
	
	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro=perimetro;
	}
	
	public abstract void calcularArea();
		
	
	public void imprimirArea() {
		System.out.printf("El area de esta figura es %s\n",area);
	}
	
	public void imprimirPerimetro() {
		System.out.printf("El perimetro de esta figura es %s\n",perimetro);
	}
}


