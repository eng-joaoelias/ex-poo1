/*
 * Defina uma classe Exercicio4.java e dentro da classe escreva o método main. Usando
 alguma estrutura de repetição some os valores ímpares de 1 a 9 e exiba o valor final da soma.
 */

package lista2;

public class Exercicio4 {
	
	public static void main(String[] args) {
		int cont = 1, limite = 9, soma = 0;
		
		while (cont <= limite) {
			if (cont % 2 != 0) {
				soma = soma + cont;
			}
			cont++;
		}
		System.out.println("Soma dos valores impares de 1 a 9>>" + soma);
	}
	
}
