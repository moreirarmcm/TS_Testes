package EstudoJava;

import java.util.Scanner;
/**
 * "VERIFICANDO N�MERO FIBONACCI"
 * 
 * O c�digo recebe um n�meto int e verifica se esse n�mero pertence � sequ�ncia Fibonacci. Para isso � utilizado um vetor de 3 posi��es que guarda
 * os dois valores iniciais da sequ�ncia, e ent�o � realizado o c�lculo da sequ�ncia.
 * 
 *  
 * @author Renan
 *
 */
public class Fibonacci {
	static int numero_escolhido = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o n�mero a ser verificado: ");
		numero_escolhido = sc.nextInt();
		int [] fibonacci = new int [3]; //para realiza��o do c�lculo da sequ�ncia.
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		fibonacci[2] = 0;
		while (fibonacci[2] < numero_escolhido) {
			//a �ltima posi��o recebe a soma das posi��es anteriores. As anteriores recebem novos valores.
			fibonacci[2] = fibonacci[0] + fibonacci[1];
			fibonacci[0] = fibonacci[1];
			fibonacci[1] = fibonacci[2];
		}
		System.out.print("\nO n�mero '" + numero_escolhido + "' " + VerificaNumero(fibonacci[2]));
	}
	
	/**
	 * Informa se o n�mero alocado na 3� posi��o do vetor pertence � sequ�ncia Fibonacci.
	 * 
	 * @param numero_na_sequencia - valor alocado na 3� posi��o do vetor. 
	 * @return
	 */
	public static String VerificaNumero(int numero_na_sequencia) {
		if (numero_na_sequencia == numero_escolhido) {
			return "PERTENCE � sequ�ncia Fibonacci.";
		}else {
			return "N�O pertence � sequ�ncia Fibonacci."; 
		}
	}
	
}
