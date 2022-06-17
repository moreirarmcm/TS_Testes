package EstudoJava;

import java.util.Scanner;
/**
 * "Invertendo Textos"
 * O programa recebe uma string e, usando um la�o for-each, inverte a posi��o de cada letra da String. E ent�o imprime a string invertida. 
 * 
 * @author Renan
 *
 */
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
