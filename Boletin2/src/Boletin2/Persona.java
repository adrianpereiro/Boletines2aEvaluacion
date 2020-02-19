package Boletin2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	
	String nombre;
	String apellidos;
	LocalDate fechaNacimiento;
	int estatura;
	
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, int estatura ) {
		 this.nombre=nombre;
		 this.apellidos=apellidos;
		 this.fechaNacimiento=fechaNacimiento;
		 this.estatura=estatura;
	 }
	
	public Persona() {
		
	 }
	 
	public void mostrarDatos() {
		System.out.printf("Los datos de %s son:\n Apellidos:%s\n Estatura:%d cm\n Fecha de nacimiento:%s\n\n",nombre,apellidos,estatura,fechaNacimiento);
	}
	
	public void obtenerEdad() {
		LocalDate hoy= LocalDate.now();
		long edad = ChronoUnit.YEARS.between(fechaNacimiento,hoy );
		System.out.printf("La edad de %s es %s a�os\n\n",nombre,edad);
	}
}