package atividade.pacotes.imports.laboratorio.main;

import atividade.pacotes.imports.laboratorio.misturas.Experimento;
import atividade.pacotes.imports.laboratorio.misturas.Mistura;
import atividade.pacotes.imports.laboratorio.util.Tempo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mistura m1 = new Mistura();
		Mistura m2 = new Mistura();
		Tempo t1 = new Tempo(17, 6, 41);
		Tempo t2 = new Tempo(4, 20, 0);
		Experimento listaDeExperimentos = new Experimento();
		
		m1.setNome("Mistura de Café e Água Quente");
		m1.setTempo(t1);
		m2.setNome("Mistura de Leite e Chocolate em Pó");
		m2.setTempo(t2);
		
		listaDeExperimentos.registrarMistura(m1);
		listaDeExperimentos.registrarMistura(m2);
		listaDeExperimentos.exibirExperimento();
		
	}

}
