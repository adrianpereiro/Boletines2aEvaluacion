package Boletin3;

public class Ejercicio {
	public static void main (String[] args) {
		Conductor conductorCoche1=new Conductor("54856324F","Zaida");
		Coche coche1=new Coche(5,"2524ASD","Sed�n",200,conductorCoche1);
		Remolque remolque1=new Remolque("5236ASD",1000);
		Conductor conductorCamion1=new Conductor("54336547Z","Mar�a");
		Camion camion1=new Camion(remolque1,"222FFF","R�gido",100,conductorCamion1);
		
		coche1.mostrarDatos();
		
		
		
	}
}
