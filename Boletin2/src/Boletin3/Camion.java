package Boletin3;

public class Camion {
	private int altura;
	private Remolque remolque;
	public String matricula;
	public String tipo;
	public int velocidadMaxima;
	public Conductor conductor;
	
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

	public Camion(Remolque remolque, String matricula, String tipo, int velocidadMaxima, Conductor conductor) {
		this.remolque=remolque;
		this.matricula=matricula;
		this.tipo=tipo;
		this.velocidadMaxima=velocidadMaxima;
		this.conductor=conductor;
	}
}
