package atividade.pacotes.imports.laboratorio.misturas;

import java.util.ArrayList;

public class Experimento {
	private ArrayList<Mistura> misturas;
	
	public Experimento() {
		misturas = new ArrayList<Mistura>();
	}
	
	public boolean registrarMistura(Mistura m) {
		this.misturas.add(m);
		return true;
	}
	
	public void exibirExperimento() {
		for (Mistura mistura : misturas) {
			mistura.exibirMistura();
		}
	}
}
