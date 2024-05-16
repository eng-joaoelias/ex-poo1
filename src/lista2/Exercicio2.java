/*
 * Defina uma classe Exercicio2.java e dentro da classe escreva o metodo main. Usando
 a estrutura de repeticao while exibir os multiplos de 100 até o valor 1000.
 */

package lista2;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int num = 1;
		System.out.println("Multiplos do numero 100 ate o valor 1000:");
		while (num <= 1000) {
			if (num % 100 == 0) {
				System.out.println(num);
			}
			num++;
			
		}
	}

}
