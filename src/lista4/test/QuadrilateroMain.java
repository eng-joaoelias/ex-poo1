package lista4.test;

import lista4.classes.Quadrilatero;

public class QuadrilateroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrilatero quadrilatero = new Quadrilatero();
		
		quadrilatero.setLado1(3);
		quadrilatero.setLado2(5);
		quadrilatero.setLado3(5);
		quadrilatero.setLado4(3);
		
		System.out.println(quadrilatero.isQuadrilatero()); //eh retangulo
		System.out.println(quadrilatero.isQuadrado()); //nao eh quadrado
	}

}
