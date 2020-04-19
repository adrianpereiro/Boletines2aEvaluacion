package Recursividad;

import java.util.Scanner;

public class Ejercicio3 {
	private static String obtenerReverso(String cadena, int pos) {
		String reverso="";
			for(int i=pos-1;i>=0;i--) {
				char a=cadena.charAt(i);
				reverso=reverso+a;
			}
			return reverso;
		}
	
	static String obtenerString(String cadena){
		int pos;
		pos=cadena.length();
		return obtenerReverso(cadena,pos);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena;
		System.out.println("Introduce una frase para obtener su reverso");
		cadena=sc.nextLine();
		System.out.println("El reverso de la cadena introducida es --> "+obtenerString(cadena));
	}
}
