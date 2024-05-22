package lista4.classes;

public class Pessoa {
	private String nome;
	private String cadastroPessoaFisica;
	private int idade;
	private char sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCadastroPessoaFisica() {
		return cadastroPessoaFisica;
	}
	public void setCadastroPessoaFisica(String cadastroPessoaFisica) {
		this.cadastroPessoaFisica = cadastroPessoaFisica;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nCadastro de Pessoa Fisica: " + this.getCadastroPessoaFisica() + "\nIdade: " + this.getIdade() 
				+ " anos\nSexo: " + sexo + "\n";
	}
	
}
