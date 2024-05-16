/* 
 *  Defina uma classe Exercicio3.java e dentro da classe escreva o metodo main. Defina
 duas variaveis do tipo float e atribua um valor para cada uma delas. Mande o programa exibir
 qual delas e maior.
*/

package lista1;

public class Exercicio3 {
    public static void main(String[] args) {
        float var1 = 765.98f, var2 = 8736.98793879f;
        if (var1 > var2) {
            System.out.println("Maior valor>>" + var1);
        } else {
            System.out.println("Maior valor>>" + var2);
        }
    }
}
