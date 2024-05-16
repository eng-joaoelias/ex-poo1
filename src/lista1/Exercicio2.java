/*
 * Defina uma classe Exercicio2.java e dentro daclasse escreva o metodo main. Defina
 uma variavel inteira e atribua um valor para ela. Mande o programa exibir “Eh par!” se o valor
 atribuído for par e “Eh impar!”, caso contrário. Use o operador % para verificar se o valor é par.
 */

package lista1;

public class Exercicio2 {
    public static void main(String[] args) {
        int vlrASerVerificado = 63546;
        if (vlrASerVerificado % 2 ==0) {
            System.out.println("Eh par!");
        } else {
            System.out.println("Eh impar!");
        }
    }
}
