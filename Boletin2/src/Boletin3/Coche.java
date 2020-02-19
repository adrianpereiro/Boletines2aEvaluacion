package Boletin3;

public class Coche extends Vehiculo{
	private int numeroPlazas;

	 
	public Coche(int numeroPlazas, String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
		this.numeroPlazas=numeroPlazas;
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
	    this.setConductor(conductor);
	}
	@Override
	public void mostrarDatos() {
		System.out.printf("%s,",numeroPlazas);
		super.mostrarDatos();
	}
			
}
