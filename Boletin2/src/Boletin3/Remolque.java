package Boletin3;

public class Remolque {
	public String matricula;
	public int longitud;
	
	public Remolque(String matricula, int longitud) {
		this.matricula=matricula;
		this.longitud=longitud;
	}
	public String toString(){
		return "Matricula remolque: "+this.matricula+"\nLongitud remolque: "+ this.longitud+" cm";
	}
}
