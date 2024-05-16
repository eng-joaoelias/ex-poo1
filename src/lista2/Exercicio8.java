/*
 *  Defina uma classe Exercicio8.java e dentro da classe escreva o método main. Usando
 alguma estrutura de repetição determine o número de algarismos de um determinado valor inteiro.
 Para determinar o número de algarismos de um inteiro pode-se realizar divisões consecutivas
 por 10 e considerar a parte inteira da divisão. Quando o valor for zero finaliza-se o algortimos.
 A resposta será a quantidade de divisões feitas.
 */

package lista2;

public class Exercicio8 {

	public static void main(String[] args) {
		int numParaVerificarQtdDigitos = 256;
		int resultado = numParaVerificarQtdDigitos;
		int numDigitos = 0;
		while (resultado > 0) {
			resultado = resultado / 10;
			numDigitos++;
		}
		System.out.println("O numero " + numParaVerificarQtdDigitos + " tem " + numDigitos + " digitos.");
	}

}
