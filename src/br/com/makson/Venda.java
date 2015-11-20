package br.com.makson;

public class Venda {
	private String num_venda;
	private String client;
	private String vendedor;
	private String produto;
	private int quantidade; 
	
	public String getNum_venda() {
		return num_venda;
	}
	public void setNum_venda(String num_venda) {
		this.num_venda = num_venda;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
