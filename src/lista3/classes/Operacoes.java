/*
 *3- Crie uma classe chamada Operacoes (sem os acentos), que 
contenha: 
Os atributos: numero1 e numero2. 
Os metodos: soma, subtracao, multiplicacao e divisao (sem os 
acentos)  
*/

package lista3.classes;

public class Operacoes {
	private double numero1;
	private double numero2;
	
	
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public double soma(double val1, double val2) {
		return val1 + val2;
	}
	
	public double subtracao(double val1, double val2) {
		return val1 - val2;
	}
	
	public double multiplicacao(double val1, double val2) {
		return val1 * val2;
	}
	
	public double divisao(double val1, double val2) {
		
		if (val2 == 0) {
			return 0;
		}
		
		return val1 / val2;
	}
	
	public void executaTodasOperacoes(double val1, double val2) {
		System.out.println("Soma>>" + soma(val1, val2));
		System.out.println("Subtracao>>" + subtracao(val1, val2));
		System.out.println("Multiplicacao>>" + multiplicacao(val1, val2));
		System.out.println("Divisao>>" + divisao(val1, val2));
	}
}
