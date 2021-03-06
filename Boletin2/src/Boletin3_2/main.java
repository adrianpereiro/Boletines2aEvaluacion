package Boletin3_2;

public class main {
	public static void main(String[] args) {
		Circulo circulo1=new Circulo(2.3,3.1416);
		Cuadrado cuadrado1=new Cuadrado(5.2);
		Triangulo triangulo1=new Triangulo(2,3.6);
		Rectangulo rectangulo1=new Rectangulo(8,3.5);
		
		circulo1.calcularArea();
		cuadrado1.calcularArea();
		triangulo1.calcularArea();
		rectangulo1.calcularArea();
		
		circulo1.calcularPerimetro();
		cuadrado1.calcularPerimetro();
		triangulo1.calcularPerimetro();
		
		
		System.out.printf("El area del circulo es %.3f\n",circulo1.getArea());
		System.out.printf("El area del cuadrado es %.3f\n",cuadrado1.getArea());
		System.out.printf("El area del triangulo es %.3f\n",triangulo1.getArea());
		System.out.printf("El area del rectangulo es %.3f\n", rectangulo1.getArea());
		
		circulo1.imprimirArea();
		cuadrado1.imprimirArea();
		triangulo1.imprimirArea();
		
		circulo1.imprimirPerimetro();
		cuadrado1.imprimirPerimetro();
		triangulo1.imprimirPerimetro();
		
	}

	Figura[] arrayFiguras= {
			new Triangulo(3,2),
			new Cuadrado(5),
			new Triangulo(15,3),
			new Triangulo(8,7),
			new Rectangulo(9,5),
			new Rectangulo(15,6),
			new Circulo(5),
			new Circulo(9),
			new Rectangulo(8,3),
			new Cuadrado(9)
			};

}
