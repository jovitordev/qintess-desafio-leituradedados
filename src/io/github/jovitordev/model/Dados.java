package io.github.jovitordev.model;

public class Dados {
	private double preco;
	private int quantidade;
	private double resultado;
	private Integer idPreco;
	private long nu_prazo;

	public Dados(double preco, int quantidade, double resultado, Integer idPreco, long nu_prazo) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.resultado = resultado;
		this.idPreco = idPreco;
		this.nu_prazo = nu_prazo;
	}

	public Dados(Double preco) {
		this.preco = preco;
	}

	public Dados(Integer nu_prazo) {
		this.nu_prazo = nu_prazo;
	}

	public Dados(long nu_prazo2) {
		// TODO Auto-generated constructor stub
	}

	public Dados(Integer idpreco2, long nu_prazo2) {
		// TODO Auto-generated constructor stub
		this.idPreco = idpreco2;
		this.nu_prazo = nu_prazo2;

	}

	public Dados() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dados [preco=" + preco + ", quantidade=" + quantidade + ", resultado=" + resultado + ", idPreco="
				+ idPreco + ", nu_prazo=" + nu_prazo + "]";
	}

	public Dados(double preco, Integer idPreco, long nu_prazo) {
		super();
		this.preco = preco;
		this.idPreco = idPreco;
		this.nu_prazo = nu_prazo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public Integer getIdPreco() {
		return idPreco;
	}

	public void setIdPreco(Integer idPreco) {
		this.idPreco = idPreco;
	}

	public long getNu_Prazo() {
		return nu_prazo;
	}

	public void setNu_Prazo(long nu_prazo) {
		this.nu_prazo = nu_prazo;
	}

}
