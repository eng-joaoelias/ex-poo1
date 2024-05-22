package lista4.test;

import lista4.classes.Triangulo;

public class TrianguloMain {

	public static void main(String[] args) {
		
		Triangulo T1 = new Triangulo();
		Triangulo T2 = new Triangulo();
		Triangulo T3 = new Triangulo();
		
		T1.setLado1(4);
		T1.setLado2(3);
		T1.setLado3(5);
		T1.setAngulo1(90);
		T1.setAngulo2(53.13010235);
		T1.setAngulo3(36.86989765);
		
	    T2.setLado1(6);
	    T2.setLado2(6);
	    T2.setLado3(6);
	    T2.setAngulo1(60);
	    T2.setAngulo2(60);
	    T2.setAngulo3(60);

	    T3.setLado1(7);
	    T3.setLado2(8);
	    T3.setLado3(10);
	    T3.setAngulo1(20);
	    T3.setAngulo2(56);
	    T3.setAngulo3(104);
	    
	    //Verificando se forma triangulo
	    System.out.println(T1.isTriangulo()); //true
	    System.out.println(T2.isTriangulo()); //true
	    System.out.println(T3.isTriangulo()); //true
	    

	    //Verificando quais sao triangulos retangulos
	    System.out.println(T1.isRetangulo()); //true
	    System.out.println(T2.isRetangulo()); //false
	    System.out.println(T3.isRetangulo()); //false

	}

}
