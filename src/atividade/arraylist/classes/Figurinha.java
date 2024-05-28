package atividade.arraylist.classes;

public class Figurinha {
	int numero;
	int quantidade;
	
	public Figurinha() {
		this.quantidade = 1;
	}
	
	public Figurinha(int numero) {
		this.setNumero(numero);
		this.quantidade = 1;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Figurinha [Número=" + getNumero() + ", Quantidade=" + getQuantidade() + "]";
	}
	
	
}
