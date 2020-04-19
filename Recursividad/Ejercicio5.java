package Recursividad;

public class Ejercicio5 {
	static boolean esPar(int numero) {
		boolean esPar=true;
		if (numero==0) {
			return esPar;
		}else {
			return esImpar(numero-1,esPar);
		}
	}
	
	static boolean esImpar(int numero, boolean esPar) {
		if(numero==0) {
			esPar=false;
			return esPar;
		}else {
			return esPar(numero-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("El valor 8 es par --> "+esPar(8));
	}
}
