package EstudoJava;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		char [] palavra_invertida = new char[palavra.length()];
		int tamanho_palavra = palavra.length() - 1;
		for (char c : palavra.toCharArray()) {
			palavra_invertida[tamanho_palavra] = c;
			tamanho_palavra--;
		}
		System.out.print(palavra_invertida);
	}
}
