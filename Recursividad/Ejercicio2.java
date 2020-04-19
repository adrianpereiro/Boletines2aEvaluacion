package Recursividad;

public class Ejercicio2 {
	static int multiplicacion(int x, int y) {
		return x+multiplicacion2(x,y-1);
	}
	
	static int multiplicacion2(int x,int y) {
		int valor=0;
		for (int i=0;i<y;i++) {
			valor=valor+x;
		}
		return valor;
	}
	
	public static void main(String[] args) {
		System.out.println("El valor de la multiplicacion 5 x 3 es "+multiplicacion(5,3));
		System.out.println("El valor de la multiplicacion 12 x 33 es "+multiplicacion(12,33));
	}
}
