package lista4.classes;

public class Triangulo {

	private double lado1, lado2, lado3;
	private double angulo1, angulo2, angulo3;

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

	public double getAngulo1() {
		return angulo1;
	}

	public void setAngulo1(double angulo1) {
		this.angulo1 = angulo1;
	}

	public double getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(double angulo2) {
		this.angulo2 = angulo2;
	}

	public double getAngulo3() {
		return angulo3;
	}

	public void setAngulo3(double angulo3) {
		this.angulo3 = angulo3;
	}
	
	public boolean isTriangulo() {
		return (Math.abs(this.lado2 - this.lado3) < lado1 && this.lado1 < this.lado2 + this.lado3) || ((Math.abs(this.lado1 - this.lado3) < lado2 && this.lado2 < this.lado1 + this.lado3)) || (Math.abs(this.lado1 - this.lado2) < lado3 && this.lado3 < this.lado1 + this.lado2);
	}

	public boolean isRetangulo() {
		
		if (isTriangulo()) {
			if (angulo1 + angulo2 + angulo3 != 180) {
				return false;
			}

			return (lado3 * lado3 == lado1 * lado1 + lado2 * lado2) && (angulo1 == 90 || angulo2 == 90 || angulo3 == 90);
		}
		
		return false;
	}

}
