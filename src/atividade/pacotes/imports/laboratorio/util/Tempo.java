package atividade.pacotes.imports.laboratorio.util;

public class Tempo {
	int h, min, s;
	
	public Tempo(int h, int min, int s) {
		super();
		this.setH(h);
		this.setMin(min);
		this.setS(s);
	}

	public int getH() {
		return this.h;
	}

	public void setH(int h) {
		if (h>=0 && h <= 23) {
			this.h = h;
		} else {
			System.out.println("Valor de horas inválido.");
		}
	}

	public int getMin() {
		return this.min;
	}

	public void setMin(int min) {
		if (min >= 0 && min <= 59) {
			this.min = min;
		} else {
			System.out.println("Valor de minutos inválido.");
		}
	}

	public int getS() {
		return this.s;
	}

	public void setS(int s) {
		if (s >= 0 && s <= 59) {
			this.s = s;
		} else {
			System.out.println("Valor de segundos inválido.");
		}
	}
	
	public void exibirTempo() {
		System.out.print(this.getH() + ':' + this.getMin() + ':' + this.getS());
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", this.getH(), this.getMin(), this.getS());
	}
	
	
}
