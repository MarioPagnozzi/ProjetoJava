package br.edu.infnet.mario.pagnozzi.model.domain;

public class Imovel {
	
	private String descricao;
	private String cep;
	private Integer idade;
	private boolean locacao;
	private boolean venda;
	private float vlr_locacao;
	private float vlr_venda;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public boolean isLocacao() {
		return locacao;
	}
	public void setLocacao(boolean locacao) {
		this.locacao = locacao;
	}
	public boolean isVenda() {
		return venda;
	}
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	public float getVlr_locacao() {
		return vlr_locacao;
	}
	public void setVlr_locacao(float vlr_locacao) {
		this.vlr_locacao = vlr_locacao;
	}
	public float getVlr_venda() {
		return vlr_venda;
	}
	public void setVlr_venda(float vlr_venda) {
		this.vlr_venda = vlr_venda;
	}
	
	

}
