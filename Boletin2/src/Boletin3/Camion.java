package Boletin3;

public class Camion extends Vehiculo {
	private int altura;
	private Remolque remolque;

	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public Camion(int altura,Remolque remolque, String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
		this.altura=altura;
		this.remolque=remolque;
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setConductor(conductor);
	}
	
	public Camion(String matricula, String tipo, int velocidadMaxima, int altura) {
		this.setMatricula(matricula);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setTipo(tipo);
		this.altura=altura;
	}
	
	public void  mostrarDatos() {
		System.out.printf("Datos Vehiculo\nAltura:%s cm\n",altura);
		super.mostrarDatos();
	}
	
}
