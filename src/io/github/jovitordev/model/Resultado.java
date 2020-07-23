package io.github.jovitordev.model;

public class Resultado {
	private double resultado;
	private String nmsubproduto;

	public Resultado(double resultado, String nmsubproduto) {
		this.resultado = resultado;
		this.nmsubproduto = nmsubproduto;
	}

	@Override
	public String toString() {
		return "Resultado [resultado=" + resultado + ", nmsubproduto=" + nmsubproduto + "]";
	}

	public Resultado() {
	}

	public Resultado(double d) {
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getNmsubproduto() {
		return nmsubproduto;
	}

	public void setNmsubproduto(String nmsubproduto) {
		this.nmsubproduto = nmsubproduto;
	}

}
