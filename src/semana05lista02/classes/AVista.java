package semana05lista02.classes;

public class AVista extends Pagamento {

	private int desconto;

	public AVista(double valor) {
		super(valor);
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		if (desconto >= 0 && desconto <= 30) {
			this.desconto = desconto;
		} else {
			System.err.println("O desconto é valido entre 0 e 30%.");
		}
	}

	public void exibirValorAVista() {
		double valDesconto = (this.getValor() ) * (1 - ((double)this.getDesconto())/100 );

		System.out.println("Valor à vista>>R$" + valDesconto);
	}

}
