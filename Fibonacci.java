package EstudoJava;

import java.util.Scanner;

public class Fibonacci {
	static int numero_escolhido = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o n�mero a ser verificado: \n  <informe valores positivos maiores que 1>");
		numero_escolhido = sc.nextInt();
		int [] fibonacci = new int [3];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		fibonacci[2] = 0;
		while (fibonacci[2] < numero_escolhido) {
			fibonacci[2] = fibonacci[0] + fibonacci[1];
			fibonacci[0] = fibonacci[1];
			fibonacci[1] = fibonacci[2];
		}
		System.out.print("O n�mero '" + numero_escolhido + "' " + VerificaNumero(fibonacci[2]));
	}
	
	public static String VerificaNumero(int numero_na_sequencia) {
		if (numero_na_sequencia == numero_escolhido) {
			return "PERTENCE � sequ�ncia Fibonacci.";
		}else {
			return "N�O pertence � sequ�ncia Fibonacci."; 
		}
	}
	
}
