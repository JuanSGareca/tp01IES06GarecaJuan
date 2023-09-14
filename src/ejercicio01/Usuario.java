package ejercicio01;

public class Usuario {
	
	private String apellido;
	private String nombre;
	
	//Constructor
	public Usuario(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
	}

	//Getters y Setters
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

	
	

