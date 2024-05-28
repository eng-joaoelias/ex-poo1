package atividade.arraylist.classes;

import java.util.ArrayList;

public class Album {
	ArrayList<Figurinha> listaFigurinhas;
	
	public Album() {
		listaFigurinhas = new ArrayList<Figurinha>();
	}
	
	public boolean addFigurinha(Figurinha f) {
		for (Figurinha figurinha : this.listaFigurinhas) {
			if (f.getNumero() == figurinha.getNumero()) {
				System.out.println("Figurinha já existe no álbum");
				figurinha.setQuantidade(figurinha.getQuantidade() + 1);
				return false;
			}
		}
		this.listaFigurinhas.add(f);
		System.out.println("Figurinha de número " + f.getNumero() + " adicionada com sucesso.");
		return true;
	}
	
	public void exibirAlbum() {
		for (Figurinha figurinha : listaFigurinhas) {
			System.out.println(figurinha.toString());
		}
	}
	
	public int getNumeroFigurinhas() {
		return listaFigurinhas.size();
	}
	
}
