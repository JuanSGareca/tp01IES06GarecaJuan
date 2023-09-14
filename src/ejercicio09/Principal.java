package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario mayorMenor = new Usuario ();
		Usuario gasto = new Usuario ();
		
		String apellidos = "Martinez";
		String nombres = "Jose";
		String mail = "jose@gmail.com";
		int edad = 20;
		int ingresosMensuales = 25;
		int gastosMensuales = 40;
		
		mayorMenor.setEdad(edad);
		gasto.setIngresosMensuales(ingresosMensuales);
		gasto.setGastosMensuales(gastosMensuales);
		
		
		System.out.println("El Usuario " + apellidos + " " + nombres + " de edad " + edad + " y mail " + mail +
				" con ingresos de " + ingresosMensuales + " y gastos de " + gastosMensuales);
		System.out.println(mayorMenor.mayoromenor() + " y " + gasto.puedeAhorrar());

	}

}
