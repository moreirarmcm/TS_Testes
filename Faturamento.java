package EstudoJava;

import java.util.Scanner;
/**
 * "Analisa Faturamento"
 * 
 * O programa recebe o faturamento di�rio de uma empresa e retorna:
 * 1 - Qual foi o menor e o maior faturamento de um m�s - ignorando valores nulos;
 * 2 - Calcula a m�dia de faturamentos durante o m�s;
 * 3 - Retorna a quantidade de dias que superaram a m�dia em faturamento;
 *  
 * @author Renan
 *
 */
public class Faturamento {
	static double [] faturamento = new double[30];
	static int dias_de_lucro = 0; // para calcular a m�dia (incrementa sempre que faturamento > 0) e para calcular os dias que superaram a m�dia.
	static double valor_maximo, valor_minimo, media_mensal = 0;
	static int controle = 0; //vari�vel auxiliar.
	
	public static void main (String [] args) {
		System.out.println("Digite os valores de faturamento do m�s: ");
		RecebeValores();
		CalculaMaxMin();
		CalculaMedia();
		RetornaSuperMedia();
	}

	/**
	 * Recebe os valores de faturamento usando um Scanner.
	 * 
	 * Trata exce��o de digita��o do ponto flutuante.
	 */
	public static void RecebeValores() {
		Scanner sc = new Scanner(System.in);
		for (int posicao_no_vetor = 0; posicao_no_vetor < faturamento.length; posicao_no_vetor++) {
			System.out.print("\nDia " + (posicao_no_vetor + 1) + " : ");
			try {
				faturamento[posicao_no_vetor] = sc.nextDouble();
			}catch (java.util.InputMismatchException e) {
				faturamento[posicao_no_vetor] =  Double.parseDouble(sc.next());
			}
			if (faturamento[posicao_no_vetor] != 0) {
				dias_de_lucro++;
			}
		}
	}
	/**
	 * Realiza a verifica��o do vetor e retorna o maior e menor valor nas respectivas vari�veis. Ignora os valores = 0.
	 */
	public static void CalculaMaxMin() {
		valor_maximo = faturamento[0];
		valor_minimo = Double.MAX_VALUE; //Tamanho m�ximo do tipo double;
		for (int posicao_no_vetor = 0; posicao_no_vetor < faturamento.length - 1; posicao_no_vetor++) {
			if (faturamento[posicao_no_vetor] < faturamento[posicao_no_vetor + 1]) {
				valor_maximo = faturamento[posicao_no_vetor + 1]; // recebe o maior entre os dois valores
			}else if (faturamento[posicao_no_vetor] != 0 && faturamento[posicao_no_vetor] < valor_minimo) {
				valor_minimo = faturamento[posicao_no_vetor]; // recebe o menor valor, caso seja diferente de 0;
			}
		}
	}
	/**
	 * Calcula a m�dia, usando como denominador os dias onde o lucro foi diferente de 0.
	 * 
	 */
	public static void CalculaMedia() {
		for (int posicao_no_vetor = 0; posicao_no_vetor < faturamento.length; posicao_no_vetor++) {
			media_mensal += faturamento[posicao_no_vetor];
		}
		media_mensal = media_mensal / dias_de_lucro;
	}
	
	/**
	 * Retorna o n�mero de dias que superaram o faturamento m�dio.
	 */
	public static void RetornaSuperMedia() {
		dias_de_lucro = 0;
		for (int posicao_do_vetor = 0; posicao_do_vetor < faturamento.length; posicao_do_vetor++ ) {
			controle = (faturamento[posicao_do_vetor] > media_mensal) ? dias_de_lucro++ : 0;
		}
		System.out.println("\n------//-----------//--------------//-----------");
		System.out.println("Nesse m�s a m�dia de faturamento foi de: " + media_mensal + "\nO n�mero de dias que superaram a m�dia foi: " + dias_de_lucro);
	}
}
