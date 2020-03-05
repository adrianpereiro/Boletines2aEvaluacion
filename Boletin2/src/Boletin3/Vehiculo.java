package Boletin3;

public class Vehiculo {
	
	private String matricula;
	private String tipo;
	private int velocidadMaxima;
	private Conductor conductor;
	 
	public Vehiculo(String matricula,String tipo,int velocidadMaxima) {
		this.matricula=matricula;
		this.tipo=tipo;
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public Vehiculo() {
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public Conductor getConductor() {
		return conductor;
	}
	
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	public void mostrarDatos() {
		System.out.printf("Matricula:%s\nTipo:%s\nVelocidad máxima:%d Km/h\n\n",matricula,tipo,velocidadMaxima);
	}
	
	
}