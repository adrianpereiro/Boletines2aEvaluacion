package Boletin3;

public class Ejercicio {
	public static void main (String[] args) {
		Conductor conductorCoche1=new Conductor("54856324F","Zaida");
		Conductor conductorCoche2=new Conductor("12345678E","Alejandro");
		
		Conductor conductorCamion1=new Conductor("54336547Z","María");
		Conductor conductorCamion2=new Conductor("78521577H","David");
		
		Coche coche1=new Coche(5,"2524ASD","Sedán",200,conductorCoche1);
		
		Remolque remolque1=new Remolque("5236ASD",1000);
		Remolque remolque2=new Remolque("4235BBB",500);
		
		Camion camion1=new Camion(323,remolque1,"222FFF","Rígido",100,conductorCamion1);
		
		
		System.out.println(conductorCoche1);
		coche1.mostrarDatos();
		System.out.println(conductorCamion1);
		System.out.println(remolque1);
		camion1.mostrarDatos();
		
		impresionPolimorfismo(coche1);
		impresionPolimorfismo(camion1);
	}
		
		public static void impresionPolimorfismo(Vehiculo v) {
			v.mostrarDatos();
	}
}
