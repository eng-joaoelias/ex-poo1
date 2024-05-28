package atividade.construtores.classes;

public class Pizza {
	String nome;
	double valor;
	int numeroIngrediente;
	
	public Pizza() {}
	
	public Pizza(String nome, double valor, int numeroIngrediente) {
		this.setNome(nome);
		this.setValor(valor);
		this.setNumeroIngrediente(numeroIngrediente);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getNumeroIngrediente() {
		return numeroIngrediente;
	}
	public void setNumeroIngrediente(int numeroIngrediente) {
		this.numeroIngrediente = numeroIngrediente;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append("Pizza {");
	    sb.append("\n\tNome: ").append(getNome());
	    sb.append("\n\tValor: R$").append(getValor());
	    sb.append("\n\tNúmero de Ingredientes: ").append(getNumeroIngrediente());
	    sb.append("\n}");
	    return sb.toString();
	}
	
	
	
}
