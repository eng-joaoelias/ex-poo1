package atividade.arraylist.test;

import atividade.arraylist.classes.Album;
import atividade.arraylist.classes.Figurinha;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figurinha figurinha1 = new Figurinha(23);
		Figurinha figurinha2 = new Figurinha(45);
		Figurinha figurinha3 = new Figurinha(69);
		Figurinha figurinha4 = new Figurinha(32);
		Figurinha figurinha5 = new Figurinha(24);
		Figurinha figurinha6 = new Figurinha(6);
		Figurinha figurinha7 = new Figurinha(6);
		Figurinha figurinha8 = new Figurinha(69);
		Figurinha figurinha9 = new Figurinha(56);
		
		Album minhasFigurinhas = new Album();
		minhasFigurinhas.addFigurinha(figurinha1);
		minhasFigurinhas.addFigurinha(figurinha2);
		minhasFigurinhas.addFigurinha(figurinha3);
		minhasFigurinhas.addFigurinha(figurinha4);
		minhasFigurinhas.addFigurinha(figurinha5);
		minhasFigurinhas.addFigurinha(figurinha6);
		minhasFigurinhas.addFigurinha(figurinha7);
		minhasFigurinhas.addFigurinha(figurinha8);
		minhasFigurinhas.addFigurinha(figurinha9);
		
		minhasFigurinhas.exibirAlbum();
		System.out.println("No álbum, existem " + minhasFigurinhas.getNumeroFigurinhas() + " figurinhas.");
		

	}

}
