package atividade.construtores.classes;

public class Funcionario {
	String nome;
	double salario;
	String cargo;
	char sexo;
	int idade;

	public Funcionario() {

	}

	public Funcionario(String nome, double salario, String cargo, char sexo, int idade) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setCargo(cargo);
		this.setSexo(sexo);
		this.setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		String delimiter = "========================";
		return String.format("%s\nFuncionário: %s\nSalário: R$ %.2f\nCargo: %s\nSexo: %s\nIdade: %d\n%s", delimiter,
				getNome(), getSalario(), getCargo(), getSexo(), getIdade(), delimiter);
	}

}
