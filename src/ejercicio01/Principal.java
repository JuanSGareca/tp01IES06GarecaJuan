package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String apellido = "Gareca";
		String nombre = "Juan";
		
		Usuario usu01 = new Usuario(apellido, nombre);
		
		System.out.println(usu01.getApellido() + " " + usu01.getNombre());
		
		usu01.setApellido("Martinez");
		usu01.setNombre("Jose");
		
		System.out.println(usu01.getApellido() + " " + usu01.getNombre());
	}
}
