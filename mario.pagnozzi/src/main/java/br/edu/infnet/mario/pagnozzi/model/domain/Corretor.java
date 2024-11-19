package br.edu.infnet.mario.pagnozzi.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="TCorretor")
public class Corretor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	

	@NotBlank(message = "Nome é obrigatório")
	@Size(max = 100, message = "Nome não pode ter mais que 100 caracteres")
	private String nome;
	private String creci;
	private String uf_creci;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCreci() {
		return creci;
	}
	public void setCreci(String creci) {
		this.creci = creci;
	}
	public String getUf_creci() {
		return uf_creci;
	}
	public void setUf_creci(String uf_creci) {
		this.uf_creci = uf_creci;
	}
	
	

}
