package atividade.pacotes.imports.laboratorio.misturas;

import atividade.pacotes.imports.laboratorio.util.Tempo;

public class Mistura {
	private String nome;
	private Tempo tempo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTempo() {
		return this.tempo.toString();
	}
	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}
	
	public void exibirMistura() {
		System.out.println("Nome da mistura: " + this.getNome() + "\nHora de conclusão>>" + this.getTempo());
	}
	
	
}
