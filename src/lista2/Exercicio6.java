/*
 * Defina uma classe Exercicio6.java e dentro da classe escreva o método main. Usando
 alguma estrutura de repetição determine qual é o fatorial de 5. Sabe-se que o fator de 5 é dado
 por: 5*4*3*2*1
 */

package lista2;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorFatorial = 5, contador;
		long resultado = 1;
		
		for (contador = valorFatorial; contador > 0; contador--) {
			resultado = resultado * contador;
		}
		
		System.out.println("O fatorial de " + valorFatorial + " vale " + resultado);
		
	}

}
