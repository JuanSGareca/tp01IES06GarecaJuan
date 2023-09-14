package ejercicio05;

import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora factorial = new Calculadora ();
		
		int Numero = 11;
		
		factorial.setNumeroA(Numero);
		
		System.out.println(factorial.factorial());
	}

}
