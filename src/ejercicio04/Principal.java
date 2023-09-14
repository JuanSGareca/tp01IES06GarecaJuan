package ejercicio04;

import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora paroimpar = new Calculadora ();
		
		int Numero = 11;
		
		paroimpar.setNumeroA(Numero);
		
		System.out.println(paroimpar.paroimpar());

	}

}
