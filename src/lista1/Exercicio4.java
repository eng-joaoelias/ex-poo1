/*
 *  Defina uma classe Exercicio4.java e dentro da classe escreva o metodo main. Defina
 uma variavel inteira denominada ddd. Usando o switch/case e com base no valor que voce
 atribuir a ela, mande o programa exibir o destino com base na tabela a seguir
 */

package lista1;

public class Exercicio4 {
    public static void main(String[] args) {
        int ddd = 71;
        switch (ddd) {
            case 61:
                System.out.println("DDD de Brasilia");
                break;
            case 71:
                System.out.println("DDD de Salvador");
                break;
            case 11:
                System.out.println("DDD de Sao Paulo");
                break;
            case 21:
                System.out.println("DDD de Rio de Janeiro");
                break;
            case 32:
                System.out.println("DDD de Juiz de Fora");
                break;
            case 19:
                System.out.println("DDD de Campinas");
                break;
            case 27:
                System.out.println("DDD de Vitoria");
                break;
            case 31:
                System.out.println("DDD de Belo Horizonte");
                break;

            default:
                System.out.println("DDD nao cadastrado.");
                break;
        }
    }
}
