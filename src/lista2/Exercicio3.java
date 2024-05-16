/*
 * Defina uma classe Exercicio3.java e dentro da classe escreva o metodomain. Usando
 a estrutura de repeticao do...while exibir os numeros que terminam com o algarismo 5
 começando em 100 indo até-100.
 */

// Define que este arquivo faz parte do pacote 'lista2'
package lista2;

// Declaracao da classe Exercicio3
public class Exercicio3 {

    // Metodo principal, onde a execucao do programa comeca
    public static void main(String[] args) {
        // Declaracao e inicializacao da variavel 'numero' com o valor 100
        int numero = 100;

        // Exibe uma mensagem informando o que o programa vai fazer
        System.out.println("Exibindo numeros que terminam com o algarismo 5 começando em 100 indo até -100.");

        // Inicio do laço do...while
        do {
            // Verifica se 'numero' termina em 5.
            // Isso é verdade se 'numero' é multiplo de 5 (numero % 5 == 0)
            // e nao e multiplo de 10 (numero % 10 != 0)
            if (numero % 5 == 0 && numero % 10 != 0) {
                // Se as condicoes sao verdadeiras, imprime o numero
                System.out.println(numero);
            }
            // Decrementa 'numero' em 1
            numero--;
        // Continua o laco enquanto 'numero' for maior ou igual a -100
        } while (numero >= -100);
    }
}
