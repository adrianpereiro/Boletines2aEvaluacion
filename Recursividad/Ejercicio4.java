package Recursividad;

public class Ejercicio4 {
	
	static boolean comprobarPrimo(int numero) {
		boolean esPrimo=true;
		if(numero==1) {
			esPrimo=false;
			return esPrimo;
		}else {
			if(numero==2) {
				esPrimo=false;
				return esPrimo;
			}else {
				return comprobarPrimo2(numero);
			}
		}
	}
	
	static boolean comprobarPrimo2(int numero) {
		int cont;
		boolean esPrimo=true;
		cont=1;
		do{
			cont=cont+1;
			if(numero%cont==0) {
				esPrimo=false;
			}
		}while(cont<numero-1);
		if(esPrimo==true) 
			return esPrimo;
		else 
			return esPrimo;
	}
	
	public static void main(String[] args) {
		System.out.println("El numero 5 es primo -->"+comprobarPrimo(5));
	}

}
