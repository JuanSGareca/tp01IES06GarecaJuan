package ejercicio03;

public class CalculadoraDeCadenas {
	
	private String texto;
	
	public CalculadoraDeCadenas() {
		// TODO Auto-generated constructor stub
	}
	
	//Getters y Setters
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	//Metodos
	
	public String determinarLaEsxistenciaDeUnCaracterEnunaCadena (char caracter) {
		String resultado = "";
		
		if (texto.indexOf(caracter) != -1) {
			resultado = "el caracter SI esta en la cadena";
		} else {
			resultado = "el caracter NO esta en la cadena";
		}
		return resultado;
    }
	
	public String cantidadDeVocales () {
		int contador = 0;
		int i = 0;
		for (i = 0; i <= texto.length()-1 ; i=1+i) {
			if (texto.charAt(i) == 'a') {
			contador = contador + 1;
			} else  if (texto.charAt(i) == 'e') {
			    contador = contador + 1;
			} else if (texto.charAt(i) == 'i') {
			        contador = contador + 1;
			} else if (texto.charAt(i) == 'o') {
			        contador = contador + 1;
			} else if (texto.charAt(i) == 'u') {
			        contador = contador + 1;
			}
  }

		return "La cantidad de vocales son " + contador;
}
}




