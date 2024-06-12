package semana05lista02.classes;

public class Pagamento {
	private double valor;
	
	public Pagamento(double valor) {
		this.setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void exibirValor() {
		System.out.println("Valor do pagamento: R$" + this.getValor());
	}
}
