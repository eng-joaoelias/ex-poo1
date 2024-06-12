package semana05lista02.main;

import semana05lista02.classes.*;

public class Main {

	public static void main(String[] args) {

		AVista p1 = new AVista(7689.90);
		
		p1.setDesconto(12);
		
		//p1.exibirValorAVista();
		
		Parcelado p2 = new Parcelado(9659.99);
		p2.setNumParcelas(10);
		p2.setJurosParcela(3);
		p2.exibirValorParcelado();

	}

}
