package Boletin3;

public class Coche extends Vehiculo{
	private int numeroPlazas;

	 
	public Coche(int numeroPlazas, String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
		this.numeroPlazas=numeroPlazas;
		this.matricula=matricula;
		this.tipo=tipo;
		this.velocidadMaxima=velocidadMaxima;
		this.conductor=conductor;
	}
	
	
	public void mostrarDatos() {
		
	}
	
}
