/*
 * Defina uma classe Exercicio5.java e dentro da classe escreva o método main. Defina
 uma variavel inteira denominada mes. Com base no valor atribuído a variavel imprima o nome
 do mes correspondente. Por exemplo, se o valor for igual a 4 entao o programa devera exibir
 “Abril.”. Se um valor igual a 13 for atribuido a variavel, então o programa devera exibir “Valor
 invalido.”.
 */

package lista1;

public class Exercicio5 {
    public static void main(String[] args) {
        int mes = 1;

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;

            default:
                System.out.println("Valor invalido.");
                break;
        }
    }
}
