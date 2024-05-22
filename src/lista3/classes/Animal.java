/*
 * 1- Crie uma classe Animal que permita armazenar as 
informacoes: 
Nome, raca, peso, altura e idade
*/

package lista3.classes;

public class Animal {
	private String nome;
	private String raca;
	private double peso;
	private double altura;
	private int idade;
	
	public Animal(String nome, String raca, double peso, double altura, int idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}
	
	public Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}

	public Animal() {
		super();
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
