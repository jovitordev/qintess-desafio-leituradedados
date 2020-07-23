package io.github.jovitordev.model;

public class Produto {
	private String subProduto;
	private Integer idPreco;
	private Double quantidade;
	private long prazo;

	@Override
	public String toString() {
		return "Produto [subProduto=" + subProduto + ", idPreco=" + idPreco + ", quantidade=" + quantidade + ", prazo="
				+ prazo + "]";
	}

	public Produto(String subProduto, double quantidade, long prazo, int idPreco) {
		this.subProduto = subProduto;
		this.quantidade = quantidade;
		this.prazo = prazo;
		this.idPreco = idPreco;
	}

	public Produto(Integer idPreco) {
		this.idPreco = idPreco;

	}

	public Produto(Integer idPreco2, Double quantidade2) {
		this.quantidade = quantidade2;
		this.idPreco = idPreco2;
	}

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public String getSubProduto() {
		return subProduto;
	}

	public void setSubProduto(String subProduto) {
		this.subProduto = subProduto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public long getPrazo() {
		return prazo;
	}

	public void setPrazo(long prazo) {
		this.prazo = prazo;
	}

	public int getIdPreco() {
		return idPreco;
	}

	public void setIdPreco(int idPreco) {
		this.idPreco = idPreco;
	}

}
