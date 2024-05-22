package lista4.test;

import lista4.classes.Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Luiz Thomas Matheus da Mota");
		pessoa1.setIdade(2024-1982);
		pessoa1.setSexo('M');
		pessoa1.setCadastroPessoaFisica("177.621.543-53");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Ester Tereza Sabrina Campos");
		pessoa2.setIdade(2024-1956);
		pessoa2.setSexo('F');
		pessoa2.setCadastroPessoaFisica("140.085.711-24");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
	}

}
