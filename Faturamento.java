package EstudoJava;

import java.util.Scanner;

public class Faturamento {
	static double [] faturamento = new double[30];
	static int dias_de_lucro = 0;
	static double valor_maximo, valor_minimo,media_mensal = 0;
	static int controle = 0;
	public static void main (String [] args) {
		System.out.println("Digite os valores de faturamento do mês: ");
		RecebeValores();
		RetornaMaxMin();
		RetornaMedia();
		SuperandoMedia();
	}

	public static void RecebeValores() {
		Scanner sc = new Scanner(System.in);
		for (int posicao_no_vetor = 0; posicao_no_vetor < faturamento.length; posicao_no_vetor++) {
			System.out.print("Dia " + (posicao_no_vetor + 1) + " : ");
			try {
				faturamento[posicao_no_vetor] = sc.nextDouble();
			}catch (java.util.InputMismatchException e) {
				faturamento[posicao_no_vetor] =  Double.parseDouble(sc.next());
			}
			if (faturamento[posicao_no_vetor] != 0) {
				dias_de_lucro++;
			}
			System.out.println(faturamento[posicao_no_vetor] + " - " + dias_de_lucro);
		}
	}
	
	public static void RetornaMaxMin() {
		valor_maximo = faturamento[0];
		valor_minimo = Double.MAX_VALUE;
		for (int verifica_maximo = 0; verifica_maximo < faturamento.length - 1; verifica_maximo++) {
			if (faturamento[verifica_maximo] < faturamento[verifica_maximo + 1]) {
				valor_maximo = faturamento[verifica_maximo + 1];
			}else if (faturamento[verifica_maximo] != 0 && faturamento[verifica_maximo] < valor_minimo) {
				valor_minimo = faturamento[verifica_maximo];
			}
		}
	}
	
	public static void RetornaMedia() {
		for (int calculando_media = 0; calculando_media < faturamento.length; calculando_media++) {
			media_mensal += faturamento[calculando_media];
		}
		media_mensal = media_mensal/dias_de_lucro;
	}
	
	public static void SuperandoMedia() {
		dias_de_lucro = 0;
		for (int posicao_do_vetor = 0; posicao_do_vetor < faturamento.length; posicao_do_vetor++ ) {
			controle = (faturamento[posicao_do_vetor] > media_mensal) ? dias_de_lucro++ : 0;
		}
		System.out.println(dias_de_lucro);
	}
}
