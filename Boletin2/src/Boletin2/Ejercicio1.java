package Boletin2;

import java.time.LocalDate;

public class Ejercicio1 {
	public static void main(String[] args) {
		Persona p1 =new Persona();
		p1.nombre="Jose";
		p1.apellidos="Rodriguez Mata";
		p1.estatura=165;
		p1.fechaNacimiento=LocalDate.of(1965, 1, 15);
	
		Persona p2 =new Persona();
		p2.nombre="Maria";
		p2.apellidos="Sánchez Gómez";
		p2.estatura=170;
		p2.fechaNacimiento = LocalDate.of(1980, 12, 26);
		
		Persona p3=new Persona();
		p3.nombre="Alejandro";
		p3.apellidos=" Gómez Gómez";
		p3.estatura=190;
		p3.fechaNacimiento= LocalDate.of(2001, 11, 1);
		
		Persona p4=new Persona();
		p4.nombre="Jose Manuel";
		p4.apellidos="Pérez Pons";
		p4.estatura=127;
		p4.fechaNacimiento= LocalDate.of(2010, 5, 1);
		
		Persona p5=new Persona("Lorena", "Remeseiro Neira", LocalDate.of(2000, 6, 12) );
		
		Persona p6=new Persona("Patricia", "Seoane Álvarez", LocalDate.of(1976,8,23));
		
		p1.mostrarDatos();
		p2.mostrarDatos();
		p3.mostrarDatos();
		p4.mostrarDatos();
		p1.obtenerEdad();
		p2.obtenerEdad();
		p3.obtenerEdad();
		p4.obtenerEdad();
	}
	
}
