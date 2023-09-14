package ejercicio09;

public class Usuario {
	
	private String apellidos;
	private String nombres;
	private String mail;
	private int edad;
	private int ingresosMensuales;
	private int gastosMensuales;
	
	//Construrtor
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	//Getters y Setteres
	public String getApellidos() {
	    return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIngresosMensuales() {
		return ingresosMensuales;
	}

	public void setIngresosMensuales(int ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}

	public int getGastosMensuales() {
		return gastosMensuales;
	}

	public void setGastosMensuales(int gastosMensuales) {
		this.gastosMensuales = gastosMensuales;
	}
	
	public String mayoromenor () {
		if (edad >= 18) {
			return "Es Mayor de edad";
		}else {
			return "Es Menor de edad";
		}
	}
	
	public String puedeAhorrar () {
		int n = 0;
		if (ingresosMensuales > gastosMensuales) {
			n = ingresosMensuales - gastosMensuales;
			return "el usuario SI puede ahorar, un total de " + n + "$ en disponilidad para ahorrar.";
		} else {
			n = gastosMensuales - ingresosMensuales;
			return "el usuario NO puede ahorar, un total de " + n + "$ en deuda.";
		}
	}


}
