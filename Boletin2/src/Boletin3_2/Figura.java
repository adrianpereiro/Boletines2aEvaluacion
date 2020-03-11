package Boletin3_2;

public abstract class Figura {
	private double area;
	
	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	protected abstract void calcularArea();
		
	
	protected void imprimirArea(double area) {
		System.out.printf("El area de esta figura es %s\n",area);
	}
}


