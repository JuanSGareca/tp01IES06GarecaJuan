package ejercicio02;

public class Calculadora {
	private int numeroA;
	private int numeroB;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	//Getter y Setters
	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	
	//Metodos
	
	public int sumar() {
		int resultado = 0;
		resultado = numeroA + numeroB;
		return resultado;
	}
	
	public int restar() {
		int resultado = 0;
		resultado = numeroA - numeroB;
		return resultado;
	}
	
	public int multiplicar() {
		int resultado = 0;
		resultado = numeroA * numeroB;
		return resultado;
	}
	
	public String dividir() {
		double divisor = numeroB;
		double resultado = 0;
		if (numeroB != 0) {
			resultado = numeroA/divisor;
			return resultado + "";
		} else {
			return "Error";
		}
	}
	
	public int potencia () {
		int resultado = 1;
		int i = 0;
		for ( i = numeroB; i > 0; i = i-1 , resultado = resultado * numeroA){
		}
		return resultado;
    }
	
	public double raiz () {
		double resultado = Math.pow(numeroB, 1/numeroA);
		return resultado;
	}
	
	public String paroimpar () {
		int numero = numeroA;
		int numeropar = 0;
		int numeroimpar = 0;
		if (numero % 2 == 0) {
			numeropar = numero * 3;
			return "El numero " + numero + " es par, y su triple es " + numeropar;
		} else {
			numeroimpar = numero * 2;
			return "El numero " + numero + " es impar, y su doble es " + numeroimpar;
		}
	}
	
	public String factorial () {
		int n = numeroA;
		int fact = 1;
		int i =1;
		if (n <= 10) {
			while(i <= n) {
				fact = fact * i;
				i++;
			}
			return "El factorial de " + n + " es " + fact;
		
		} else {
			return "El numero ingresado es mayor a 10.";
		}
	}
	
	public int cuentaAtrasFor (){
	int numero = 0;
	for (numero = 320; numero >= 180; numero = numero - 20) {
	System.out.println(numero);
	}
	return numero;
	}
	
	public String cuentaAtrasWhile ( ) {
		int numero = 340;
		while (numero >= 180) {
			numero = numero - 20;
			System.out.println(numero);
		}
		return "";
	}
	
	public String cuentaAtrasDoWhile () {
		int numero = 340;
		do {
			numero = numero - 20;
			System.out.println(numero);
		} while (numero >= 180);
		return "";
	}
}
	

	
