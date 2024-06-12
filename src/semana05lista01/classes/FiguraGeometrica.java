package semana05lista01.classes;

public class FiguraGeometrica {
	
	private int numLados;
	private double[] lados;
	
	public FiguraGeometrica(int numLados) {
		this.numLados = numLados;
		lados = new double[numLados];
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}
	
	@SuppressWarnings("unused")
	public double calcularPerimetro() {
		double perimetro = 0;
		for (double d : this.lados) {
			perimetro = perimetro + d;
		}
		
		return perimetro;

	}
	
	public void exibirLados() {
		for (double d : lados) {
			System.out.println(d);
		}
		
	}
	
}
