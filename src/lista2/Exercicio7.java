/*
 * DefinaumaclasseExercicio7.javaedentrodaclasseescrevaométodomain. Usando
 alguma estrutura de repetição determine qual é a soma da sequência abaixo:
 1/2 + 3/5 + 5/8  + 7/11 + 9/14 + 11/17
 */

package lista2;

public class Exercicio7 {
	public static void main(String[] args) {
		int numerador = 1;
		int denominador = 2;
		int maxNumerador = 11;
		int maxDenominador = 17;
		int contCima, contBaixo;
		double soma = 0;
		
		for(contCima = numerador, contBaixo = denominador; contCima <= maxNumerador && contBaixo <= maxDenominador; contCima += 2, contBaixo += 3) {
			double fracao = (double)contCima / contBaixo;
			soma = soma + fracao;
		}
		
		System.out.println("Valor da soma>> " + soma);
	}
}
