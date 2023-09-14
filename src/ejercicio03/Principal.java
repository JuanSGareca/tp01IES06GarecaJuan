package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = 'H';
		String cadena = "Hola Mundo";
		
		CalculadoraDeCadenas calcu = new CalculadoraDeCadenas();
		calcu.setTexto(cadena);
		System.out.println(calcu.determinarLaEsxistenciaDeUnCaracterEnunaCadena(caracter));
		System.out.println(calcu.cantidadDeVocales());
	}

}
