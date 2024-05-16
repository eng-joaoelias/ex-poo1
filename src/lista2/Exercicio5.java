/*
 * Defina uma classe Exercicio5.java e dentro da classe escreva o método main. Usando
 alguma estrutura de repetição imprima o 10º valor da sequencia de Fibonacci. O valor do 2º
 elemento da sequência de Fibonacci é dado pela soma do 1º e do 0º, onde:
 • Fibonaaci de 0º é 1.
 • Fibonacci de 1º é 1.
 O valor do 3º elemento da sequência de Fibonacci é dado pela soma do 2º e do 1º e assim
 sucessivamente.
 */

package lista2;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] numerosFibonacci = new int[10];
		int i = 0;
		for (i= 0; i < numerosFibonacci.length; i++) {
			if (i == 0 || i == 1) {
				numerosFibonacci[i] = 1;
			} else {
				numerosFibonacci[i] = numerosFibonacci[i - 1] + numerosFibonacci[i - 2];
			}
		}
		
		System.out.println("O valor do 10 termo de Fibonacci e>>" + numerosFibonacci[9]);

	}

}
