package Recursividad;

public class Ejercicio1 {
	static int potencia(int x,int n) {
		return x* potencia2(x,n-1);
	}
	
	static int potencia2(int x, int n) {
		int potencia=1;
		for(int i=0;i<n;i++) {
			potencia=potencia*x;
		}
		return potencia;
	}
	
	public static void main(String[] args) {
		System.out.println("La potencia de 7 elevado a 5 es "+ potencia(7,5));
		System.out.println("La potencia de 9 elevado a 3 es "+ potencia(9,3));
	}

}
