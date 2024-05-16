/*
 * Defina uma classe Exercicio1.java e dentro da classe escreva o metodo main. Usando
 a estrutura de repeticao for exibir os numeros impares de 0 a 100.
 */

package lista2;

public class Exercicio1 {
	public static void main(String[] args) {
		int limite = 100;
		System.out.println("Exibindo os numeros impares de 0 a 100");
		for (int i = 0; i <= limite; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
