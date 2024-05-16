/*
 * Defina uma classe Exercicio1.java e dentro da classe escreva o método main. Defina
 duas variaveis inteiras e atribua um valor para cada uma delas. Mande o programa exibir o valor
 da soma, multiplicacao, divisao e subtracao.
 */

package lista1;

public class Exercicio1 {
    public static void main(String[] args) {
        int var1 = 24, var2 = 69;

        System.out.println("Valores>>" + var1 + " e " + var2);
        System.out.println("Soma>>" + (var1+var2));
        System.out.println("Subtracao>>" + (var1-var2));
        System.out.println("Multiplicacao>>" + (var1*var2));
        System.out.println("Divisao>>" + ((double)var1/var2));

    }
}
