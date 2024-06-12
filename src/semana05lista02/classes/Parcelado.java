package semana05lista02.classes;

public class Parcelado extends Pagamento{
	
	private int numParcelas;
	private int jurosParcela;

	public Parcelado(double valor) {
		super(valor);
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	public int getJurosParcela() {
		return jurosParcela;
	}

	public void setJurosParcela(int jurosParcela) {
		
		if (jurosParcela >= 0 && jurosParcela <=100) {
			this.jurosParcela = jurosParcela;
		} else {
			System.err.println("O juro da parcela dever estar entre 0 e 100.");
		}
		
	}
	
	public void exibirValorParcelado() {
		double valParcela = (this.getValor() / this.getNumParcelas()) * (1 + ((double)this.getJurosParcela())/100 );
		
		System.out.println("Valor pago por parcela>>R$" + valParcela);
	}
}
