package semana05lista01.main;

import semana05lista01.classes.*;

public class Main {

	public static void main(String[] args) {
		
		Quadrilatero quad = new Quadrilatero();
		double[] ladosQuadrilatero = new double[] {20, 10, 10, 20};
		quad.setLados(ladosQuadrilatero);
		
		Triangulo triang = new Triangulo();
		double[] ladosTriangulo = new double[] {10, 10, 10};
		triang.setLados(ladosTriangulo);
		
		System.out.println("Lados do triangulo:");
		triang.exibirLados();
		System.out.println("Lados do quadrilatero:");
		quad.exibirLados();
		
		System.out.println("Perimetro do triangulo>>" + triang.calcularPerimetro());
		System.out.println("Perimetro do quadrilatero>>" + quad.calcularPerimetro());
	}

}
