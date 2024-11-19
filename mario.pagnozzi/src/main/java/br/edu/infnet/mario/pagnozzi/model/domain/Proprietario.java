package br.edu.infnet.mario.pagnozzi.model.domain;

import java.time.LocalDateTime;

public class Proprietario {
	
	private String nome;
	private String estadoCivil;
	private String cpf;
	private LocalDateTime dt_nascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDateTime getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(LocalDateTime dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
	

}
