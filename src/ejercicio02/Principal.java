package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calcu = new Calculadora ();
		
		int numeroA = 3;
		int numeroB = 8;
		
		calcu.setNumeroA(numeroA);
		calcu.setNumeroB(numeroB);
		
		System.out.println(calcu.sumar());
		System.out.println(calcu.restar());
		System.out.println(calcu.multiplicar());
		System.out.println(calcu.dividir());
		System.out.println(calcu.potencia());
		System.out.println(calcu.raiz());
	}

}
