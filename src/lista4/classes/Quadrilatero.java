package lista4.classes;

public class Quadrilatero {
	private double lado1, lado2, lado3, lado4;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	
	public boolean isQuadrilatero() {
	    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado4 <= 0) {
	    	throw new IllegalArgumentException("Todos os lados devem ser maiores que zero.");
	    }
	    
	    if ((lado1 == lado2 && lado3 == lado4) || (lado1 == lado4 && lado2 == lado3)) {
	        // Retângulo
	        return true;
	    }
	    
	    return false;

	}
	
	public boolean isQuadrado() {
		if (isQuadrilatero()) {
			if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
		        // Quadrado
		        return true;
		    }
		}
		return false;
	}

}
