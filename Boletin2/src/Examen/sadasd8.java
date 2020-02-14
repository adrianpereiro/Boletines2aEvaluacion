package Examen;

public class sadasd8 {
	public class Persona{
		public String nombre;
		private String telefono;
		public Direccion direccion;
		
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono=telefono;
		}
	}
	
	public Class Professor{
		public void imprimirTelefono() {
			String tel=getTelefono();
			System.out.println(tel);
		}
	}
	
	public class Alumno extends Persona{
		public String codigoAlumno;
		public double notaMedia; 
		public alumno (String codigoAlumno,double notaMedia,String nombre, String telefono, Direccion direccion) {
			this.codigoalumno=codigoAlumno;
			this.notaMedia=notaMedia;
			this.nombre=nombre;
			this.telefono=telefono;
			this.direccion=direccion;
		}
		Direccion dir=new Direccion();
		Alumno al=new Alumno("002",5,"Juan","SSasd",dir)
	}
	----------main-----------
	Alumno al=new Alumno;
	al.codigoAlumno="001";
	al.notaMedia=7;
	al.nombre="Zaida";
	al.telefono="54546465";
	Direccion dir=new Direccion();
	al.direccion=direccion;
	---------main----------------
}
	
